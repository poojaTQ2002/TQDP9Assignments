package com.Patterns;

import java.util.Scanner;

public class HollowDimandStar 
{
	public static void printPattern(int n) 
    { 
        int i, j; 
        int num = 1; 
       
        for (i = 1; i <= n; i++) { 
            
            for (j = 1; j <= n - i; j++) { 
                System.out.print(" "); 
            } 
           
            for (j = 1; j <= 2 * i - 1; j++) { 
                if (j == 1 || j == 2*i-1) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
            } 
            System.out.println(); 
        } 
    
        for (i = n-1; i >= 1; i--) { 
             
            for (j = 1; j <= n - i; j++) { 
                System.out.print(" "); 
            } 
            
            for (j = 1; j <= 2 * i - 1; j++) { 
                if (j == 1 || j == 2*i-1) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
            } 
            System.out.println(); 
        } 
    } 
    
     
    public static void main(String args[]) 
    { 
    	Scanner sc=new Scanner(System.in);
  	   System.out.println("Enter rows :");
  	   int num=sc.nextInt();  
  	   printPattern(num);
    } 
}










