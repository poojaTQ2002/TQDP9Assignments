package com.StringAssignments1;
//4.	Write a Java program to find length of a string.

public class FindLengthQ4
{
   public static void main(String[] args) 
   {
	  String s1="Java is Fun";
	  String s2=new String("JavaPortableLanguage");
	  String str="Hello";
	  
	  //using length method  1st Way
	  System.out.println("String Length is :"+s1.length());
	  System.out.println("String Length is :"+s2.length());
	  System.out.println("---------------------");
	  //2nd way
	  if(str.length()>0)
	  {
		  System.out.println("String Length is :"+str.length());
		  
	  }
	  str="";
	  if(str.length()==0)
	  {
		  System.out.println("Now String is Empty :"+str.length());
	  }
	  
	  
   }
} 
