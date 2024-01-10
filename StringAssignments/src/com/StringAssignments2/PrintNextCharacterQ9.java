package com.StringAssignments2;

//9. print next alphabet of each character  Java - Kbwb


public class PrintNextCharacterQ9 
{
	static void printNextAlphabet(String s)
	{
		//char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			ch++;
			System.out.print(ch);
		}
		
	}
   public static void main(String[] args)
   {
	  String s="Java";
	  System.out.println("Orignanl String is :"+s);
	  System.out.println("-------------------");
	  System.out.println("Next Alphabet Of each Character :");
	  printNextAlphabet(s);
	  
   }
}
