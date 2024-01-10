package com.StringAssignments1;
//9.	WAP to split string into 2 tokens where string is “HELLO$WORLD”

public class SplitStringQ9
{
 public static void main(String[] args)
 {
	String s1="HELLO$WORLD";
	s1=s1+" ";
	char ch1='$',ch2;
	String s=" ";
	for(int i=0;i<s1.length();i++)
	{
		ch2=s1.charAt(i);
		if(ch1==ch2 || i==s1.length()-1)
		{
			System.out.print(s+" ");
			s=" ";
		}
		else
		{
			s=s+ch2;
		}
	}
 }
}
