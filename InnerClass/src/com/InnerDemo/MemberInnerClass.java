package com.InnerDemo;

class Bank
{
	private static String bname="SBI Bank";
	static String bankloc;
	static String ifscCode;
	String aname;
	int accNo;
	double balance;
	
	static 
	{
		bankloc="Pune";
	    ifscCode="SBI6547DF";
	}
	Bank()
	{
		
	}
	public Bank(String aname, int accNo, double balance) {
		super();
		this.aname = aname;
		this.accNo = accNo;
		this.balance = balance;
	}
	void displayBankDetails()
	{
		System.out.println(bname+" "+bankloc);
		System.out.println("IFSC Code :"+ifscCode);
	}
	class Locker
	{
		int lockerId;
		String pass;
		static double LockerRent=2000;
		Locker()
		{
			
		}
		public Locker(int lockerId, String pass) 
		{
			super();
			this.lockerId = lockerId;
			this.pass = pass;
		}
//		void displayLockerDetails()
//		{
//			System.out.println(" Locker Id :"+lockerId);
//			System.out.println("Password :"+pass);
//		}
		void displayLockerDetails()
		{
			System.out.println("This locker belongs to :"+aname+" with account no :"+accNo);
			System.out.println("Locker id :"+lockerId);
			System.out.println("Rent :"+LockerRent);
		}
		
	}
	
}
public class MemberInnerClass
{
	
   public static void main(String[] args)
   {
	//BankLocker
	   //1st way
	   Bank cust1=new Bank("Pooja",52162,13000);
	   cust1.displayBankDetails();
	   System.out.println("------------");
	   Bank.Locker locker1=cust1.new Locker(20,"Me123");
	   locker1.displayLockerDetails();
	   System.out.println("-----------");
	   
	   //2nd way
	   Bank.Locker locker2=new Bank("Reetu",6541,5000).new Locker(30,"RR123");
	   locker2.displayLockerDetails();
   }
}
