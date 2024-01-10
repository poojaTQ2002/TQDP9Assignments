package AssignmentsOn2DArrays;

public class TransposeMatrixQ7
{
	static int[][] findTranspose(int a1[][]) 
	{
		int cols=a1.length;
		int rows=a1[0].length;
		int trans[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				trans[i][j]=a1[j][i];
			}
		}
		return trans;
		
	}
	static void display(int a[][])
	{
		   for(int i=0;i<a.length;i++)
		   {
			   for(int j:a[i])
			   {
				   System.out.print(j+" ");
			   }
			   System.out.println();
		   }
		   System.out.println("-----------------------");
	}
  public static void main(String[] args) 
  {
	  int m1[][]= {{1,2,4},{3,4,5},{7,8,9}};
		 display(m1);
		 int result[][]=findTranspose(m1);
		  System.out.println("Transpose of above matrix is :");
		 display(result);
  }
}
