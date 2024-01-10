package com.Inheritance;
class Bird
{  
	Bird()
	{
		System.out.println("Bird Default constructor....");
		
	}
    void eat()
    {
    	System.out.println("eating...");
	}  
 }  
    class Sparrow extends Bird
   {  
       void eat()
    {
    	System.out.println("eating seeds...");
	}  
       void flying(){System.out.println("flying...");}  
       void work()
          {  
     
                super.eat();  
                 flying();  
          }  
}  
class SupperAssignment2 
{
public static void main(String args[])
{  
Sparrow s=new Sparrow();  
s.work();  
}
}  
