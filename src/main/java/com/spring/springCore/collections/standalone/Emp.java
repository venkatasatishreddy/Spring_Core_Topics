package com.spring.springCore.collections.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private List<String> names;
	private Map<Integer, String> techs;
	
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Map<Integer, String> getTechs() {
		return techs;
	}
	public void setTechs(Map<Integer, String> techs) {
		this.techs = techs;
	}
	
	@Override
	public String toString() {
		return "Emp [names=" + names + ", techs=" + techs + "]";
	}	
	
}
