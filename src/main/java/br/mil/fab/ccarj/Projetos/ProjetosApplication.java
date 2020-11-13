package br.mil.fab.ccarj.Projetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan( basePackages = "br.mil.fab.ccarj.Projetos.Modelo")
@ComponentScan( basePackages = { "br.mil.fab.ccarj.Projetos.*" })
@EnableJpaRepositories( basePackages = { "br.mil.fab.ccarj.Projetos.Repository" })
@EnableTransactionManagement
public class ProjetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetosApplication.class, args);
	}

}
