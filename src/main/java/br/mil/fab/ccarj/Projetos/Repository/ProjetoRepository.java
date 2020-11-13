package br.mil.fab.ccarj.Projetos.Repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.mil.fab.ccarj.Projetos.Modelo.Projeto;

@Repository
@Transactional
public interface ProjetoRepository extends CrudRepository<Projeto, Long>{
	
	List<Projeto>findByNome(String nome);
}
