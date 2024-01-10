package com.staticDemo;
class Counter1
{
	int data;
	static int count=0;
	
	{
		count++;
	}
	
	Counter1()
	{
		data=10;
		//count++;
	}
	
	Counter1(int data)
	{
		//this();
		this.data=data;
	}
	

}

public class HitCounter {

		
	public static void main(String[] args) {
		
		Counter1 c1= new Counter1();
		
		System.out.println("Data:"+c1.data);
		System.out.println("Count:"+Counter1.count);
			
		
		Counter1 c2= new Counter1(45);
		System.out.println("Data:"+c2.data);
		System.out.println("Count:"+Counter1.count);
		
		Counter1 c3 = new Counter1();
		System.out.println("Data:"+c3.data);
		System.out.println("Count:"+Counter1.count);
		
		
		
	}

}

