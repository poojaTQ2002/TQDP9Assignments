package com.Inheritance;
class Parent1
{
	int num=10;
	Parent1()
	{
		System.out.println("In Parent Default Constructor");
	}
	Parent1(int num)
	{
		this.num=num;
	}
	   void display()
	   {
		   System.out.println("Parent class :");
		   System.out.println("value :"+num);
	   }
}
class Child1 extends Parent1
	{
		int num=20;
		Child1()
		{
			System.out.println("In child default constructor");
		}
		Child1 (int num)
		{
		   this.num=num;	
		}
		void display()
		{
			System.out.println("In child class");
			System.out.println("value:"+num);
			System.out.println("Invoked parent method :");
			super.display();
			System.out.println("Invoking Parent variable :"+super.num);
			
		}
   }
class Person
{
	String name;
	int age;
	Person()
	{
		System.out.println("In Person default constructor");
	}
	Person(int age, String name)
	{
		this.name=name;
		this.age=age;
		System.out.println("In Person para constructor");
	}
	void show()
	{
		System.out.println("Person name :"+this.name);
		System.out.println("Person age:"+this.age);
	}
}

public class SuperDemoLab 
{
   public static void main(String[] args) 
   {
	  Child1 c1=new Child1();
	  c1.display();
	  Person p=new Person();
	  p.show();
   }
}
