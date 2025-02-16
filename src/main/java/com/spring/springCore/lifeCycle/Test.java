package com.spring.springCore.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springCore/lifeCycle/config.xml");
//		Item e = context.getBean("item", Item.class);
//		System.out.println(e);	
//		registering shutsownhook
		context.registerShutdownHook();
		
		
//		Item1 e1 = context.getBean("item1", Item1.class);
//		System.out.println(e1);
		
		Item2 e2 = context.getBean("item2", Item2.class);
		System.out.println(e2);
		
	}

}
