package Constructors;

public class Bank 
{
public static void main(String[] args) {
		
		Account a1= new Account(34567, "Neha", 5000);
		Account a2= new Account(10231, "Vikas", 10000);
		System.out.println(a1);
		
		System.out.println(" ***********");
		System.out.println(a2);
		
		System.out.println("----------------------");
		
		a1.withdraw(6000);
		a2.withdraw(3000);
		
		System.out.println("++++++++++++++++");
		
		a1.deposit(2000);
		

		
		
		
	}

}
