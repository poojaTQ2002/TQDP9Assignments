package ExceptionsAssignments;

public class NumberFormatExceptionQ19
{
   public static void main(String[] args) 
   {
	  String s="12.25";
	  try 
	  {
		  int a = Integer.parseInt(s);
	  }
	  catch (NumberFormatException e) 
	  {
		  System.err.println(e+" "+"Invalid string in argumment");  
	  }
   }
}
