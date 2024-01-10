package com.staticDemo;
class Parent2 { 
    
    final void display()
    { 
        System.out.println("I am Parent class"); 
         
    } 
} 
class Child2 extends Parent2 { 
 

    { 
        System.out.println("I am Child class"); 
       
    } 
} 


public class CheckFinalMethod 
{
	 
	    public static void main(String[] args) 
	    { 
	        Child2 c = new Child2(); 
	        c.display();
	    } 
}
