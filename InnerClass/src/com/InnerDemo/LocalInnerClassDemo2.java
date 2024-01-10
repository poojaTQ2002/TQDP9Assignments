package com.InnerDemo;

class Mall
{
	private String mallName;
	private String loc="Pune";
	void doShopping()
	{
		class Cart
		{
			String item;
			double price;
			static double bill=0;
			public void addItem(String item,double price)
			{
				this.item=item;
				this.price=price;
				System.out.println(this.item+" :"+this.price);
				bill+=price;
			}
			void displayBill()
			{
				System.out.println("---------------");
				System.out.println("Total bill :"+bill);
				System.out.println("Thank you for Shopping...");
			}
		}
		Cart c1=new Cart();
		c1.addItem("Laptop",54000);
		c1.addItem("Chocolate",50);
		c1.addItem("Juice",150);
		c1.displayBill();
	}
}
public class LocalInnerClassDemo2
{
   public static void main(String[] args) 
   {
	  Mall m=new Mall();
	  m.doShopping();
   }
}
