package com.spring.springCore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Item1 implements InitializingBean, DisposableBean{
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
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initaialize bean");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy");
		
	}
}
