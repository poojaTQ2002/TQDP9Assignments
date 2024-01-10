package HWForLogic;

import java.util.Arrays;

public class SortArrays 
{
	static void ArraySorting(int ar[])
	{
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				int temp=0;
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
			}
			System.out.println(ar[i]);
		}
	}
   public static void main(String[] args) 
   {
	  int arr[]= {5,10,6,3,7,1,8,2,9,4};
	  System.out.println(Arrays.toString(arr));
	  System.out.println("-------------");
	  System.out.println("After Sorting Arrays :");
	  ArraySorting(arr);
   }
}