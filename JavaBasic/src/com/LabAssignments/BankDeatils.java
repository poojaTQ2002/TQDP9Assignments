package com.LabAssignments;
abstract class Bank
{
	abstract void getBalance();
	
}
class Ab extends Bank
{

	@Override
	void getBalance() 
	{
		System.out.println("Rs.100");
		
	}
	
}
class Bb extends Bank
{

	@Override
	void getBalance() 
	{
		System.out.println("Rs.150");
		
	}
	
}
class C extends Bank
{

	@Override
	void getBalance() 
	{
		System.out.println("Rs.200");
		
	}
	
}
public class BankDeatils
{
   public static void main(String[] args) 
   {
	 Ab a=new Ab();
	 a.getBalance();
	 Bb b=new Bb();
	 b.getBalance();
	 C c=new C();
	 c.getBalance();
	 
   }
}
