package com.Logical1;

public class ExtractDigit {
	public static void findDigit(int num)
	{
		do
		{
			/*int rem=num%10;
			System.out.println(rem);
			int num=num/10;
			System.out.println(num);*/
			System.out.println(num%10);
			num/=10;
			
		}while(num!=0);
	}
	public static void main(String[] args) {
		int n=123;
		findDigit(n);
				
	}

}
