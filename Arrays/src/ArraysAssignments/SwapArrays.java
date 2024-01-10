package ArraysAssignments;

import java.util.Arrays;

//8. WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9, 
//0, 2, 4] 

public class SwapArrays 
{
   public static void swappingArrays(int ar[])
   {   
	   int i,j;
	   int temp=0;
	   for(i=0;i<ar.length;i++)
	   {  
		   for(j=1;j<ar.length;j++)
		   {
		      temp=ar[i];
			   ar[i]=ar[j];
		      ar[j]=temp;
		   }
		   
	   }
   }
   
   public static void main(String[] args) 
   {
	  int arr[]= {2, 4, 9, 0};
	  System.out.println(Arrays.toString(arr));
	  swappingArrays(arr);
	  System.out.println("After Swapping elements :");
	  System.out.println(Arrays.toString(arr));
   }
}
