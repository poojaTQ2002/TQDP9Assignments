package AssignmentsOn2DArrays;

public class MaxOfRows 
{
	static void maxOfRows(int ar[][])
	{
		int rows=ar.length;
		int col=ar[0].length;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<rows;i++)
		{
			max=Integer.MIN_VALUE;
			for(int j=0;j<col;j++)
			{
				if(max<ar[i][j])
				{
					max=ar[i][j];
				}
			}
			System.out.println("Max of Rows "+i+" "+"is :"+max);
		}
	}
    public static void main(String[] args)
    {
		int arr[][]= {{1,2,5},{3,4,8}};
		maxOfRows(arr);
	}
}
