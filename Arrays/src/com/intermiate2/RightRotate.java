package com.intermiate2;

import java.util.Arrays;

public class RightRotate 
{
	public static void rotateOnce(int ar[])
	{
		int lastElement=ar[ar.length-1];
		
		for(int i=ar.length-1;i>0;i--)
		{
			ar[i]=ar[i-1];
		}
		
		ar[0]= lastElement;
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,9,4,5,6,7,8};
		System.out.println(Arrays.toString(arr));
		System.out.println("After rotation");
		
		int n=3;// number of elements to rotate
		for(int i=0;i<n;i++)
		{
		rotateOnce(arr);
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}


