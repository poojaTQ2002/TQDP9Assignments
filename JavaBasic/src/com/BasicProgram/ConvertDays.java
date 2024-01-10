package com.BasicProgram;

public class ConvertDays {
	public static void main(String args[])
	{
		int day,year,week;
		day=365;
		year=day/365;
		System.out.println("Days into Years is :"+year);
		week=(day-(year*365))/7;
		System.out.println("Days into Weeks is :"+week);
		day=day-((year*365)+(week*7));
		System.out.println("Days into Days is :"+day);
		
	}

}
