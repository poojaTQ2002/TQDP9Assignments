package com.containment;

public class CarEngineTest 
{
  public static void main(String[] args) 
  {
	 CarEngine e1=new CarEngine("V engine");
	 CarEngine e2=new CarEngine("Diesel engine");
	 CarEngine e3=new CarEngine("Petrol engine");
	 
	 CarLab c1=new CarLab("Maruti",546125,e1);
	 CarLab c2=new CarLab("Tata Nexon",776125,e2);
	 CarLab c3=new CarLab("Mahindra Thar",586346,e3);
	 CarLab c4=new CarLab("Maruti",546125,e1);
	 
	 System.out.println(c1);
	 System.out.println(c2);
	 System.out.println(c3);
	 System.out.println(c4);
  }
}
