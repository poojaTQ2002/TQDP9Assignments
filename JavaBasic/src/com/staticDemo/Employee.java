package com.staticDemo;

public class Employee 
{
		
	private int id;
	private String ename;
	private double salary;
	// static String companyName;
	//static String companyName="HCL";
	private static String companyName;
	
	static int empCount=0;
	
	// static block
	static
	{
		companyName="HCL";
	}
	
	// instance block
	{
		System.out.println("In instance block");
		//companyName="HCL";
		empCount++;
		
	}
	public Employee() {
		
		System.out.println("In constructor");
		//companyName="HCL";
	}


	public Employee(int id, String ename, double salary) {
		//this();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static void setCompanyName(String companyName)
	{
		Employee.companyName= companyName;
	}
	
	public static String getCompanyName()
	{
		return companyName;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", salary=" + salary + ", company=" + companyName+"]";
	}
}

