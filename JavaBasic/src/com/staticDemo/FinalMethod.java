package com.staticDemo;
class Bike1
{  
	  final void run()
	  {
		  System.out.println("running");
	  }  
}  
	     
	class Honda extends Bike1
	{  
	  
	   {
		   System.out.println("running safely with 100kmph");
		}  
	     
	   public static void main(String args[])
	   {  
	   Honda honda= new Honda();  
	   honda.run();  
	   }  
	}  

