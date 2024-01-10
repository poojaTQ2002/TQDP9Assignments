package com.staticDemo;

public class Company 
{
public static void main(String[] args) {
		
		//System.out.println(Employee.companyName);
		System.out.println(Employee.getCompanyName());

		Employee e1= new Employee(101, "Reetu",23000);
		Employee e= new Employee();
		//System.out.println(Employee.companyName);
		
		System.out.println(e);
		System.out.println(e1);
		
		//e.setCompanyName("Infosys");  // Warning,  it is not an error
		
		Employee.setCompanyName("Infosys");
		
		System.out.println(e);
		System.out.println(e1);
		
		System.out.println("Number of employees:"+Employee.empCount);
		
		
	}

}


