package com.arrayList;

import java.util.ArrayList;

public class ArrayListDemo
{
	public static void main(String[] args) 
	{
       ArrayList<Integer> al= new ArrayList<Integer>(10);
	   al.add(10);
	   al.add(20);
	   al.add(30);
	   al.add(40);
	   al.add(50);
	   al.add(60);
	   al.add(70);
	   al.add(80);
	   al.add(90);
	   al.add(100);
	   System.out.println(al.size());
	   al.add(102);
	   System.out.println(al);
	   System.out.println(al.size());
	}
}
