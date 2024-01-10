package com.StringAssignments2;
//12. Unique words

public class UniqueWordQ12
{
	static void findUniqueWords(String s)
	{
		 int count;
		 // Extract words from string
	     // using split() method
	     String[] words = s.split(" ");
	     // Iterating over the words array
	     for (int i = 0; i < words.length; i++)
	     {
	    	 // Setting count of current word to one
	         count = 1;
	         for (int j = i + 1; j < words.length; j++) 
	         {
	            if (words[i].equalsIgnoreCase(words[j]))
	            {
	            	// If word found later in array
	                // increment the count variable
	                count++;
	                words[j] = "";
	            }
	         }
	         // If count of current word is one print it
	        if (count == 1 && words[i] != "")
	        	System.out.println(words[i]);
	        }
	}
   public static void main(String[] args)
   {
	  String s="Home Sweet Home";
	  System.out.println(s);
	  System.out.println("-----------------");
	  findUniqueWords(s);
   }
}
