package com.wordLogic;

public class MostRepeatedWord
{
	static void findRepesredword(String st)
	{
		String starr[]=st.split("\\s");
		int count;
		int maxLength=0;
	    String mWord="";
		
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
			if(count>maxLength)
			{
				maxLength=count;
				mWord=starr[i];
			}
		}
		
		System.out.println("Most Repeated Word is :"+mWord);
	}
		
	
   public static void main(String[] args) 
   {
	  String st="Jingle bell jingle bell jingle all the way";
	  findRepesredword(st);
   }
}
