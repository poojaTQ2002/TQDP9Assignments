package com.containment;
class Cake
{

		
		private String flavour;
		private float price;

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

	public class MyBakery {
		
		private String bakeryName;;
		private static int noOfCakes=0;
		private static double earnings=0.0;
		Cake cake;
		
		public MyBakery() {
			// TODO Auto-generated constructor stub
		}
		
		MyBakery(String bakeryname)
		{
			this.bakeryName=bakeryname;
		}
		
		public Cake getCake()
		{
			return cake;
		}
		
		// order cake
		public void setCake(Cake cake)
		{
		  this.cake=cake;
		  noOfCakes++;
		  earnings+=cake.getPrice();
			
		}
			
		public  String getBakeryName() {
			return bakeryName;
		}

		public  void setBakeryName(String bakeryName) {
			this.bakeryName = bakeryName;
		}

		public static int getNoOfCakes() {
			return noOfCakes;
		}

		public static void setNoOfCakes(int noOfCakes) {
			MyBakery.noOfCakes = noOfCakes;
		}

		public static double getEarnings() {
			return earnings;
		}

		public static void setEarnings(double earnings) {
			MyBakery.earnings = earnings;
		}

		public static void main(String[] args) {
			
			MyBakery b1= new MyBakery("Cake Confection");
			
			Cake c1 = new Cake("Butterscotch",450);
			Cake c2 = new Cake("Truffle",690);
			Cake c3= new Cake("Pineapple",350);
			
			System.out.println(b1.getBakeryName());
			System.out.println("-------------------------------------");
			
			b1.setCake(c3);
			b1.setCake(c2);
			b1.setCake(c3);
			
			
			System.out.println("Total cakes ordered:"+MyBakery.noOfCakes);
			System.out.println("Total earning:"+MyBakery.earnings);
			
			
			
			
		}

	}
