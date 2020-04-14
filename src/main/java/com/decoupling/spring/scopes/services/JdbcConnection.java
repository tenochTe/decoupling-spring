package com.decoupling.spring.scopes.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


/**
 * 
 * @author rak_z
 * Bean con proxy por Autowired. Debido a que la inyección de bean por depen ya que si no se configura un proxy con target por clase, este seguira siendo singleton 
 */


@Component
@Scope( value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
		proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection implements JdbcConnectionService {

	@Override
	public String create() {
		return "CREATING";
	}

	@Override
	public String read() {
		return "READING";
	}

	@Override
	public String update() {
		return "UPDATING";
	}

	@Override
	public String delete() {
		return "DELETING";
	}

}
