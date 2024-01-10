package com.StringAssignments1;
//13.	Write a Java program to count total number of words in a string.

public class CountWordinString 
{
	static int wordCount(String str)  
    {  
      int count=0;  
  
        char ch[]= new char[str.length()];     
        for(int i=0;i<str.length();i++)  
        {  
            ch[i]= str.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    }  
  public static void main(String[] args) {  
      String str ="I Love India";  
     System.out.println("Total number of words in a String is :"+wordCount(str));   
}  
}
