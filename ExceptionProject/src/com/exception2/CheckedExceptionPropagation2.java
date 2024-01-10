package com.exception2;

import java.io.IOException;

public class CheckedExceptionPropagation2 
{
	void method1() throws IOException
	{
		throw new IOException("Input error...");
	}
	void method2() throws IOException
	{
		method1();
	}
	
	void method3() throws IOException
	{
		method2();
	}
	
	
	
	public static void main(String[] args) throws IOException {
		CheckedExceptionPropagation2 obj= new CheckedExceptionPropagation2();
		obj.method3();
		
	}


}
