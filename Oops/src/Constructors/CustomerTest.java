package Constructors;

import java.util.Scanner;

public class CustomerTest 
{ 
     
	    /*Customer c1=new Customer();
	    c1.setCustomerid(101);
	    c1.setCustomername("Pooja");
	    c1.setCustomeremail("pooja2002@gmail.com");
	    c1.setCustomercontact(9156006626l);
	    c1.setCustomerpass("pass123");
	    System.out.println("Id :"+c1.getCustomerid());
	    System.out.println("Nmae :"+c1.getCustomername());
	    System.out.println("email :"+c1.getCustomeremail());
	    System.out.println("contract :"+c1.getCustomercontact());
	    System.out.println("Pass :"+c1.getCustomerpass());
	    System.out.println("****************************************");
	    
	    Customer c2=new Customer(1, "sonu", "sonu2008@gmail.com", 9156006626l, "jat124");
	    System.out.println(c2);*/
		
		static Scanner sc=new Scanner(System.in);
		public static void customerdetails(Customer c1)
		{
			System.out.println("Enter customer Id : ");
			c1.setCustomerid(sc.nextInt());
			System.out.println("Enter customer name : ");
			c1.setCustomername(sc.next());
			System.out.println("Enter customer email : ");
			c1.setCustomeremail(sc.next());
			System.out.println("Enter customer contact : ");
			c1.setCustomercontact(sc.nextLong());
			System.out.println("Enter customer Pass : ");
			c1.setCustomerpass(sc.next());
	    }
		public static void main(String[] args) 
		{
			Customer c2=new Customer();
			customerdetails(c2);
			System.out.println(c2);
		}
		
    
  
}
