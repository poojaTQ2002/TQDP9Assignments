package ArraysAssignments;

import java.util.Arrays;

//15. WAP to arrange the elements of an given array of integers where all negative 
//integers appear before all the positive integers. 


public class MoveNegativeElements 
{
	public static void moveElements(int ar[])
	{
		int temp;
		  for(int i=0;i<ar.length;i++)
		  {
			  for(int j=i+1;j<ar.length;j++)
				  if(ar[i]>ar[j])
				  {
					  temp=ar[i];
					  ar[i]=ar[j];
					  ar[j]=temp;
				  }
		  }
	}
   public static void main(String[] args) 
   {
	  int arr[]= {-1, 2, -3, 4, 5, 6, -7, 8, 9 ,0};
	  System.out.println(Arrays.toString(arr));
	  moveElements(arr);
	  System.out.println(Arrays.toString(arr));
   }
}
