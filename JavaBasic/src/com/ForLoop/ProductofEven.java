package com.ForLoop;

public class ProductofEven {
	public static long producteven()
	{
		long product=1;
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
				product*=i;
			
		}
		return product;
	
	}
	public static void main(String[] args) {
		System.out.println("Product is :"+producteven());
	}

}
