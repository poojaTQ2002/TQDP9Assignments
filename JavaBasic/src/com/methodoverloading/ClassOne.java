package com.methodoverloading;
class classone
{
	void method(String s1)
	  {
		  method(s1,s1+s1);
	  }
	  void method(String s1,String s2,String s3)
	  {
		  System.out.println(s1+s2+s3);
	  }
}
public class ClassOne 
{
  public static void main(String[] args) 
  {
	classone one=new classone();
			one.method("Java");
  }
}
