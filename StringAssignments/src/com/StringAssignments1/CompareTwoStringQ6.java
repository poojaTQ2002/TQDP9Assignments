package com.StringAssignments1;
//6.	Write a Java program to compare two strings.

public class CompareTwoStringQ6 
{
   public static void main(String[] args)
   {
	   String s1="Wellcome ";
	   String s2=new String("Java");
	   String s3="Programming";
	   
	   //by using equals() method
	   System.out.println(s1.equals(s2));
	   System.out.println(s2.equals(s3));
	   System.out.println("-----------------");
	   
	   //by using == operator
	   System.out.println(s1==s2);
	   System.out.println(s2==s3);
	   System.out.println("-------------------");
	   
	   //by using compareTo() method
	   System.out.println(s1.compareTo(s2));
	   System.out.println(s2.compareTo(s3));
   }
}
