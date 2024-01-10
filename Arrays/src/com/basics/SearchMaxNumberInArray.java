package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class SearchMaxNumberInArray 
{
		
		public static int findMax(int ar[])
		{
			//int max= Integer.MIN_VALUE;
			int max=ar[0];
			
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]>max)
					max=ar[i];
			}
			
			return max;
		}
		
		public static void main(String[] args) {
			
	        int arr[]= {4,6,7,12,8,9,10};
			
			System.out.println(Arrays.toString(arr));
			
			System.out.println("Maximum:"+findMax(arr));
		}

	

}
