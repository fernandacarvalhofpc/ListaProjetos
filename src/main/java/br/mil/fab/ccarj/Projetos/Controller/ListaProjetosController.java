package br.mil.fab.ccarj.Projetos.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.mil.fab.ccarj.Projetos.Modelo.Projeto;
import br.mil.fab.ccarj.Projetos.Repository.ProjetoRepository;

@Controller
public class ListaProjetosController{
	
	@Autowired
	private ProjetoRepository projetorepository;
	
	@RequestMapping("/")
	public ModelAndView listarProjeto() {
		
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("projeto", projetorepository.findAll());
		
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "**/listarprojeto")
	public ModelAndView listarProjetoPorNome(@RequestParam ("nomepesquisa") String nomepesquisa) {
		
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("projeto", projetorepository.findByNome(nomepesquisa));
		
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "**/cadastroprojeto")
	public ModelAndView cadastrarProjeto(Projeto projeto) {
			
			ModelAndView mv = new ModelAndView("projeto/cadastroprojeto");
			mv.addObject("projeto", new Projeto());
			
			return mv;
				
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "**/salvarprojeto")
	public ModelAndView salvarProjeto(@Validated Projeto projeto, BindingResult result) {
		
		if(result.hasErrors()) {
			ModelAndView mv = new ModelAndView("projeto/cadastroprojeto");
			mv.addObject("projeto", new Projeto());
			
			
			List<String> msg = new ArrayList<String>();
			for (ObjectError object : result.getAllErrors()) {
				msg.add(object.getDefaultMessage());
			}
			mv.addObject("msg", msg);
			return mv;
		}
		
		projetorepository.save(projeto);
		
		
		return listarProjeto();
	}

	
	
	@RequestMapping(method=RequestMethod.GET, value = "**/alteraprojeto/{codigo}")
	public ModelAndView editar(@PathVariable("codigo") Long codigo) {
		
		Optional<Projeto> projeto = projetorepository.findById(codigo);
		
		ModelAndView mv = new ModelAndView("projeto/alteraprojeto");
		mv.addObject("projeto", projeto.get());
		
		return mv;
		
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "**/deletaprojeto/{codigo}")
	public ModelAndView remover(@PathVariable("codigo") Long codigo) {
		
		projetorepository.deleteById(codigo);
		
		return listarProjeto();
	}
	

	
}