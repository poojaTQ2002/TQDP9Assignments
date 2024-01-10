package com.StringAssignments1;

public class CountVowelsAndConsonants
{
	static void countVowelConsonants(String s)
	{
		int vCount=0;
		int cCount=0;
		s=s.toLowerCase();
		for(int i = 0; i < s.length(); i++) 
		{
			//Checks whether a character is a vowel    
	        if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') 
	        {
	        	//Increments the vowel counter    
	            vCount++;    
	        }    
	       //Checks whether a character is a consonant    
	       else if(s.charAt(i) >= 'a' && s.charAt(i)<='z') 
	       {      
	           //Increments the consonant counter    
	           cCount++;    
	       }    
	    }
		System.out.println("Number of vowels: " + vCount);    
	    System.out.println("Number of consonants: " + cCount);    
	    }    
	
   public static void main(String[] args) 
   {
	   String str ="This is a really simple sentence";  
	   countVowelConsonants(str);
   }
}
