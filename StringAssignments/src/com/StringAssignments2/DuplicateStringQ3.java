package com.StringAssignments2;
//3. Duplicate characters(Print and count) 
public class DuplicateStringQ3 
{
	static void findDuplicate(String s)
	{
		char ch[]=s.toCharArray();
		int count;
		for(int i = 0; i <s.length(); i++)
		{  
            count = 1;  
            for(int j = i+1; j <s.length(); j++)
            {  
                if(ch[i] == ch[j] && ch[i] != ' ') 
                {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    ch[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && ch[i] != '0')  
                System.out.println(ch[i]); 
		}
    }
	
	
    public static void main(String[] args) 
    {
    	String s="A cat is run on road";
    	System.out.println("Duplicate Character is :");
    	findDuplicate(s);
    	
    	
	}
    
}
