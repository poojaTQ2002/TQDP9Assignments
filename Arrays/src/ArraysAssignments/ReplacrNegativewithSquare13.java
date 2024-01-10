package ArraysAssignments;

import java.util.Arrays;

//13. WAP to replace all negative value with its immediate left elements square. Means 
//arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
//Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49]. 

public class ReplacrNegativewithSquare13
{
   public static void convertNegativeToSquare(int ar[])
   {
	   for(int i=0;i<ar.length;i++)
	   {
		   if(ar[i]<0 && i!=0)
		   {
			   ar[i]=ar[i-1]*ar[i-1];
		   }
	   }
	   for(int i:ar)
		   System.out.print(i+" ");
   }
   public static void main(String[] args) 
   {
	  int arr[]= {12, 3, -19, 29, 5, -61, 44, 7, -9};
	  System.out.println(Arrays.toString(arr));
	  System.out.println("After Converting Negative value with Square :");
	  convertNegativeToSquare(arr);
   }
}
