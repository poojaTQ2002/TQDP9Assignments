package com.intermediate;

import java.util.Arrays;

public class FrequencyOfNumber 
{
   public static void findFrequency(int ar[])
   {
	   int count;
	   boolean status;
	   for(int i=0;i<ar.length;i++)
	   {
		   count=1;
		   status=false;
		   for(int j=i-1;j>=0;j--)
		   {
			   if(ar[i]==ar[j])
			   {
				   status=true;
				   break;
			   }
		   }
		   if(status==false)
		   {
			   for(int k=i+1;k<ar.length;k++)
			   {
				   if(ar[i]==ar[k])
				   count++;
			   }
			   //find feequency logic
//		   System.out.println(ar[i]+" ------> "+count);
//			   //Duplicate logic
		   if(count>1)
			   System.out.println(ar[i]);
//			   
//			   //Find Unique element logic
//			   if(count==1)
//				   System.out.println(ar[i]);
		   }
		   
	   }
	   
	   
   }
   
   public static void main(String[] args) 
   {
	   int arr[]= {1,5,1,2,3,2,5,8,1};
	   System.out.println(Arrays.toString(arr));
	   findFrequency(arr);
	
   }
}
