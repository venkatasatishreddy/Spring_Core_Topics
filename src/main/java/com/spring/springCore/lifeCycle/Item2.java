package com.spring.springCore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Item2 {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("set method");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [price=" + price + "]";
	}
	
	@PostConstruct
	public void hello() {
		System.out.println("Hello");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("Bye");
	}
}
