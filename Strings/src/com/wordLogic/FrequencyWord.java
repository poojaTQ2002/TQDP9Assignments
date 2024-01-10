package com.wordLogic;

public class FrequencyWord
{
	static void findFrequency(String st)
	{
		String starr[]=st.split("\\s");
		int count;
		
		for(int i=0;i<starr.length;i++)
		{
			count=1;
			if(starr[i].equals("Visited"))
			{
				continue;
			}
			for(int j=i+1;j<starr.length;j++)
			{
				if(starr[i].equalsIgnoreCase(starr[j]))
				{
					count++;
					starr[j]="visites";
				}
			}
			System.out.println(starr[i]+" :"+count);
		}
		
			
	}
		
	
   public static void main(String[] args) 
   {
	  String st="A big cat run big mat there and ware";
	  findFrequency(st);
   }
}
