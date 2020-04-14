package com.decoupling.spring.scopes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.decoupling.spring.scopes.services.JdbcConnection;

@Component
public class PetServiceImpl implements PetService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PetServiceImpl.class);
	
	@Autowired
	private JdbcConnection jdbcConnection;

	@Override
	public void newRegister() {
		LOGGER.info( "PROTOTYEPE BEAN: {} - {}", jdbcConnection, jdbcConnection.create() );
	}

	@Override
	public void deleteRegister() {
		LOGGER.info( "PROTOTYEPE BEAN: {} - {}", jdbcConnection, jdbcConnection.delete() );
	}

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	

}
