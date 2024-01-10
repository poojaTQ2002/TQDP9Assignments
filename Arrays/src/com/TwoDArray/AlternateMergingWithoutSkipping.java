package com.TwoDArray;

import java.util.Arrays;

public class AlternateMergingWithoutSkipping
{
	public static void MergeWithoutSkipping(int a1[]) 
	{
		int merge[]=new int [a1.length];
		int pos=0;
		for(int i=0;i<a1.length;i++)
		{
			merge[pos]=a1[i];
			pos++;
		}
		for(int i=1;i<a1.length;i+=2)
		{
			merge[pos]=a1[i];
			pos++;
		}
		System.out.println(Arrays.toString(merge));
	}
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6};
		MergeWithoutSkipping(arr);
		
	}
   
   
}
