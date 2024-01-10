package com.Basics;

public class Method
{
  public static void main(String[] args)
  {
	String s="Java is Fun";
	System.out.println("Length is :"+s.length());
	
	//charAt
	
	System.out.println("Character at 1 :"+s.charAt(0));
	System.out.println("Character at last :"+s.charAt(s.length()-1));
	
	//concat:concat,+
	
	String s1="Hello";
	String s2="World";
	
	System.out.println(s1.concat(s2));
	System.out.println(s1+s2);
	
	//substring
	
	System.out.println(s.substring(1));
	System.out.println(s.substring(1,7));//print from 1st index till (7-1)index
	
	//contains
	
	System.out.println(s.concat("ava"));
	System.out.println(s.concat("pyth"));
	
	String s3="hello";
	System.out.println("---------------------------------");
	System.out.println(s1==s3);
	System.out.println(s1.equalsIgnoreCase(s3));
	
	//upper case and loewr case
	
	System.out.println(s1.toUpperCase());
	System.out.println(s1);
	
	String s4="HELLO";
	System.out.println(s4.toLowerCase());
	System.out.println(s4);
	
	//indexOf
	
	System.out.println(s.indexOf('a'));
	System.out.println(s.lastIndexOf('a'));
	System.out.println(s.indexOf("is"));
	
	//isEmpty
	String str="         ";
	System.out.println(str.isBlank());
	System.out.println(str.isEmpty());
	System.out.println("=================================");
	
	//trim
	String str2="     java     ";
	System.out.println(str2.length());
	str2=str2.trim();//remves leading and trailing white spaces
	
	System.out.println(str2.length());
	
	
  }
}
