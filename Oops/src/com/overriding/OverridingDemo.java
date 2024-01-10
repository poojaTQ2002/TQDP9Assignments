package com.overriding;
class Person
{
   void display()
   {
	   System.out.println("I am a person");
   }

}

class Employee extends Person
{
    @Override
   public void display()  // same or increase the visibility
   {
    	super.display();
	   System.out.println("I am a employee");
   }

}

public class OverridingDemo {
	
	public static void main(String[] args) {
		
		Person p1= new Person();
		p1.display();
		
		
		Employee e1= new Employee();
		e1.display();
		
	}

}
