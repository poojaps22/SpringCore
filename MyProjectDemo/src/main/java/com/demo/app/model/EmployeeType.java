package com.demo.app.model;

public class EmployeeType {
	
	private String empType;

	public EmployeeType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeType(String empType) {
		super();
		this.empType = empType;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	@Override
	public String toString() {
		return empType;
	}

}
