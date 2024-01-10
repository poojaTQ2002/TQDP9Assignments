package ArraysAssignments;
//28. WAP to print minimum in columns. Means e.g. arr[][]={{22, 31, 9}, {12, 5, 16}, 
//{34, 42, 2}} output is: 12, 5, 2.

public class MiniColumns 
{
	public static void findmin(int arr[][])
	{
		int min;
		int cols=arr.length;
		for (int i = 0; i < cols; i++) 
		{
			min = arr[0][i];
			 for (int j = 1; j < cols; j++)
			 {
				 if (arr[j][i] < min)
					 min = arr[j][i]; 
			 }
          System.out.println(min);
        }
	}
   public static void main(String[] args) 
   {
	  int arr[][]= {{22, 31, 9}, {12, 5, 16},{34, 42, 2}};
	  System.out.println("Minimum elements in columns :");
	  findmin(arr);
	  
   }
}
