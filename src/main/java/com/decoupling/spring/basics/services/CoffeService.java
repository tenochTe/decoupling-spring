package com.decoupling.spring.basics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CoffeService {
	
	@Autowired
	@Qualifier("hot")
	private CoffeInterface coffeInterfaceHot;
	
	@Autowired
	@Qualifier("ice")
	private CoffeInterface coffeInterfaceIce;
	
	
	public String OrederCoffeHot(int glasses) {
		
		String coffe = this.coffeInterfaceHot.Dispatch();
		
		return String.valueOf(glasses).concat(" - ").concat(coffe);
		
	}
	
	public String OrederCoffeIce(int glasses) {
		
		String coffe = this.coffeInterfaceIce.Dispatch();
		
		return String.valueOf(glasses).concat(" - ").concat(coffe);
		
	}

}
