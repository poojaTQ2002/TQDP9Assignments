package com.StringAssignments2;
//10. Count the words
public class CountWordQ10 
{
	 static int wordcount(String s)  
     {  
       int count=0;  
       char ch[]= new char[s.length()];     
         for(int i=0;i<s.length();i++)  
         {  
             ch[i]= s.charAt(i);  
             if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                 count++;  
         }  
         return count;  
     } 
	 //count character
	 static void CharcterCount(String s)
	 {
		 int count=0;
		 for(int i = 0; i < s.length(); i++)
		 {    
	            if(s.charAt(i) != ' ')    
	                count++; 
		 }
		 System.out.println("Total Character is :"+count); 
	 }
   public static void main(String[] args) {  
       String str ="java is fun";  
      System.out.println("Total word is :"+wordcount(str)); 
      
      CharcterCount(str);
 }  
}  
