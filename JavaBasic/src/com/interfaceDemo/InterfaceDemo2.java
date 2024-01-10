package com.interfaceDemo;
interface Payment
{
	void pay(float amount);

}

class Student implements Payment
{
    int id;
    String name;
    double qfees;
    
    Student()
    {
    	
    }

    Student(int id, String name, double qfees)
    {
    	this.id=id;
    	this.name=name;
    	this.qfees=qfees;
    }

	@Override
	public void pay(float amount) {
		
		System.out.println("Id: "+id+ "  Name:"+name);
		System.out.println("Your total fees:"+qfees);
		System.out.println("Fees Paid:"+amount);
		if((qfees-amount)!=0)
			System.out.println("Remaining fees to be paid:"+(qfees-amount));

		
	}
    
    
}

class Celebrity implements Payment
{
	String adharCard;
  	String celebname;
  	double income;
  	
  	public Celebrity() {
		// TODO Auto-generated constructor stub
	}

	public Celebrity(String adharCard, String celebname) {
		super();
		this.adharCard = adharCard;
		this.celebname = celebname;
		
	}

	@Override
	public void pay(float amount) {
	 
		double taxAmount;
		System.out.println("Welcome to Tax Payment :"+celebname);
		System.out.println("Total earnings:"+amount);
		if(amount>1000000)
			taxAmount=0.3*amount;
		else if(amount>700000)
			taxAmount=0.2*amount;
		else if(amount>500000)
			taxAmount=0.1*amount;
		else
			taxAmount=0;
		
    	System.out.println("Tax to be paid:"+taxAmount);
    	income= amount-taxAmount;
    	System.out.println("Income after paying tax:"+income);
					
	}
  	
	

}

public class InterfaceDemo2 {
	
	public static void main(String[] args) {
		
		Payment p;
		
	     p= new Student(101,"Neha", 34000);
	     p.pay(23000);
	     
	     System.out.println("------------------------------------");
	     
	     p= new Celebrity("GH7836", "Amitabh Bachchan");
	     p.pay(900000);
		
		
	}

}


