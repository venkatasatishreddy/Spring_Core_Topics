package com.spring.springCore.ci;

public class Employee {
	private int empId;
	private String empName;
	Profetional profetional;
	

	public Employee(int empId, String empName, Profetional profetional) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.profetional = profetional;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", profetional=" + profetional + "]";
	}	
	

}
