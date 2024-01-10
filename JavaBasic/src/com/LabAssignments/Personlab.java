package com.LabAssignments;
class Person
{
	public int number;
}
public class Personlab 
{
  public void doThis(int i,Person p)
  {
	  i=5;
	  p.number=8;
  }
  public static void main(String args[])
  {
	  int x=0;
	  Person p=new Person();
	  new Personlab().doThis(x, p);
	  System.out.println(x+" "+p.number);
  }
}
