package com.merge;

import java.util.Arrays;

public class MergeArray 
{
	public static  int[] completeMerge(int a1[], int a2[])
	{
		int mar[]= new int[a1.length+a2.length];
		
		int index=0;
		for(int i=0;i<a1.length;i++)
		{
			mar[index++]=a1[i];			
		}
		
		for(int i=0;i<a2.length;i++)
		{
			mar[index++]=a2[i];
		}
		
		return mar;
		
	}
	
	public static int[] alternateMerge(int a1[],int a2[])
	{
		int mar[]= new int[a1.length+a2.length];
		int index=0;
		
		int maxLength= Math.max(a1.length, a2.length);
		
		for(int i=0;i<maxLength;i++)
		{
			if(i<a1.length)
			{
				mar[index++]=a1[i];
			}
			
			if(i<a2.length)
			{
				mar[index++]=a2[i];
			}
				
		}
		
		
		return mar;
	}
	
	public static int[] alternateMergeSkip(int a1[],int a2[])
	{
		int maxLength= Math.max(a1.length, a2.length);
		
		int mar[]= new int[maxLength];
		int index=0;
		int i=0;
		while(index<maxLength)
		{
			if(i<a1.length)
			{
				mar[index++]= a1[i];
				i++;
			}
			if(i<a2.length)
			{
				mar[index++]=a2[i];
				i++;
			}
		}
		
		
		return mar;
	}
	
	public static void main(String[] args) {
		
		int ar1[]= {1,2,3,4,5,6};
		int ar2[]= {11,12,13,14};
		
		System.out.println(Arrays.toString(ar1));
		
		System.out.println(Arrays.toString(ar2));
		
		System.out.println("Complete Merge:");
	    System.out.println(Arrays.toString(completeMerge(ar1, ar2)));
	    
	    System.out.println("Alternate Merge");
	    System.out.println(Arrays.toString(alternateMerge(ar1, ar2)));
	    
	    System.out.println("Alternate Merge with skip");
	    System.out.println(Arrays.toString(alternateMergeSkip(ar1, ar2)));
	    
	    
		
	
		
		
		
	}

}
