package com.demo.app.model;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable,Comparable<Employee>{
	
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	private EmployeeType et;
	private Project p;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int employeeId, String employeeName, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public EmployeeType getEt() {
		return et;
	}

	public void setEt(EmployeeType et) {
		this.et = et;
	}

	public Project getP() {
		return p;
	}

	public void setP(Project p) {
		this.p = p;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName, employeeSalary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& employeeSalary == other.employeeSalary;
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String toString() {
		
		if(p==null || et==null)
		{
			return "EmployeeId = " + employeeId + "\nEmployeeName = " + employeeName + "\nEmployeeSalary = "
					+ employeeSalary + "\nEmployeeType = Not Assigned \nProject Assigned = Not Assigned" + p;
		}
		return "EmployeeId = " + employeeId + "\nEmployeeName = " + employeeName + "\nEmployeeSalary = "
				+ employeeSalary + "\nEmployeeType = " + et + "\nProject Assigned = " + p;
	}
	
	

}
