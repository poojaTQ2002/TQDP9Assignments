package com.Basics;

public class StringIntern
{
   public static void main(String[] args) 
   {
	   //intern use for memory management perpose
	   //it create extra copy of the heap string object in the string constant pool 
	  String s1="Java";
	  String s2=new String("Java");
	  System.out.println(s1==s2);
	  s2=s2.intern();
	  System.out.println(s1==s2);
   }
}
