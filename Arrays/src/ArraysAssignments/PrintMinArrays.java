package ArraysAssignments;
//26. WAP to print minimum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
//output is: 9 and 12.

import java.util.Arrays;

public class PrintMinArrays 
{
  public static void checkMiniNum( int[][] arr,int no_of_rows)	
  {
	  
	        int i = 0;
	        int min = 0;
	        int[] result = new int[no_of_rows];
	        while (i < no_of_rows) 
	        {
	            for (int j = 0; j < arr[i].length; j++)
	            {
	                if (arr[i][j] < min)
	                {
	                    min = arr[i][j];
	                }
	            }
	            result[i] = min;
	            min =0;
	            i++;
	 
	        }
	        for ( i =0; i<result.length;i++) {
	            System.out.println(result[i]);
	        }
	 
  }
  
  public static void main(String[] args) 
  {
	int arr[][] = {{25,87,65}, {12, 54, 16}};
	System.out.println("Minimum number in arrays is : ");
	checkMiniNum(arr,2);	
  }
}
