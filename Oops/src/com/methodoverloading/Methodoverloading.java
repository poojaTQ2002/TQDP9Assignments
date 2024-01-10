package com.methodoverloading;

public class Methodoverloading 
{
   public void methodTest(Object object)
   {
	   System.out.println("Calling object method");
   }
   public void methodTest( String object)
   {
	   System.out.println("Calling string method");
   }
   public static void main(String[] args) 
   {
	   Methodoverloading md1=new Methodoverloading();
	   md1.methodTest(null);
   }
}
