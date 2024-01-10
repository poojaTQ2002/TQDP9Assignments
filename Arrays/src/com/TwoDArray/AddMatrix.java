package com.TwoDArray;

public class AddMatrix 
{
	static int[][] add(int a1[][],int a2[][])
	{
		int row=a1.length;
		int clos=a1[0].length;
		int mar[][]=new int [row][clos];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<clos;j++)
			{
				mar[i][j]=a1[i][j]+a2[i][j];
				}
		}
		return mar;
		
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
	 int m1[][]= {{1,2},{3,4}};
	 int m2[][]= {{1,2},{3,4}};
	 display(m1);
	 display(m2);
	 int result[][]=add(m1,m2);
	 
	 System.out.println("Addition of above matrix is :");
	 display(result);
	 
  }
}
