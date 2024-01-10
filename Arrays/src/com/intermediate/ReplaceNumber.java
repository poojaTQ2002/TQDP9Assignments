package com.intermediate;

import java.util.Arrays;

public class ReplaceNumber 
{
  public static void repalceNum(int ar[])
  {
	  for(int i=0;i<ar.length;i++)
	  {
		  if(ar[i]<0)
		  {
		     ar[i]=0;
		  }
	}
	  for(int x:ar)
	  {
		  System.out.print(x+" ");
	  }
  }
  public static void main(String[] args) 
  {
	 int arr[]= {1,6,-4,8,-7,3};
	 System.out.println(Arrays.toString(arr));
	 repalceNum(arr);
  }
}
