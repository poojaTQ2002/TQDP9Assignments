package com.staticDemo;

public class Accessstatic
{
   int x=10;
   static int y=20;
   void instanceMethod()
   {
	   System.out.println(x);
	   System.out.println(y);
	   staticMethod();
	   
   }
     static void staticMethod()
     {
    	 System.out.println(y);
    	 Accessstatic obj1=new Accessstatic();
    	 System.out.println(obj1.x);
     }
     public static void main(String[] args) 
     {
		staticMethod();
	}
}
