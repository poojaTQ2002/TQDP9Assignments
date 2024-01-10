package com.intermiate2;

import java.util.Arrays;

public class PairOfSum 
{
	public static void findPairs(int ar[],int sum)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>sum)
				continue;
			for(int j=i+1;j<ar.length;j++)
			{
				if((ar[i]+ar[j]==sum))
					System.out.println("{"+ar[i]+","+ar[j]+"}");
			}
				
		}
	}
   public static void main(String[] args) 
   {
	   int arr[]= {1,2,3,4,5,6,7,8};
	   int s=8;
	   System.out.println(Arrays.toString(arr));
	   System.out.println("Sum is :"+s);
	   System.out.println("Pairs are :");
	   findPairs(arr,s);
	
   }
}
