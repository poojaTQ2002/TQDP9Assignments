package com.StringAssignments1;
//2.	Compare string using == when “” is present see same reference is there
//3.	Compare string using new operator when new is present see different reference is there


public class CompareStringQ2andQ3 
{
    public static void main(String[] args)
    {
		String s1="Java";
		String s2="Sql";
		
		String str1=new String("Programming Language");
		String str2=new String("Java is Portable");
		
		System.out.println(s1==s2);//compare reference :id
		System.out.println(s1.equals(s2));//compare value
		
		System.out.println("------------------");
		
		System.out.println(str1==str2);//compare reference :id
		System.out.println(str1.equals(str2));//compare value
	}
}
