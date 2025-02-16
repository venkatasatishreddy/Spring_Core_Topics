package com.spring.springCore.javaBasedConf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Emp e = context.getBean("emp", Emp.class);
		System.out.println(e);	
		e.organization();		
	}
}
