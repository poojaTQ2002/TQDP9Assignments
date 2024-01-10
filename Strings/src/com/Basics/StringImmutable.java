package com.Basics;

public class StringImmutable 
{
	//when string is returned it is created only heap
   public static void main(String[] args) 
   {
	  String s1="Java";
	  String s2="Java";//scp
	  System.out.println(s1);
	  System.out.println(s2);
	  
	  s1.concat("Program");//
	  System.out.println(s1);
	  s1=s1.concat("Program");
	  System.out.println(s1);
	  
	  String s3="JavaProgram";
	  
	  s1=s1+"Program";//only in heap
	  System.out.println(s1);
	  		
   }
}
