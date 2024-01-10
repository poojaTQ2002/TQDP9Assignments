package com.LoopAssignment;
//WAP to print odd numbers from 521 to 229 using while loop
public class PrintOddNum {
	public static void oddNumber()
	{
		int i=229;
		while(i<=521)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	public static void main(String[] args) 
	{
		oddNumber();
	}

}
