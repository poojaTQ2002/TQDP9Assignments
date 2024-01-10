package com.Inheritance;

public class Test2 
{   Test2()
	{
	System.out.println("Inside default construction");
	}
{
	System.out.println("Instance Block1");
	
}
{
	System.out.println("Instance Block2");
}
static 
{
	System.out.println("Static block1");
}
{
	System.out.println("Static block2");
}
public static void main(String[] args) 
{
	Test2 t=new Test2();
	System.out.println(t);
}
   
}
