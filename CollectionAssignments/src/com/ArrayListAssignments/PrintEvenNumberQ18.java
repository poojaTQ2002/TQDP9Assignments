package com.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Iterator;

//18.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)

public class PrintEvenNumberQ18 
{
  public static void main(String[] args) 
  {
	ArrayList<Integer>ar=new ArrayList();
	for(int i=1;i<=50;i++)
	{
	   ar.add(i);
	}
	Iterator<Integer>iterator=ar.iterator();
	while(iterator.hasNext())
	{
		int num=iterator.next();
		if(num%2==0)
		{
			System.out.println("Even Number is :"+num);
		}
	}
	
  }
}
