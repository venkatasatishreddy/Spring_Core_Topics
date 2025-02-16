package com.spring.springCore.stereotypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springCore/stereotypes/collectionConfig.xml");
		Emp e = context.getBean("e1", Emp.class);
		System.out.println(e);	
		
		System.out.println(e.hashCode());
		System.out.println(e.hashCode());
		
	}
}
