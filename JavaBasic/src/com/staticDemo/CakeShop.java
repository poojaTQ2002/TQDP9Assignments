package com.staticDemo;
class Cake {
	private String flavour;
	private float price;

	static int totalcount=0;
	
	{
		
		totalcount++;
	
	}

	Cake() {

	}

	Cake(String flavour, float price) {
		this.flavour = flavour;
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

public class CakeShop {
	
		
	public static void main(String[] args) {
		
		Cake c1 = new Cake("Butterscotch",450);
		Cake c2 = new Cake("Truffle",690);
		Cake c3= new Cake("Pineapple",350);
		
		System.out.println("Types of cakes :"+Cake.totalcount);
		
		
		
	}

}
