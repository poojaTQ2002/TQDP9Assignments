package AssignmentsOn2DArrays;
//3.	WAP to print maximum in rowwise in 2D array. 
//Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} output is: 31 and 25.

public class MaxRowwiseQ3
{
	public static void printrow(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			int maxRow=findMaxElements(arr[i]);
			System.out.println("Max elemnts in row :"+(i+1)+" "+maxRow);
		}
	}
	public static int findMaxElements(int ar[])
	{
		
		int max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j]>max)
				{
					max=ar[j];
				}
			}
		
		}
		return max;
		
	}
	
	
  public static void main(String[] args)
  {
	int arr[][]={{22, 31, 9}, {12, 25, 16}};
	printrow(arr);
  }
  
}
