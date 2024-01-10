package com.containment;

public class EmployeeInformation
{
    public static void main(String[] args) 
    {
		Department2 d=new Department2(101,"Testing");
		Department2 d1=new Department2(102,"Finance");
		Department2 d2=new Department2(103,"IT");
		Department2 d3=new Department2(104,"Marketing");
		Department2 d4=new Department2(105,"Production");
		
		MyDate m1=new MyDate(07,"February",2002);
		MyDate m2=new MyDate(26,"March",2013);
		MyDate m3=new MyDate(17,"July",2005);
		MyDate m4=new MyDate(13,"September",1999);
		MyDate m5=new MyDate(10,"June",1975);
		
		Employee2 e=new Employee2(01,"Pooja",d1,m1);
		Employee2 e1=new Employee2(02,"Supriya",d3,m4);
		Employee2 e2=new Employee2(03,"Ram",d1,m5);
		Employee2 e3=new Employee2(04,"Rakesh",d4,m3);
		Employee2 e4=new Employee2(05,"Radha",d3,m2);
		Employee2 e5=new Employee2(06,"Monish",d2,m5);
		
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		
		
		
	}
}
