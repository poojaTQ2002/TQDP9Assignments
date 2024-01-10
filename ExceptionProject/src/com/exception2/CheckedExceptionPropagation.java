package com.exception2;

import java.io.IOException;

public class CheckedExceptionPropagation 
{
	void method1() throws IOException
	{
		throw new IOException("Input error...");
	}
	void method2() throws IOException
	{
		method1();
	}
	
	void method3() 
	{
		try
		{
		method2();
		}catch (Exception e) {
		  System.out.println(e);
		}
	}
	
	
	
	public static void main(String[] args)  {
		CheckedExceptionPropagation obj= new CheckedExceptionPropagation();
		obj.method3();
		
	}

}
