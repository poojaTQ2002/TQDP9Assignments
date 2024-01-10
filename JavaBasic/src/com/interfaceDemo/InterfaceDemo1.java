package com.interfaceDemo;
interface Bakery
{
  String bname="MyBakery"; // public static final
   void  bake();  // public abstract

}

class Cake implements Bakery
{

	@Override
	public void bake() {
		 System.out.println("Cakes:Pineapple, Butterscotch, Chocolate");
		
	}
	

}

class Biscuit implements Bakery
{

	@Override
	public void bake() {
	   System.out.println("Biscuits:Almond, Chocochips, KajuPista");
		
	}
	
	public void minOrder()
	{
		System.out.println("Min order of biscuits is: 250g");
	}


}

public class InterfaceDemo1 {
	
	public static void main(String[] args) {
		
		System.out.println("Bakery name:"+Bakery.bname);
		System.out.println("-----------------------------------");
//		
//		Cake c= new Cake();
//		c.bake();
//		
//		Biscuit b= new Biscuit();
//		b.bake();
//		b.minOrder();
		
		Bakery b;
		b= new Cake();
		b.bake();
		
		b= new Biscuit();
		b.bake();
		//b.minOrder();
		
		
		
		
	}

}
