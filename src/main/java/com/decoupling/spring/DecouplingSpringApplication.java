package com.decoupling.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.decoupling.spring.basics.services.CoffeService;
import com.decoupling.spring.scopes.CustomService;
import com.decoupling.spring.scopes.PetService;

@SpringBootApplication
public class DecouplingSpringApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DecouplingSpringApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext context 
			= SpringApplication.run(DecouplingSpringApplication.class, args);
		
		// Package Basics
		CoffeService coffeService = context.getBean(CoffeService.class);
			LOGGER.info( "COFFE SERVICE 1: {}", coffeService.OrederCoffeHot(12) );
			LOGGER.info( "COFFE SERVICE 2: {}", coffeService.OrederCoffeIce(6) );
			
		
		PetService petService1 = context.getBean(PetService.class);
			LOGGER.info( "SINGLETON BEAN-1 {}", petService1);
			petService1.newRegister();
		PetService petService2 = context.getBean(PetService.class);
			LOGGER.info( "SINGLETON BEAN-2 {}", petService2);
			petService2.deleteRegister();
			
		CustomService custom1 = context.getBean(CustomService.class);
			LOGGER.info( "SIMPLE PROTOTYPE BEAN-1 {}", custom1);
		CustomService custom2 = context.getBean(CustomService.class);
			LOGGER.info( "SIMPLE PROTOTYPE BEAN-2 {}", custom2);
			
	}

}
