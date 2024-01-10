package ExceptionsAssignments;

import java.io.IOException;

//Show UncheckedExceptionQ4.java

public class ShowUncheckedExceptionQ6 
{
   public static void main(String[] args)
   {
	   try 
	   {
		  String s=null;
		  System.out.println(s.length());
	   }
	   catch (NullPointerException e)
	   {
		   System.out.println(e);
		   System.out.println("Null....");
	   }
	   
	}
 }

