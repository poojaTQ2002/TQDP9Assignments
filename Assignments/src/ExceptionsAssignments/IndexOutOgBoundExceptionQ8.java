package ExceptionsAssignments;

public class IndexOutOgBoundExceptionQ8 
{
   public static void main(String[] args) 
   {
	   String[] arr = {"Rohit","Shikar","Virat","Dhoni"};
	   String s="Java";
	   try 
	   {
		   
		 for(int i=0;i<arr.length;i++)
			 System.out.println(arr[i]);
		 String substring = s.substring(2, 8); 
	   }
	   catch (ArrayIndexOutOfBoundsException e)
	   {
		System.out.println(e);
	   }
	   catch(StringIndexOutOfBoundsException e)
	   {
		   System.out.println(e);
	   }
	   
   }
}
