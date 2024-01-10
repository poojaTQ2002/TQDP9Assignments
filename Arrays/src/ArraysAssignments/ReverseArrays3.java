package ArraysAssignments;
//5. WAP to reverse the array itself, don’t print array in reverse – I want current array 
//reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 
//37, 29, 45, 90, 3] without using temporary array. 

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrays3 
{
  public static void checkReverse(int ar[])
  {
	  System.out.println("Reverse Arrays is :");
	  for(int i=ar.length-1;i>=0;i--)
		  
		  System.out.print(+ar[i]+","+" ");
  }
  public static void main(String[] args) 
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of arrays :");
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	  System.out.println("Enter Elements :");
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	 System.out.println("Original Arrays is :");
	 System.out.println(Arrays.toString(arr));
	 checkReverse(arr);
  }
}
