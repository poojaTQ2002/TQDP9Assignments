package com.containment;

public class PersonDataLab 
{
	public static void main(String[] args)
	{
		AddressLab a1=new AddressLab(101,"Pune",410504);
		AddressLab a2=new AddressLab(102,"Aurangabad",431530);
		AddressLab a3=new AddressLab(103,"Goregaon",431703);
		AddressLab a4=new AddressLab(104,"Latur",413512);
		AddressLab a5=new AddressLab(105,"Beed",431122);
		
		
		
		PersonLab p1=new PersonLab("Pooja",21,"pooja@2002",a1);
		PersonLab p2=new PersonLab("Joti",31,"joti@3002",a2);
		PersonLab p3=new PersonLab("Monoj",25,"manoj@1975",a3);
		PersonLab p4=new PersonLab("Priti",32,"priti@1902",a4);
		PersonLab p5=new PersonLab("Prince",40,"prince@5214",a5);
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		

		
		
	}
  
}
