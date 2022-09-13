package com.cralex.primerpagina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PrimerpaginaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerpaginaApplication.class, args);
	}

}
