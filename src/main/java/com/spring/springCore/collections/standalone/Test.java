package com.spring.springCore.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springCore/collections/standalone/collectionConfig.xml");
		Emp e = context.getBean("emp", Emp.class);
		System.out.println(e);
		System.out.println(e.getNames().getClass().getName());
		System.out.println(e.getTechs().getClass().getName());
			
		
	}

}
