package com.abstractclass;
abstract class Machine
{  
	private String name;
	
	public Machine() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Machine(String name) 
	{
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void rotate()
	{
		System.out.println("Machine is rotate");
	}
	abstract void crush ();

}
class Juicer extends Machine
{

	@Override
	void crush()
	{
		System.out.println("crush is juice");
		
	}
	void filter()
	{
		System.out.println("Filtering...");
	}
	
}
abstract class Mixer extends Machine
{
	void crush()
	{
		System.out.println("Cursh...");
	}
	void blend()
	{
	  System.out.println("Blending....");	
	}
}
public class MachineDetails 
{
  public static void main(String[] args) 
  {
	 Juicer j1=new Juicer();
	 j1.crush();
	 j1.rotate();
	 j1.filter();
	 System.out.println("*********************************");
	 Machine m1=new Juicer();
	 m1.rotate();
	 m1.crush();
  }
}
