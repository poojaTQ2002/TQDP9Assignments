package com.Lab;

public class Computer 
{
	static void printPattern(String s)
		{
			int sp1=s.indexOf(" ");
			int sp2=s.lastIndexOf(" ");
			int len=s.length();
			System.out.println(s.substring(sp2+1,len)+" "+s.substring(sp1+1,sp2)+" "+s.substring(0,sp1));
        }
		
   public static void main(String[] args)
   {
	   String str="computer is fun";
	   printPattern(str);
   }
}
