package com.methodoverloading;
public class Addition
{
	 void sum(int num1,float num2)
	{
		System.out.println("Addition int and float is :"+num1+num2);
	}
	void sum(int num1,int num2)
	{
		System.out.println("Addition int is :"+num1+num2);
	}
	 void sum(long num1,float num2)
	{
		System.out.println("Addition long and float is :"+num1+num2);
	}
	 double sum(int num1,double num2)
	{
		return (num1+num2);
	}
	public static void main(String[] args) 
	{
		Addition a1=new Addition();
		a1.sum(2,3);
		a1.sum(5,12f);
		a1.sum(6l,7f);
	}
   
}
