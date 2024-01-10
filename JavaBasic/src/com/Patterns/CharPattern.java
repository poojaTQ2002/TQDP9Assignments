package com.Patterns;

public class CharPattern 
{
 public static void main(String[] args) 
 {
	for(int i='A';i<='D';i++)
	{
		for(int j='A';j<=i;j++)
		{
			System.out.print((char)j);
		}
		System.out.println();	
	}
	
 }
}
