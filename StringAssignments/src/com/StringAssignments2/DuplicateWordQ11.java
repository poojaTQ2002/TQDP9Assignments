package com.StringAssignments2;
//11. Duplicate words

public class DuplicateWordQ11 
{
	static void findDuplicateWords(String s)
	{  
	        int count;  
	          
	        //Converts the string into lowercase  
	        s = s.toLowerCase();  
	          
	        //Split the string into words using built-in function  
	        String words[] = s.split(" ");  
	          
	        
	        for(int i = 0; i < words.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j < words.length; j++) {  
	                if(words[i].equals(words[j])) {  
	                    count++;  
	                    //Set words[j] to 0 to avoid printing visited word  
	                    words[j] = "0";  
	                }  
	            }  
	              
	            //Displays the duplicate word if count is greater than 1  
	            if(count > 1 && words[i] != "0") 
	            	
	                System.out.println(words[i]);  
	        }  
	}
   public static void main(String[] args) 
   {
	   String s="Big black bug bit a big black dog on his big black nose"; 
		  System.out.println(s);
		  System.out.println("-----------------");
		  System.out.println("Duplicate words in a given string : ");   
		  findDuplicateWords(s);
   }
   
	  
   
}
