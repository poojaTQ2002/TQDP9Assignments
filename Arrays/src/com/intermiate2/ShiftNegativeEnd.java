package com.intermiate2;

import java.util.Arrays;

public class ShiftNegativeEnd 
{
	public static void shiftNegative1(int ar[])
	{
		int i,j;
		int temp;
		int len=ar.length;
		
		for( i=0;i<len;i++)
		{
			if(ar[i]>=0)
				continue;
			else
			{
				for(j=len-1;j>=0&&i<j;j--)
				{
					if(ar[j]>=0)
					{
						temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
						break;
					}
				}
			}
			
		}
			
	}
	
	public static void shiftNegativeFront(int ar[])
	{
		int i,j;
		int temp;
		int len=ar.length;
		
		for( i=0;i<len;i++)
		{
			if(ar[i]<0)
				continue;
			else
			{
				for(j=len-1;j>=0&&i<j;j--)
				{
					if(ar[j]<0)
					{
						temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
						break;
					}
				}
			}
			
		}
			
	}
	
	
	public static void main(String[] args)
	{
		
		int arr[]= {1,-2,3,-4,0,5};
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("--After shifting------");
		shiftNegativeFront(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}


