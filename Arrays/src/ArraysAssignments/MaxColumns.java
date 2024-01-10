package ArraysAssignments;
//WAP to print maximum in columns. Means e.g. arr[][]= {{22, 31, 9}, {12, 5, 16}, 
//{34, 42, 2}} output is: 34, 42, and 16. 

public class MaxColumns 
{
	public static void findmax(int arr[][])
	{
		int max;
		int cols=arr.length;
		for (int i = 0; i < cols; i++) 
		{
			  max = arr[0][i];
			 for (int j = 1; j < cols; j++)
			 {
				 if (arr[j][i] > max)
					 max = arr[j][i]; 
			 }
          System.out.println(max);
        }
	}
   public static void main(String[] args) 
   {
	  int arr[][]= {{22, 31, 9}, {12, 5, 16},{34, 42, 2}};
	  System.out.println("Maximum elements in columns :");
	  findmax(arr);
	  
   }
}
