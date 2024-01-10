package ExceptionsAssignments;

public class NullPointerExceptionQ9
{
   public static void main(String[] args)
   {
	  String s=null;
	  try 
	  {
		System.out.println(s.length());
      }
	  catch (NullPointerException e)
	  {
		System.out.println(e);
	  }
   }
}
