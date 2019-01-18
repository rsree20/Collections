package com.collections.list;

public class Employee implements Comparable<Employee> {
	
	@Override
	public int compareTo(Employee emp) {
		
		return this.empSal.compareTo(emp.empSal);
		
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId+" : "+empName+" : "+empSal;
	}
	
	
	
	
	/*static int hashCalledCount =0;
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
	
*/
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empSal == null) ? 0 : empSal.hashCode());
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
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empSal == null) {
			if (other.empSal != null)
				return false;
		} else if (!empSal.equals(other.empSal))
			return false;
		return true;
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
