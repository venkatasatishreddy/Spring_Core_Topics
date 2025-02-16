package com.spring.springCore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springCore/ci/ciconfig.xml");
//		Employee e = context.getBean("emp", Employee.class);
//		Employee e = context.getBean("emp1", Employee.class);
		Employee e = context.getBean("emp2", Employee.class);
		System.out.println(e);				
	}

}
