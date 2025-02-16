package com.spring.springCore.javaBasedConf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Emp {
	private String name;
	private String city;
	
	@Autowired
	private Company company;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	void organization(){
		company.name();
		System.out.println("Some Company");
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", city=" + city + "]";
	}
	
}
