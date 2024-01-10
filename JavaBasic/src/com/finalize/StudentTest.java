package com.finalize;

public class StudentTest 
{
  public static void main(String[] args) 
  {
	 Student s=new Student(1,"Pooja");
	 System.out.println(s);
	 s=null;
	 System.gc();
  }
}
