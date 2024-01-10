package com.TernaryOperators;

public class ternary {
	public static void main(String[] args) {
		int num1,num2,num3;
		num1=52;
		num2=55;
		num3=40;
		int largestNum=(num1>num2)?((num1>num3)? num1:num3):((num2>num3)?num2:num3);
		System.out.println(largestNum);
	}

}
