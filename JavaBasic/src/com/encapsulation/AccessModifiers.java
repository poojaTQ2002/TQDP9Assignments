package com.encapsulation;

public class AccessModifiers 
{ private int a;
  int b;
  public int c;
  
  private void show()
  {
	  System.out.println("Private Method ");
  }
  void display()
  {
	  System.out.println("Defalut method");
  }
  public void printMe()
  {
	  System.out.println("Public method");
  }
  public static void main(String[] args) 
  {
	AccessModifiers a1=new AccessModifiers();
	a1.a=55;
	a1.b=54;
	a1.c=65;
	System.out.println(a1.a);
	System.out.println(a1.b);
	System.out.println(a1.c);
	a1.show();
	a1.printMe();
	a1.display();
	}
  
}
