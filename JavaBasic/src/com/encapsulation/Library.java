package com.encapsulation;

public class Library{
  public static void main(String[] args)
  {
	Book b1=new Book();
	b1.setId(101);
	b1.setBname("Harry Potter");
	b1.setPrice(560);
	
	Book b2=new Book();
	b2.setId(102);
	b2.setBname("Ramayan");
	b2.setPrice(1534);
	
	System.out.println("Book1:"+ b1.getBname()+" "+ b1.getPrice());
	System.out.println("Book2:"+ b2.getBname()+" "+ b2.getPrice());
	
	Book b3=new Book();
	System.out.println("Book1:"+ b3.getBname()+" "+ b3.getPrice());
	
	
	
	
  }
}
