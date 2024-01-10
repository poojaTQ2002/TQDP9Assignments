package com.overriding;
class MyPerson
{
   void display()
   {
	   System.out.println("I am a person");
   }

}

class MyEmployee extends MyPerson
{
    @Override
   public void display()  // same or increase the visibility
   {
   	   System.out.println("I am a employee");
   }

    void show()
    {
    	System.out.println("Employee is showing skills");
    }
    
    
}

class MyCelebrity extends MyPerson
{
    @Override
   public void display()  // same or increase the visibility
   {
   	   System.out.println("I am a celebrity");
   }

    void show()
    {
    	System.out.println("Employee is showing movies and shows");
    }
    
    
}

public class DynamicMethodDispatch {
	
	public static void main(String[] args) {
		
		MyPerson p1= new MyPerson();
		p1.display();
		
		MyEmployee e1= new MyEmployee();
		e1.display();
		e1.show();
		
		///////////////////////////////
		System.out.println("-------------------------------------------");
		MyPerson p;
		
		p= new MyPerson();
		p.display();
		
		p= new MyEmployee();
		p.display();
		//p.show();
		
		p= new MyCelebrity();
		p.display();
		
	
		
		
	}

}

