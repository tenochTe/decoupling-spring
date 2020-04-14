package com.decoupling.spring.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class CustomService {

	public CustomService() {
		
	}
}
