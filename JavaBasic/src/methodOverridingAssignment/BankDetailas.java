package methodOverridingAssignment;
class bank
{
	void dispaly()
	{   System.out.println("Account is default");
		System.out.println("rate of interest which is 2%. ");
	}
}
class Saving extends bank
{
	void dispaly()
	{   System.out.println("Saving....");
		System.out.println( "rate of interest which is 3% ");
	}
}
class Current extends bank
{
	void dispaly()
	{   System.out.println("Current....");
		System.out.println( "rate of interest which is 5% ");
	}	
}
public class BankDetailas 
{
   public static void main(String[] args) 
   {
	  bank b=new bank();
	  b.dispaly();
	  System.out.println("--------------------------------------------");
	  Saving s=new Saving();
	  s.dispaly();
	  System.out.println("---------------------------------------------");
	  Current c=new Current();
	  c.dispaly();
   }
}
