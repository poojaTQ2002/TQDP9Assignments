package ArraysAssignments;
//6. Write a Java program to find the duplicate values of an array of integer values. 
//Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78. 

import java.util.Arrays;

public class DuplicateArrays 
{
	public static void checkDuplicateNum(int ar[])
	{   int count=0;
		for(int i=0;i<ar.length;i++)
		{   
			count=0;
			if(ar[i]!=0)
			   {
			      for(int j=i+1;j<ar.length;j++)
			         {
			        	if(ar[i]==ar[j])
				           {
				            	count++;
				                ar[j]=0;
			               }
		             }
			     if(count>=1)
			      {
			     	System.out.println(ar[i]);
			      }
	             }
	     }
	}
	public static void main(String[] args) 
	{
		int arr[]= {3, 10, 90, 78, 56, 10, 78, 34, 61,78,3,3};
		System.out.println("Original arrays is :"+Arrays.toString(arr));
		checkDuplicateNum(arr);
	}

}
