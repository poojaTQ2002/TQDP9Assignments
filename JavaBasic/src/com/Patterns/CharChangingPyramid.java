package com.Patterns;

import java.util.Scanner;

public class CharChangingPyramid 
{
	public static void printPattern(int n) 
    { 
        int i, j; 
        int alphabet = 65; 
        for (i = 0; i <= n; i++) 
        { 
            for (j = 0; j <= i; j++) 
            { 
            	System.out.print((char)alphabet+" "); 
            	alphabet++;
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

