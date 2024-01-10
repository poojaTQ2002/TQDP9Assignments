package com.basic;

public class PostfixPrefix {
	public static void main(String[] args) {
		//1
		int a=51;
		int s=a;
		System.out.println(+s);
		a++;
		System.out.println(+a);
		//2
		int b=5;
		int c=b;
		System.out.println(+c);
		++b;
		System.out.println(+b);
		//3
		int p=12;
		int v;
		int k=p-- + --p;
		System.out.println(v=p+++ ++p);
		System.out.println(+k);
		//4
		int num1=10;
		System.out.println(num1--);
		System.out.println(--num1);
		
		
	}

}
