package com.abr.formationspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories(basePackages = "com.abr.formationspring.core.repository")
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

/*	@Bean
	public Hibernate5Module datatypeHibernateModule() {
		return new Hibernate5Module();
	}*/

}
