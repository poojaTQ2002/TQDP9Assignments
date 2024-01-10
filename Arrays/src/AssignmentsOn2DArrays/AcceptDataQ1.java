package AssignmentsOn2DArrays;

import java.util.Arrays;
import java.util.Scanner;

//1.	wAP to accept data in 2D array of 3X4 and accept data.

public class AcceptDataQ1 
{
	public static void printData(int a1[][] )
	{
		Scanner sc=new Scanner(System.in);
		int rows=a1.length;
		int col=a1[0].length;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter Elements for position :"+i+" "+j);
				a1[i][j]=sc.nextInt();
			}
		}
	}
	public static void display(int ar[][])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j:ar[i])
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("------------------");
	}
   public static void main(String[] args)
   {
	int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	printData(arr);
	display(arr);
	
   }
}
