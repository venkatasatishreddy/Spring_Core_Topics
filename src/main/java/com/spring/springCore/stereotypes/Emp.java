package com.spring.springCore.stereotypes;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
@Component("e1")
public class Emp {
	@Value("Venky")
	private String name;
	@Value("HYD")
	private String city;
//	@Value("addr")
	@Value("#{addr}")	
	private List<String> address;
	
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
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", city=" + city + ", address=" + address + "]";
	}
}
