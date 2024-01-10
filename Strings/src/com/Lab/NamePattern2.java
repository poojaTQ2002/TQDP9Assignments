package com.Lab;

public class NamePattern2 
{
	static void printPattern(String s)
	{
		int sp1=s.indexOf(" ");
		int sp2=s.lastIndexOf(" ");
		int len=s.length();
		
		//P.M.B.
		System.out.println(s.charAt(0)+"."+s.charAt(sp1+1)+"."+s.charAt(sp2+1)+".");
		
	}
	static void printPattern2(String s)
	{
		int sp1=s.indexOf(" ");
		int sp2=s.lastIndexOf(" ");
		int len=s.length();
		
		//P.M.Borhade
		System.out.println(s.charAt(0)+"."+s.charAt(sp1+1)+"."+s.substring(sp2+1,len));
		
	}
	static void printPattern3(String s)
	{
		int sp1=s.indexOf(" ");
		int sp2=s.lastIndexOf(" ");
		int len=s.length();
		
		//Borhade Pooja Meghnath
		System.out.println(s.substring(sp2+1,len)+" "+s.substring(0,sp1)+" "+s.substring(sp1+1,sp2));
	}
		
	
   public static void main(String[] args)
   {
	   String str="Pooja Meghnath Borhade";
	   printPattern(str);
	   printPattern2(str);
	   printPattern3(str);
	   
	  
	   
	
   } 
}
