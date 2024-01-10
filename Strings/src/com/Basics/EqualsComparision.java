package com.Basics;

public class EqualsComparision 
{
  public static void main(String[] args) 
  {
	  //using literals
	  String s1="Hello";
	   String s2="Hello";
	   
	   //using new Keyword
	   String s3=new String("Hello");
	   String s4=new String("Hello");
	   
	   System.out.println(s1==s2);//compare reference :id
	   System.out.println(s1.equals(s2));//compare value
	   System.out.println("---------------");
	   
	   System.out.println(s1==s3);//is not same
	   System.out.println(s1.equals(s3));//value is same
	   System.out.println("---------------");
	   
	   System.out.println(s4==s3);//is not same
	   System.out.println(s4.equals(s3));//value is same
	   
	   
	   
  }
}
