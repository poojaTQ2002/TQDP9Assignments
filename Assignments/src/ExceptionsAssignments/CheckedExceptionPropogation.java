package ExceptionsAssignments;

import java.io.IOException;

public class CheckedExceptionPropogation 
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
		CheckedExceptionPropogation obj= new CheckedExceptionPropogation();
		obj.method3();
		
	}
}
