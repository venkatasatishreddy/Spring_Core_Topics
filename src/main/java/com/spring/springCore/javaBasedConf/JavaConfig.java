package com.spring.springCore.javaBasedConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.springCore.javaBasedConf")
public class JavaConfig {
	
	@Bean
	public Company getCompany() {
		Company c = new Company();
		return c;
	}
}
