package com.collections.list;

public class Employee {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId+" : "+empName+" : "+empSal;
	}
	
	static int hashCalledCount =0;
	@Override
	public int hashCode() {
		hashCalledCount++;
		System.out.println("hash code method called: "+hashCalledCount);
		return empId.hashCode()+empName.hashCode()+empSal.hashCode();
	}
	
	static int equalsCalledCount =0;
	
	@Override
	public boolean equals(Object obj) {
		equalsCalledCount++;
		System.out.println("equals method called: "+equalsCalledCount);
		if (obj instanceof Employee) {
			Employee employee = (Employee) obj;

			if (this.empId == employee.empId && this.empName.equals(employee.empName)
					&& this.empSal.equals(employee.empSal)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	

	
	
	public Employee(Integer empId, String empName, String empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}




	private Integer empId;
	private String empName;
	private String empSal;
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSal() {
		return empSal;
	}
	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
	
	
	
	
}
