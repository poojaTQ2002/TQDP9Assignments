package com.intermediate;

import java.util.Arrays;

public class ShiftNegativeEnd 
{
	public static void shiftNragtive(int ar[])
			{
		       int i,j;
		       int temp;
		       int len=ar.length;
		       for(i=0;i<len;i++)
		       {
		    	   for(j=len-1;j>=0;j--)
		    	   {
		    		   if(ar[i]<0 && (i<j))
		    		   {
		    			   temp=ar[i];
		    			   ar[i]=ar[j];
		    			   ar[i]=temp;
		    		   }
		    	   }
		       }
			}
   public static void main(String[] args) 
   {
	  int arr[]= {1,-8,-7,9,-5,6,4};
	  System.out.println(Arrays.toString(arr));
	  shiftNragtive(arr);
	  
   }
}
