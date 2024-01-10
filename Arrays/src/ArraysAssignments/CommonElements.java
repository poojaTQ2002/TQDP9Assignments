package ArraysAssignments;
//7. Write a Java program to find the common elements between two arrays (int values) 
//Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and arr2[] = [39, 25, 15, 23, 55, 91, 
//66, 22], so common between two arrays are 23 and 91 

import java.util.Arrays;

public class CommonElements 
{
	public static void checkCommonElem(int ar1[],int ar2[])
	{   System.out.println("Common Elements is :");
		for(int i=0;i<ar1.length;i++)
		{
			for(int j=0;j<ar2.length;j++)
				if(ar1[i]==ar2[j])
				{
					System.out.print(ar1[i]+" ");
				} 
		}
	}
	
	public static void main(String[] args) 
	{
		int arr1[]= {12, 23, 34, 67 ,78, 91, 56,55};
		int arr2[]= {39, 25, 15, 23, 55, 91,66, 22};
		System.out.println(" Arrays1 is :"+Arrays.toString(arr1));
		System.out.println(" Arrays2 is :"+Arrays.toString(arr2));
		checkCommonElem(arr1,arr2);
	}
  
}
