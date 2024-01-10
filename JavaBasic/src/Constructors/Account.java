package Constructors;

public class Account {
	
	private int accNo;
	private String accName;
	private double balance;
	
	public Account() 
	{
	System.out.println("I  am in default construction");
	}
	
	public Account(int accNo, String accName, double balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void deposit(double amount)
	{
		this.balance+=amount;
		System.out.println("Account no:"+accNo+"  has been credited to :"+amount);
		System.out.println("Account no:"+accNo+"  Balance :"+balance);
	}
	
	void withdraw(double amount)
	{
		if((balance-amount)>0)
		{
			balance-=amount;
			System.out.println("Account no:"+accNo+" has been debited by :"+amount);
						
		}
		
		else
		{
			System.out.println("Account no:"+accNo+" has insufficient balance");
			
		}
		System.out.println("Account no:"+accNo+"  Balance :"+balance);
	}
	
	public String toString()
	{
		return "AccountNo :"+accNo+"\nName:"+accName+"\nBalance:"+balance;
	}
	

}

