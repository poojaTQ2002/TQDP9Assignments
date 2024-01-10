package com.abstractclass;
abstract class Parent
{
	public abstract void cook();
	void wash()
	{
		System.out.println("wash..");
	}
	
}
class Child extends Parent
{

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("Cooking");
	}
	
}
public class ParentClass 
{
   public static void main(String[] args)
   {
	 Child c=new Child();
	 c.wash();
	 c.cook();
   }
}
