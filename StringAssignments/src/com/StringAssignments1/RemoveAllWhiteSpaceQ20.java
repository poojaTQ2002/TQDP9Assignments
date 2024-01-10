package com.StringAssignments1;
//20.	Write a Java program to remove all extra blank spaces from a given string.
public class RemoveAllWhiteSpaceQ20 
{
	static void removeSpace(String s)
	{
		{
	        
	        String op = "";
	 
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	 
	            // Checking whether is white space or not
	            if (!Character.isWhitespace(ch)) 
	            {
	                op += ch;
	            }
	        }
	        System.out.println(op);
	    }
//		   String str1="Java is Fun";
//		   str1 = str1.replaceAll("\\s+","");//using regex
//		   System.out.println("String after removing all the white spaces : " + str1);
	}
   public static void main(String[] args)
   {
	   String str = "Java is Fun";
	   removeSpace(str);
   }
}
