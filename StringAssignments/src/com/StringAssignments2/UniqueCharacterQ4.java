package com.StringAssignments2;
//4. Unique characters

public class UniqueCharacterQ4 
{
	static void uniqueChar(String str)
	{
		
		int count=0;
		boolean status;
		char str1[] = str.toCharArray();            
		for(int i=0;i<str1.length;i++)
		   {
			   count=1;
			   status=false;
			   for(int j=i-1;j>=0;j--)
			   {
				   if(str1[i]==str1[j])
				   {
					   status=true;
					   break;
				   }
			   }
			   if(status==false)
			   {
				   for(int k=i+1;k<str1.length;k++)
				   {
					   if(str1[i]==str1[k])
					   count++;
				   }
				   //find unique logic
			   if(count==1)
			   {
				   System.out.println(str1[i]);
			   }
	          }
		   }
	}
   public static void main(String[] args)
   {
	   String s="Programming";
	   System.out.println("Unique Character of given string is :");
	   uniqueChar(s);
   }
}
