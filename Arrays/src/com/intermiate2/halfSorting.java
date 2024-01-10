package com.intermiate2;

public class halfSorting 
{
	public static void halfSort(int ar[])
	{
		int len= ar.length;
		
		// first half: ascending
		for(int i=0;i<len/2;i++)
		{
		   	for(int j=i+1;j<len/2;j++)
		   	{
		   		if(ar[i]>ar[j])
		   		{
		   			int temp=ar[i];
		   			ar[i]=ar[j];
		   			ar[j]=temp;
		   		}
		   
		   	}
		}
		
		// second half : descending
		for(int i=len/2;i<len;i++)
		{
		   	for(int j=i+1;j<len;j++)
		   	{
		   		if(ar[i]<ar[j])
		   		{
		   			int temp=ar[i];
		   			ar[i]=ar[j];
		   			ar[j]=temp;
		   		}
		   
		   	}
		}
		
		
		
	}

	public static void main(String[] args) {
		
		int arr[]= {2,8,7,3,1,5,6,4};
		
		for(int a:arr)
			System.out.print(a+" ");
		System.out.println();
		System.out.println("After Sorting");
		halfSort(arr);
		
		for(int a:arr)
			System.out.print(a+" ");
		
		
		
	}
}


