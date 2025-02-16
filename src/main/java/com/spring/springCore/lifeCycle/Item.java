package com.spring.springCore.lifeCycle;

public class Item {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("In side set method");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [price=" + price + "]";
	}
	
	private void init() {
		System.out.println("Init calling");

	}
	
	private void hi() {
		System.out.println("calling init as hi");
	}
	private void destroy() {
		System.out.println("Destroy");

	}

}
