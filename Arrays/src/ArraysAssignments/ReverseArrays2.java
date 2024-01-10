package ArraysAssignments;
////4. WAP to reverse the array itself, don’t print array in reverse – I want current array 
//reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 
//37, 29, 45, 90, 3] by using temporary array.  

import java.util.Arrays;

public class ReverseArrays2 
{
  public static void checkReverse(int ar[])
  {   int revarr[]=new int[ar.length];
  int temp=0;
	  System.out.println("Reverse Arrays is :");
	  for(int i=ar.length-1;i>=0;i--)
	  {
		  if(temp<revarr.length)
		  {
			  revarr[temp]=ar[i];
			  temp++;
		  }
		
	  }
	  for(int j=0;j<revarr.length;j++)
			System.out.print(revarr[j]+" ");
		  
		  
  }
  public static void main(String[] args) 
  {
	 int arr[]= {3, 90, 45, 29, 37, 78};
	 System.out.println("Original Arrays is :");
	 System.out.println(Arrays.toString(arr));
	 checkReverse(arr);
  }
}
