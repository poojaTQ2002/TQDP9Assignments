package ArraysAssignments;
//9. Write a Java program to test the equality of two arrays. Means e.g arr1[] = [12, 22, 
//32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22] Here both arrays are equal 

import java.util.Arrays;

public class EqualityOfArrays 
{
   public static boolean checkEquality(int ar1[],int ar2[])
   {
	   for(int i=0;i<ar1.length;i++)
	   {
			   for(int j=0;j<ar2.length;j++)
					if(ar1[i]==ar2[j])
					{
						return true;
						
					} 
	   }
	   return false;
   }
   public static void main(String[] args) 
   {
	  int arr1[]= {1,2,3,6};
	  int arr2[]= {4,5,6};
	  System.out.println(Arrays.toString(arr1));
	  System.out.println(Arrays.toString(arr2));
	  if(checkEquality(arr1,arr2))
	  {
			System.out.println("Arrays is Equal");
	  }
		else
		{
			System.out.println("Arrays is not Equal");
		}
	  }
   
}
