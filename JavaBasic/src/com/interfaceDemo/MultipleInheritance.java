package com.interfaceDemo;
@FunctionalInterface
interface Showable
{
   void display();
  // void printMe();
	
}

interface Printable
{
   void display();	
}

class Demo implements Showable,Printable
{

	@Override
	public void display() {
		
		System.out.println("Welcome");
		
		
	}
	

}

public class MultipleInheritance {
	
	public static void main(String[] args) {
		
		Demo d1= new Demo();
		d1.display();
	}

}
