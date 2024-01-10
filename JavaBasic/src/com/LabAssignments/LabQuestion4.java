package com.LabAssignments;
class A3
{
	static void methodOne()
	{
		System.out.println("AAA");
	}
}
class B1 extends A3
{
	static void methodOne()
	{
		System.out.println("BBB");
	}
}
public class LabQuestion4 
{
   public static void main(String[] args) 
   {
	  A3 a=new A3();
	  a.methodOne();
   }
}
