package com.staticDemo;

public class StaticDemo1 
  {
     int x=10;
     static int y=10;
     
     void show()
     {
    	 x++;
    	 y++;
    	 System.out.println("x :"+x);
    	 System.out.println("y :"+y);
     }
     public static void main(String[] args) 
     {
	   StaticDemo1 o1=new StaticDemo1();
	   o1.show();
	   System.out.println("******************");
	   StaticDemo1 o2=new StaticDemo1();
	   o2.show();
	   
	}
  }
