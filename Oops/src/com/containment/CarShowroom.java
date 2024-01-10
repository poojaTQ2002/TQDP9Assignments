package com.containment;

public class CarShowroom 
{
  public static void main(String[] args) 
  {
	  Car1 c1=new Car1(101,"Maruti",36000);
	   Car1 c2=new Car1(102,"Thor",40000);
	   Car1 c3=new Car1(103,"BMW",16000);
	   
	   Showroom s1=new Showroom(01,"Shiv",c1);
	   Showroom s2=new Showroom(02,"Motors Creation",c2);
	   Showroom s3=new Showroom(03,"Blueline",c3);
	   Showroom s4=new Showroom(04,"Hondai",c1);
	   Showroom s5=new Showroom(05,"Cazoo",c2);
	   
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s3);
	   System.out.println(s4);
	   System.out.println(s5);
	   
	   
  }
}
