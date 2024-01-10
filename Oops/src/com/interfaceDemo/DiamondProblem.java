package com.interfaceDemo;

interface Student1
{
  void show();	
  
  default void display()
  {
	  System.out.println("I am a student ");
  }

}

interface Teacher
{
   void show();
   
   default void display()
   {
 	  System.out.println("I am a teacher ");
   }


}

public class DiamondProblem implements Student1,Teacher{
	
	@Override
	public void show() {
		
		System.out.println("School Name: Heritage School");
	}
	
	@Override
	public void display() {
		
	  //System.out.println("In the school");
		Student1.super.display();
		Teacher.super.display();
		
	}

	public static void main(String[] args) {
		
		DiamondProblem d1= new DiamondProblem();
		d1.show();
		d1.display();
		
	}

	

}

