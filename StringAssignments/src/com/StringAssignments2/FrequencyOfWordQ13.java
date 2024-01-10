package com.StringAssignments2;
//13. Frequency of words

public class FrequencyOfWordQ13
{
	static void findFrequencyWords(String st)
	{
		String starr[]=st.split("\\s");
		int count;
		
		for(int i=0;i<starr.length;i++)
		{
			count=1;
			for(int j=i+1;j<starr.length;j++)
			{
				if(starr[i].equalsIgnoreCase(starr[j]))
				{
					count++;
					
				}
			}
			System.out.println(starr[i]+" :"+count);
		}
	}
   public static void main(String[] args) 
   {
	  String s="Big black bug bit a big black dog on his big black nose"; 
	  System.out.println(s);
	  System.out.println("---------------------");
	  findFrequencyWords(s);
   }
}
