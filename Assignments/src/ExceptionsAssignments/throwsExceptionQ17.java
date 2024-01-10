package ExceptionsAssignments;

import java.io.IOException;

public class throwsExceptionQ17
{
	static void method1() throws IOException, NullPointerException
    {
    	String s=null;
    	System.out.println(s.length());
    	try
    	{
    	throw new IOException("No input..");
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
    
    static void method2() throws IOException, NullPointerException
    {
    	String s=null;
    	System.out.println(s.length());
    	
    	throw new IOException("No input..");
    	
    }
    

	public static void main(String[] args) {
		
		try
		{
		method1();
		method2();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
    	
		
	}
}
