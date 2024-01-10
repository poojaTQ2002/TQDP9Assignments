package ExceptionsAssignments;

//3. WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and ArithmeticException

import java.util.Scanner;

public class CatchMultipleExceptinQ3
{
   public static void main(String[] args)
   {
   Scanner sc= new Scanner(System.in);
	
	try
	{
		int arr[]= new int[3];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.println("------------------------------");
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println("Value:"+100/arr[i]);
		}
	}
	catch(ArithmeticException e)
	{
		System.out.println(e+"->Array elements is zero");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e+"-> array is iterated to greater index");
	}


}
}
