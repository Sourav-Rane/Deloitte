package com;

public class Employee {
	private int employeeid;
	private String employeeName;
	
	
	public Employee() {
		
	}


	public int getEmployeeid() {
		return employeeid;
	}


	public Employee(int employeeid, String employeeName) {
		super();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
	}


	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + employeeid;
		return result;
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
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeeid != other.employeeid)
			return false;
		return true;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	
}
