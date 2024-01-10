package com.wordLogic;

public class ReverseWordByWord2 
{
	static void reverseWordbyWord(String st)
	{
		String arr[]=st.split("\\s");
		String revst="";
		revst=revst+arr[0]+" ";
		
		for(int i=1;i<arr.length-1;i++)
		{
			//String word=arr[i];
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				revst=revst+arr[i].charAt(j);
			}
			revst=revst+" ";
		}
		revst=revst+arr[arr.length-1];
		System.out.println(revst);
	}
   public static void main(String[] args)
   {
	  String st="I Love India";
	  reverseWordbyWord(st);
   }
}
