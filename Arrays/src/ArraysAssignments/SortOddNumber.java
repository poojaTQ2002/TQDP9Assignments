package ArraysAssignments;
//6. WAP to arrange the elements of an given array of integers where all Even integers 
//appear before all the Odd integers.

import java.util.Arrays;

public class SortOddNumber 
{
	public static void sortOddElem(int ar[])
	{
		int temp;
		  for(int i=0;i<ar.length;i++)
		  {
			  for(int j=i+1;j<ar.length;j++)
				  if(ar[i]%2!=0)
				  {
					  temp=ar[i];
					  ar[i]=ar[j];
					  ar[j]=temp;
				  }
		  }
		
	}
   public static void main(String[] args) 
   {
	   int arr[]= {1,19,12, 34, 45, 9, 8, 90, 3};
		  System.out.println(Arrays.toString(arr));
		  sortOddElem(arr);
		  System.out.println(Arrays.toString(arr));
   }
}
