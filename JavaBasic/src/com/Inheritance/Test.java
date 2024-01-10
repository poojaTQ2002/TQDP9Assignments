package com.Inheritance;

public class Test 
{
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
		Test t=new Test();
		System.out.println(t);
	}
}
