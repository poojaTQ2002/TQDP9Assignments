package com.containment;

public class Company 
{ 
	public static void main(String[] args)
	{
		Department d1=new Department(01,"Technical");
		   Department d2=new Department(02,"Testing");
		   Department d3=new Department(03,"Marketing");
		   Department d4=new Department(04,"Finance");
		   
		   
		   Employee e1=new Employee(101,"Pooja",d1);
		   Employee e2=new Employee(102,"Ali",d2);
		   Employee e3=new Employee(103,"Joy",d4);
		   Employee e4=new Employee(104,"Numita",d3);
		   Employee e5=new Employee(105,"Shreya",d2);
		   
		   System.out.println(e1);
		   System.out.println(e2);
		   System.out.println(e3);
		   System.out.println(e4);
		   System.out.println(e5);
		   
		   
		
	}
   
   
   
}
