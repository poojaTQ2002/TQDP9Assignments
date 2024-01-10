package com.StringAssignments2;

public class CountFrequencyOfCharacterQ2 
{
	static void countFequwncy(String str)
	{
		
		int freq=0;
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
				   //find feequency logic
			   System.out.println(str1[i]+" ------> "+count);
	          }
		   }
	}
  public static void main(String[] args) 
  {
	String s="Pooja";
	countFequwncy(s);
  }
}
