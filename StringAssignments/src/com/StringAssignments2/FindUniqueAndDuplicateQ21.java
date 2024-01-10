package com.StringAssignments2;
/*21. String str1={"mamta@gmail.com", "pratik@gmail.com","vivek@gmail.com"}
String str2={"pratik@gmail.com","vivek@gmail.com","priya@gmail.com","bhushan@gmail.com"}
result: unique elements and duplicate elements of str2*/
        

public class FindUniqueAndDuplicateQ21
{
	static void UniqueAndDuplicate(String s)
	{
		int count;
		 
	     String[] words = s.split(" ");
	     
	     for (int i = 0; i < words.length; i++)
	     {
	    	
	         count = 1;
	         for (int j = i + 1; j < words.length; j++) 
	         {
	            if (words[i].equalsIgnoreCase(words[j]))
	            {
	            	
	                count++;
	                words[j] = "";
	            }
	         }
	        if (count == 1 && words[i] != "")
	        	System.out.println(words[i]);
	        }
	}
    public static void main(String[] args)
    {
    	String s1[]={"mamta@gmail.com", "pratik@gmail.com","vivek@gmail.com"};
    	String s2[]={"pratik@gmail.com","vive;k@gmail.com","priya@gmail.com","bhushan@gmail.com"};
	}
}
