package ExceptionsAssignments;

/*1. WAP which throws ArrayIndexOutBoundsException. In the console, observe the stack trace and the 
line number from where the Exception is thrown
2. WAP to use catch / handle the ArrayIndexOutOfBoundsException exception.*/


public class ArrayIndexBoundExceptionQ1Q2
{
    public static void main(String[] args)
    {
    	String[] arr = {"Rohit","Shikar","Virat","Dhoni"};
    	try
    	{
    		for(int i=0;i<=arr.length;i++)
        	{
        		System.out.println(arr[i]);      
        	          
        	} 
		}
    	catch (ArrayIndexOutOfBoundsException e)
    	{
			System.out.println(e);
		}
    	 
    	  
    }  
	
}
