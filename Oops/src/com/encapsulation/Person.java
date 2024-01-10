package com.encapsulation;

public class Person 
{

	String Pname;
	int age;
  public static void main(String[] args)
  {
		Person p1=new Person();
		p1.Pname=("Pooja");
		p1.age=20;
		System.out.println("name :"+p1.Pname+" "+ "age :"+p1.age);
		Person p2=new Person();
		p2.age=30;
		System.out.println("name :"+p2.Pname+" "+ "age :"+p2.age);
		
  }
}
