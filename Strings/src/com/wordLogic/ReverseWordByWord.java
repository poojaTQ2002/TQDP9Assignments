package com.wordLogic;

public class ReverseWordByWord 
{
	static void reverseWordbyWord(String st)
	{
		String arr[]=st.split("\\s");
		String revst="";
		for(int i=0;i<arr.length;i++)
		{
			//String word=arr[i];
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				revst=revst+arr[i].charAt(j);
			}
			revst=revst+" ";
		}
		System.out.println(revst);
	}
   public static void main(String[] args)
   {
	  String st="I Love India";
	  reverseWordbyWord(st);
   }
}
