package com.spring.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Employee e = (Employee) context.getBean("emp");
    	
    	Employee e1 = context.getBean("emp1", Employee.class);
        System.out.println(e);
        System.out.println(e1);
        
        
    }
}
