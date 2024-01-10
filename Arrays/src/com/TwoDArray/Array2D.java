package com.TwoDArray;

import java.util.Scanner;

public class Array2D 
{
 public static void main(String[] args)
   {
	    Scanner sc=new Scanner(System.in);
	   // int [][] arr=new int[2][5]; OR
	    int arr[][]=new int[2][5];
	    System.out.println("Enter Elements :");
	    //for Rows
	    for(int i=0;i<2;i++)
	    {
	    	//for Cloumns for each rows
	    	for(int j=0;j<3;j++)
	    	{
	    		arr[i][j]=sc.nextInt();
	    	}
	    }
	    System.out.println("-----------------------");
	    for(int i=0;i<2;i++)
	    {
	    	for(int j:arr[i])
	    	{
	    		System.out.print(j+" ");
	    	}
	    	System.out.println();
	    		
	    }
	    System.out.println("-----------------------");
	    
	    //Impicit array
	    
	     int ar[][]= {{1,2,3},{4,5,6},{7,8,9}};
	     for(int i=0;i<ar.length;i++)
	     {
	    	 for(int j:ar[i])
	    	 System.out.print(j+" ");
	     }
	     System.out.println();
	    
	    
	    
   }
}
