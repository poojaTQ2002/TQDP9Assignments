package com.methodoverloading;

public class Test1 
{
    public static void add(int a,float b)
    {
    	System.out.println("Add"+a+b);
    }
    public static void add(float c,int d)
    {
    	System.out.println("Add"+c+d);
    }
    public static void main(String[] args)
    {
		Test1 t1=new Test1();
		//t1.add(3, 4);//ambiguty
	}
}
