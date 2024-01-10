package ArraysAssignments;
//25. WAP to print maximum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
//output is: 31 and 25. 

import java.util.Arrays;

public class PrintMaxArrays 
{
  public static void checkMaxiNum( int[][] arr,int no_of_rows)	
  {
	  
	        int i = 0;
	        int max = 0;
	        int[] result = new int[no_of_rows];
	        while (i < no_of_rows) 
	        {
	            for (int j = 0; j < arr[i].length; j++)
	            {
	                if (arr[i][j] > max)
	                {
	                    max = arr[i][j];
	                }
	            }
	            result[i] = max;
	            max =0;
	            i++;
	 
	        }
	        for ( i =0; i<result.length;i++) {
	            System.out.println(result[i]);
	        }
	 
  }
  
  public static void main(String[] args) 
  {
	int arr[][] = {{22, 31, 91}, {12, 25, 161}};
	System.out.println("Maximum number in arrays is : ");
	checkMaxiNum(arr,2);	
  }
}
