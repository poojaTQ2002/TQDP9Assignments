package com.StringAssignments1;
//5.	Write a Java program to concatenate two strings.

public class ConcatenateTwoStringQ5 
{
   public static void main(String[] args)
   {
	  String s1="Wellcome ";
	  String s2=new String("Java");
	  
	  //concatenate two strings using concat method
	  String str=s1.concat(s2);
	  System.out.println(str);
	  System.out.println("--------------");
	  
	  //using + operator
	  String str2=s1+"to "+s2;
	  System.out.println(str2);
   }
}
