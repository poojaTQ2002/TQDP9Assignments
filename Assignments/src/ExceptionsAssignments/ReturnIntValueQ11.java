package ExceptionsAssignments;

public class ReturnIntValueQ11 
{
	static int method1()
	{
		try
		{
			
			return 10;
		} 
		finally
		{
			System.out.println("This is finally block");
			return 10;
		}
		
	}
   public static void main(String[] args) 
   {
	System.out.println(method1());
   }
}
