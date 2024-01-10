package com.ForLoop;

public class AsciiValue {
	public static void calculateascii()
	{
		char ch;
		for(ch='A';ch<='Z';ch++)
		{
			int asciivalue=(int)ch;
			System.out.println("Ascii Value A to Z is :"+asciivalue);
		}
	}
	public static void main(String[] args) {
		calculateascii();
	}

}
