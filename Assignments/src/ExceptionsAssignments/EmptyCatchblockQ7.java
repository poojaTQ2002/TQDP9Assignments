package ExceptionsAssignments;

public class EmptyCatchblockQ7
{
   public static void main(String[] args)
   {
	  try 
	  {
		  int a = 4, b = 0;
	      int c = a/b;
	      System.out.println(c);
	  } 
	  catch (ArithmeticException e) 
	  {
		// TODO: handle exception
	  }
   }
   
}
