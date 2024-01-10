package AssignmentsOn2DArrays;

public class SubtractMatrixQ8 
{
	static int[][] subtractMatric(int a1[][],int a2[][])
	{
		int rows=a1.length;
		int col=a1[0].length;
		int sub[][]=new int[rows][col];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				sub[i][j]=a1[i][j]-a2[i][j];
			}
		}
		return sub;
	}
	static void display(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j:a[i])
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args)
	{
		 int ar1[][]= {{1,2},{3,4}};
		 int ar2[][]= {{5,1},{9,2}};
		 display(ar1);
		 System.out.println("-----------");
		 display(ar2);
		 int result[][]=subtractMatric(ar1,ar2);
		 System.out.println("-----------------");
		 
		 System.out.println("Subtraction of above matrix is :");
		 display(result);
		 
	}

}
