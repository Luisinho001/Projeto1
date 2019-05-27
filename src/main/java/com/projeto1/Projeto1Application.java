package com.projeto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Projeto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Projeto1Application.class, args);
	}
	
	/*
	@Component
	public class DataInitilizer implements ApplicationListener<ContextRefreshedEvent>{

		@Override
	    public void onApplicationEvent(ContextRefreshedEvent event) {
	        System.out.println("Context refreshed");
	    }

	}
	*/
}
