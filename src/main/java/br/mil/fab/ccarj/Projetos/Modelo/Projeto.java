package br.mil.fab.ccarj.Projetos.Modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

@Entity
public class Projeto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long codigo;
	
	@NotNull 
	@NotBlank (message= "Nome não pode ser nulo")
	@NotEmpty (message= "Nome não pode ser vazio")
	@Column(unique=true, nullable = false, length = 60)
	private String nome;
	private String categoria;
	private String descricao;
	private String sigla;
	@NotNull
	@NotBlank (message= "Gerente não pode ser nulo")
	@NotEmpty (message= "Gerente não pode ser vazio")
	private String gerente;
	private String patrocinador;
	private String omsolicitante;
	private String omapoiadas;
	private String solicitante;
	private String requisitos;
	private String formasolicitacao;
	private String omresponsavel;
	private String sla;
	private String criticidade;
	private String prazoexecucao;
	
	public Projeto() {
	}
	
	

	public Projeto(String nome, String sigla, String gerente) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.gerente = gerente;
	}



	public Long getCodigo() {
		return codigo;
	}



	public void setCodigo(Long i) {
		this.codigo = i;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getSigla() {
		return sigla;
	}



	public void setSigla(String sigla) {
		this.sigla = sigla;
	}



	public String getGerente() {
		return gerente;
	}



	public void setGerente(String gerente) {
		this.gerente = gerente;
	}



	public String getPatrocinador() {
		return patrocinador;
	}



	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}



	public String getOmsolicitante() {
		return omsolicitante;
	}



	public void setOmsolicitante(String omsolicitante) {
		this.omsolicitante = omsolicitante;
	}



	public String getOmapoiadas() {
		return omapoiadas;
	}



	public void setOmapoiadas(String omapoiadas) {
		this.omapoiadas = omapoiadas;
	}



	public String getSolicitante() {
		return solicitante;
	}



	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}



	public String getRequisitos() {
		return requisitos;
	}



	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}



	public String getFormasolicitacao() {
		return formasolicitacao;
	}



	public void setFormasolicitacao(String formasolicitacao) {
		this.formasolicitacao = formasolicitacao;
	}



	public String getOmresponsavel() {
		return omresponsavel;
	}



	public void setOmresponsavel(String omresponsavel) {
		this.omresponsavel = omresponsavel;
	}



	public String getSla() {
		return sla;
	}



	public void setSla(String sla) {
		this.sla = sla;
	}



	public String getCriticidade() {
		return criticidade;
	}



	public void setCriticidade(String criticidade) {
		this.criticidade = criticidade;
	}



	public String getPrazoexecucao() {
		return prazoexecucao;
	}



	public void setPrazoexecucao(String prazoexecucao) {
		this.prazoexecucao = prazoexecucao;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	

}