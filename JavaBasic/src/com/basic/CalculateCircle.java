package com.basic;

public class CalculateCircle {
	public static void main(String args[])
	{
		int radius;
		double area,perimeter,pi;
		radius=4;
		pi=3.14;
		area=pi*radius*radius;
		System.out.println("Area :"+area);
		perimeter=2*pi*radius;
		System.out.println("Perimeter :"+perimeter);
	}

}
