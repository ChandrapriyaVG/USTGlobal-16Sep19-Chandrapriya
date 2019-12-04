package com.ustglobal.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
//1

public class OrmConfig {

	public LocalEntityManagerFactoryBean getBean() {
		LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("employee-unit");
		return bean;
	}
}
