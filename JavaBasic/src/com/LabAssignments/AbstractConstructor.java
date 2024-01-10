package com.LabAssignments;
abstract class MyHouse
{
	MyHouse()
	{
		System.out.println("This is constructor is a abstract class");
	}
	abstract void a_method();
	void show()
	{
		System.out.println("This is a normal method");
	}
}
class MyPerson extends MyHouse
{

	@Override
	void a_method()
	{
		// TODO Auto-generated method stub
		System.out.println("This is a abstract method");
	}
	
}
public class AbstractConstructor 
{
  public static void main(String[] args) 
  {
	 MyPerson p=new MyPerson();
	 p.show();
	 p.a_method();
  }
}
