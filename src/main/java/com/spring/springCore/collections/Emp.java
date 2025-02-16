package com.spring.springCore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> address;
	private Set<String> phoneNum;
	private Map<String, String> technologies;
	private Properties props;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Set<String> getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(Set<String> phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Map<String, String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(Map<String, String> technologies) {
		this.technologies = technologies;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + ", phoneNum=" + phoneNum + ", technologies="
				+ technologies + ", props=" + props + "]";
	}
	
	
}
