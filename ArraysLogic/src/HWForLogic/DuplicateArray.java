package HWForLogic;

import java.util.Arrays;

public class DuplicateArray
{
	static void findDuplicateElements(int ar[]) 
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]);
				}
			}
		}
	}
   public static void main(String[] args)
   {
	  int arr[]= {1,5,4,7,9,1,3,4,8,5};
	  System.out.println(Arrays.toString(arr));
	  System.out.println("--------------------");
	  System.out.println("Duplicate elements in Arrays is :");
	  findDuplicateElements(arr);
   }
} 
