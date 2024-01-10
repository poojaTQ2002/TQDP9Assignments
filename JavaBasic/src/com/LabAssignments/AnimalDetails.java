package com.LabAssignments;
abstract class Animals
{
	abstract void cats();
	abstract void dogs();
}
class Cats extends Animals
{
	Cats()
	{
		
	}
	void voice()
	{
		System.out.println("Cats meow");
	}
	@Override
	void cats() {
		// TODO Auto-generated method stub
		
	}
	
}
class Dogs extends Animals
{
	Dogs()
	{
		
	}
	void voice()
	{
		System.out.println("Dogs bark");
	}
	
	@Override
	void dogs() {
		// TODO Auto-generated method stub
		
	}
}
public class AnimalDetails 
{
  public static void main(String[] args) 
  {
	 Dogs d=new Dogs();
	 d.voice();
	 System.out.println("-------------------");
	 Cats c=new Cats();
	 c.voice();
			 
  }
}
