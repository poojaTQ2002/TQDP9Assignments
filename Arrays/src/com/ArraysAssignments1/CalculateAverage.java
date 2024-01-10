package com.ArraysAssignments1;
//2. WAJP2 calculate the average value of array elements.

import java.util.Arrays;

public class CalculateAverage 
{
	public static void calculateAvg(int ar[])
	{
		int sum=0;
		double avg=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
			avg=sum/ar.length;
		}
		System.out.println(avg);
	}
    public static void main(String[] args) 
    {
    	int arr[]= {1,2,3,4};
   	 System.out.println(Arrays.toString(arr));
   	calculateAvg(arr);
	}
}
