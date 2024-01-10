package ExceptionsAssignments;

import java.io.IOException;

//4. WAP to show checked exception and use multiple catch block with universal Exception handler.

public class ShowCheckedExceptionQ4 
{
   public static void main(String[] args)
   {
	   try 
	   {
		  Class temp = Class.forName("demo"); // calling the demo class
	   }
	   catch (ClassNotFoundException e)
	   {
		   System.out.println(e+" "+"Class does not exist check the name of the class");
	   }
	   
	}
 }

