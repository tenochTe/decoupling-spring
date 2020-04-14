package com.decoupling.spring.scopes.services;

public interface JdbcConnectionService {
	
	String create();
	
	String read();
	
	String update();
	
	String delete();

}
