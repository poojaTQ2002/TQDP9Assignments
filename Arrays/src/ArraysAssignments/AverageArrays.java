package ArraysAssignments;
//11. WAP to calculate average of all elements in an Array except max and min element 

import java.util.Arrays;

public class AverageArrays 
{
	public static void findAverage(int ar[])
	{  
		 int max = ar[0];
	     int min = ar[0];
	     int sum =0;
	     float avg=0;
	     for (int i = 0; i < ar.length; i++) 
	     {
	    	    sum =sum+ ar[i];
	            if (ar[i] > max)
	            {
	                max = ar[i];
	            }
	            else if (ar[i] < min)
	            {
	                min = ar[i];
	            }
	      }
	     
         System.out.println("Sum is :"+sum);
	    avg = ((sum - max - min) / (ar.length - 2));
	    System.out.println("Average is :"+avg);
	}
	public static void main(String[] args) 
	{
		int arr[]= {11,2,3,5,7};
		System.out.println(Arrays.toString(arr));
		findAverage(arr);
	}
}
