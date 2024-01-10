package ArraysAssignments;
//10. Write a Java program to find a missing number in an array. Means e.g. array has 1 
//to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is 5.

import java.util.Arrays;
import java.util.Scanner;

public class MissingArrays 
{
	public static int findMissingElem(int ar[])
	{   
		int n=ar.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < ar.length; i++) {
            restSum+=ar[i];
        }
        int missingNumber=sum-restSum;
        return missingNumber;
		
	}
   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the size of Array :");
		  int size=sc.nextInt();
		  
		  int arr[]=new int[size];
		  System.out.println("Enter Elements :");
		  for(int i=0;i<arr.length;i++)
		  {
			  arr[i]=sc.nextInt();
		  }
		  System.out.println(Arrays.toString(arr));
		  findMissingElem(arr);
		  
   }
}
