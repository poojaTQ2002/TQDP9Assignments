package com.StringAssignments1;
//12.	Write a Java program to trim leading white space characters in a string.

public class trimLeadingwhiteSpaceQ12
{
	public static void main(String args[])
	{  
		String s1="  hello string   ";  
		System.out.println(s1+"javatpoint");//without trim()  
		System.out.println(s1.trim()+"javatpoint");//with trim() 
		
		System.out.println("----------------------------------");
		
		String s2="  java is fun   ";  
		System.out.println(s2+"language");//without trim()  
		System.out.println(s2.trim()+"language");//with trim()  
		
	}
}
