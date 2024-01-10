package com.loosecoupling;
abstract class Student
{
   int id;
   String name;
   
   Student()
   {
	   
   }
  
   Student(int id,String name)
   {
	   this.id=id;
	   this.name=name;
   }

   abstract void display();
   
}

class SchoolStudent extends Student
{
	public SchoolStudent() {
		
	}

	SchoolStudent(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void display() {

      System.out.println("I am a school student");
		
	}
	

}

class CollegeStudent extends Student
{

	CollegeStudent(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void display() {

      System.out.println("I am a college student");
		
	}
	

}

public class AbstractClass {
	
	void displayDetails(Student s)
	{
		System.out.println(s.id+" "+s.name);
		s.display();
	}
	
	public static void main(String[] args) {
		
		AbstractClass obj1= new AbstractClass();
		
		Student s1;
		s1= new SchoolStudent(101, "Pooja");
		obj1.displayDetails(s1);
		
		s1= new CollegeStudent(100, "Arpita");
		obj1.displayDetails(s1);
		
	
		
	}

}
