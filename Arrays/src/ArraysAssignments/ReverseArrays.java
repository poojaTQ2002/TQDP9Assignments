package ArraysAssignments;
//3. WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your 
//output must be 78, 37, 29, 45, 90, 3 

import java.util.Arrays;

public class ReverseArrays 
{
  public static void checkReverse(int ar[])
  {
	  System.out.println("Reverse Arrays is :");
	  for(int i=ar.length-1;i>=0;i--)
		  
		  System.out.print(+ar[i]+","+" ");
  }
  public static void main(String[] args) 
  {
	 int arr[]= {3, 90, 45, 29, 37, 78};
	 System.out.println("Original Arrays is :");
	 System.out.println(Arrays.toString(arr));
	 checkReverse(arr);
  }
}
