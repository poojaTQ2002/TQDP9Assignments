package ArraysAssignments;

import java.util.Arrays;

//14. WAP to check if an array of integers contains two specified elements 65 and 77.

public class ArrayContainElements14 
{
	public static boolean checkElements(int ar[],int num1,int num2)
	{
		for(int i=0;i<ar.length;i++)
		{
			if((ar[i]==num1) || (ar[i]==num2))
			{
				return true;
			}
				
	     }
		return false;
	}
   public static void main(String[] args) 
   {
	 int arr[]= {12,66,96,64,65,77,32};
	 int arr1[]= {12,96,64,65,32};
	
	 System.out.println(Arrays.toString(arr));
	 int num1=66;
	 int num2=77;
	 System.out.println(checkElements(arr,num1,num2));
	 System.out.println("------------------");
	 System.out.println(checkElements(arr1,num1,num2));
	 
   }
}
