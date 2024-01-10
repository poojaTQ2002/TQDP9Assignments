package com.exception2;



public class RethrowException
{
	static void method1() throws NullPointerException
	{
		try
		{
			String s= null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("In catch block of method 1");
			throw e; // handled by JVM
			
		}
	}
	
	public static void main(String[] args) {
		try
		{
		method1();
		}
		catch(Exception ex)
		{
			System.out.println("In main :"+ex);
			//throw ex;
		}
	}

}
