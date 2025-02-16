package com.spring.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springCore/ref/refConfig.xml");
		A a = context.getBean("aref", A.class);
		System.out.println(a);
		System.out.println(a.getB().getJ());
		
	}

}
