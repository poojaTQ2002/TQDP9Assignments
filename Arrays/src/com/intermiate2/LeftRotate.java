package com.intermiate2;

import java.util.Arrays;

public class LeftRotate 
{
	public static void leftRotate(int ar[])
	{  
		int fistElements=ar[0];
		for(int i=0;i<ar.length-1;i++)
		{
			ar[i]=ar[i+1];
		}
		ar[ar.length-1]=fistElements;
	}
   public static void main(String[] args) 
   {
	 int arr[]= {1,2,3,4,5,6,7,8,9};
	 System.out.println(Arrays.toString(arr));
	 System.out.println("After Rotation ");
	 for(int i=0;i<3;i++)
	 {
		 leftRotate(arr);
	 }
	    System.out.println(Arrays.toString(arr));
     
}
}
