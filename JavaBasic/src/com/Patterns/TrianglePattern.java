package com.Patterns;

import java.util.Scanner;

//public class TrianglePattern 
//{
//   public static void printPattern(int num)
//   {
//	   int n=1;
//	   for(int i=1;i<=num;i++)
//	   {
//		   for(int j=1;j<=num-i;j++)
//		   {
//			   System.out.print(" ");
//			  
//			   
//			  
//		   }
//	   for(int j=1;j<=i;j++)
//		   {
//			   System.out.print(n+" ");	
//			   n++;
//		   }
//		   System.out.println();
//	   }
//   }
//   public static void main(String[] args) 
//   {
//	   Scanner sc=new Scanner(System.in);
// 	   System.out.println("Enter rows :");
// 	   int num=sc.nextInt(); 
//	  printPattern(num);
//   }
//}


public class TrianglePattern 
{
   public static void printPattern(int num)
   {
	   String n="ab";
	   for(int i=1;i<=num;i++)
	   {
		   for(int j=1;j<=num-i;j++)
		   {
			   System.out.print(" ");
			  
			   
			  
		   }
	   for(int j=1;j<=i;j++)
		   {
			   System.out.print(n+"");	
			  
		   }
		   System.out.println();
	   }
   }
   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
 	   System.out.println("Enter rows :");
 	   int num=sc.nextInt(); 
	  printPattern(num);
   }
}

