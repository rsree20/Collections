package com.clone;

public class TestCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee emp1 = new Employee(10, "Srikanth", "20K", "CTS", "SE");
		Passport p1 = new Passport();
		p1.setLocation("Hyderabad");
		p1.setPpNumber("ZZ2121");
		emp1.setPp(p1);
		
		
		Employee emp2 = emp1.clone();
		
		emp2.setEmpId(20);
		emp2.setEmpName("Srinivas");
		emp2.getPp().setPpNumber("K1521552");
		
		System.out.println(emp1);
		System.out.println("Emp1 passport details are: "+emp1.getPp());
		System.out.println(emp2);
		System.out.println("Emp2 passport details are: "+emp2.getPp());
		
	}

}

class Employee implements Cloneable{
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId+" "+empName+" "+empSal+" "+empCompany+" "+empDesignation;
	}
	
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		Employee empCopy = (Employee) super.clone();
		Passport ppCopy = pp.clone();
		empCopy.setPp(ppCopy);
		return empCopy;
	}
	
	
	public Employee(Integer empId, String empName, String empSal, String empCompany, String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empCompany = empCompany;
		this.empDesignation = empDesignation;
	}
	private Integer empId;
	private String empName;
	private String empSal;
	private String empCompany;
	private String empDesignation;
	
	private Passport pp;
	
	
	
	
	public Passport getPp() {
		return pp;
	}


	public void setPp(Passport pp) {
		this.pp = pp;
	}


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
	public String getEmpCompany() {
		return empCompany;
	}
	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
}

class Passport implements Cloneable{
	
	@Override
	protected Passport clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Passport) super.clone();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ppNumber+" "+location;
	}
	
	private String ppNumber;
	private String location;
	public String getPpNumber() {
		return ppNumber;
	}
	public void setPpNumber(String ppNumber) {
		this.ppNumber = ppNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}







