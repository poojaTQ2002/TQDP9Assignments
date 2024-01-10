package com.Logical;

public class StringArraySort 
{
	static void sortString(String str[])
	{
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].length()==str[j].length())
				{
					if(str[i].compareTo(str[j])>0)
                        {
                        	String temp=str[i];
                        	str[i]=str[j];
                        	str[j]=str[i];
                        }

				}
				else if(str[i].length()>str[j].length())
				{
					String temp=str[i];
                	str[i]=str[j];
                	str[j]=str[i];
				}
			}
		}
	}
   public static void main(String[] args)
   {
	  String arr[]= {"Python","c","Angular","Java"};
	  //System.out.println(arr);
	  sortString(arr);
   }
}
