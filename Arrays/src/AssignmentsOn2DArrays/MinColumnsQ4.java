package AssignmentsOn2DArrays;
//4.	WAP to print minimum in columns. Means e.g. arr[][]={{22, 31, 9}, {12, 5, 	16}, {34, 42, 2}} 
//output is: 12, 5, 2.

public class MinColumnsQ4 
{
	public static void printcol(int arr[][])
	{
		for(int j=0;j<arr[0].length;j++)
		{
			int maxRow=findMinElements(arr,j);
			System.out.println("min elemnts in column :"+(j+1)+" "+maxRow);
		}
	}
	public static int findMinElements(int ar[][],int j)
	{
		
		int min=ar[0][j];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i][j]<min)
				{
					min=ar[i][j];
				}
			
		
		}
		return min;
		
	}
	
	
  public static void main(String[] args)
  {
	int arr[][]={{22, 31, 9}, {12, 25, 16}};
	printcol(arr);
  }
  
}
