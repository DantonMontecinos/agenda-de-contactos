package com.gestion.empleados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class },
					   scanBasePackages = {   
				       "com.gestion.empleados.repositorio",
				          
       
    }
		) 
public class AgendaContactosSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaContactosSpringbootApplication.class, args);
	}

}
