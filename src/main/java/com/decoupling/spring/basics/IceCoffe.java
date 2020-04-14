package com.decoupling.spring.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.decoupling.spring.basics.services.CoffeInterface;


@Component
@Qualifier("ice")
public class IceCoffe implements CoffeInterface {

	public String Dispatch() {
		return "Ice Coffe !!!";
	}
}
