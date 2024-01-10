package com.wordLogic;

public class StringReverse 
{
	static void reverseComplete(String st)
	{
		String revst="";
		for(int i=0;i<st.length();i++)
		{
			revst=revst+st.charAt(i);
		}
		System.out.println(revst);
	}
	static void reverseComplete2(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0,j=ch.length-1;i<ch.length/2;i++,j--)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		System.out.println(ch);
	}
  public static void main(String[] args)
  {
	 String st="I Love India";
	 reverseComplete(st);
	 reverseComplete2(st);
	 
  }
}
