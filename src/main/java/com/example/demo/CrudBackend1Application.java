package com.example.demo;

import com.vermeg.dependencymanagement.controller.RegisterController;
import com.vermeg.dependencymanagement.entity.Application;
import com.vermeg.dependencymanagement.repository.AppRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.vermeg.dependencymanagement")
@ComponentScan(basePackageClasses= RegisterController.class)
@EnableJpaRepositories(basePackages = "com.vermeg.dependencymanagement.repository")
@EntityScan(basePackages = "com.vermeg.dependencymanagement.entity")
public class CrudBackend1Application {



	public static void main(String[] args) {
		SpringApplication.run(CrudBackend1Application.class, args);
	}


}
