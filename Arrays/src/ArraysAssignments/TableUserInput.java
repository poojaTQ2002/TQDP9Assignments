package ArraysAssignments;
//20. Accept number from user and add table of number in array and display

import java.util.Scanner;

public class TableUserInput 
{
	public static void printTable(int ar[],int num)
	{
		for(int i=1;i<=10;i++)
		{
			ar[i-1]=(num*i);
			System.out.println(ar[i-1]);
		}
		
	}
   public static void main(String[] args) 
   {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	System.out.println("Enter Number :");
	int n=sc.nextInt();
	System.out.println("Table is :");
	printTable(arr,n);
   }
}
