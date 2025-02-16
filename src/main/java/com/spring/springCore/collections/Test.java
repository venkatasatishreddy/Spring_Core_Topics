package com.spring.springCore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springCore/collections/collectionConfig.xml");
		Emp e = context.getBean("emp", Emp.class);
		System.out.println(e);
		System.out.println(e.getAddress().getClass().getName()); // ArrayList
		System.out.println(e.getPhoneNum().getClass().getName()); // LinkedHashSet
		System.out.println(e.getTechnologies().getClass().getName()); // LinkedHashMap		
		
	}

}
