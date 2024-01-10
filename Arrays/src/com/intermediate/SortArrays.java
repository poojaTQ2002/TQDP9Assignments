package com.intermediate;

import java.util.Arrays;

public class SortArrays 
{
  public static void sortArr(int ar[])
  {  
	  int temp;
	  for(int i=0;i<ar.length;i++)
	  {
		  for(int j=i+1;j<ar.length;j++)
			  if(ar[i]>ar[j])
			  {
				  temp=ar[i];
				  ar[i]=ar[j];
				  ar[j]=temp;
			  }
	  }
  }
  
  public static void main(String[] args) 
  {
	 int arr[]= {5,8,3,10,1,9,6,4};
	 System.out.println(Arrays.toString(arr));
	 System.out.println("After Sorting arraya :");
	 sortArr(arr);
	 System.out.println(Arrays.toString(arr));
	 
	 
  }
}
