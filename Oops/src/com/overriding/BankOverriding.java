package com.overriding;
class Account
{
   private int accNo;
   private String name;
   protected double balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	} 
	
	void deposit(float amount)
	{
		balance+= amount;
		System.out.println(accNo);
		System.out.println("Account is credited by:"+ amount);
		System.out.println("New balance :"+balance);
	}
	
	void withdraw(float amount)
	{

        if((balance-amount)>0)
        {
        balance-=amount;	
		System.out.println(accNo);
		System.out.println("Account is debited by:"+ amount);
		System.out.println("New balance :"+balance);
        }
        
        else
        {
        	System.out.println(accNo);
        	System.out.println("Insufficient Balance:"+balance);
        }
        
	}
   
}

class SavingAccount extends Account
{
    private String panNo;

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int accNo, String name, double balance, String panNo) {
		super(accNo, name, balance);
		this.panNo = panNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	
	void deposit(float amount)
	{
		if(((balance+amount)>50000)&&(panNo==null))
		{
			System.out.println("Please provide pan Number as balance exceeds 50000");
			
		}
		else
		{
			super.deposit(amount);
		}
	}
	
	
	
	@Override
	public String toString() {
		return "SavingAccount [panNo=" + panNo + ", getAccNo()=" + getAccNo() + ", getName()=" + getName()
				+ ", getBalance()=" + getBalance()  + "]";
	}



}


public class BankOverriding {
	
	public static void main(String[] args) {
		
		Account a1= new Account(1234,"Arpita", 1000);
		a1.deposit(2000);
		
		System.out.println("------------------------------");
		
		a1.withdraw(3500);
		
		a1.deposit(56000);
		
		System.out.println("======================================");
		
		SavingAccount s1= new SavingAccount(1011, "Pranay", 20000);
		s1.deposit(20000);
		s1.deposit(20000);
		s1.setPanNo("A906GH45");
		s1.deposit(20000);
		
		
	}

}

