package Constructors;

public class Cycle 
{
   int accountNo;
   int noOfWheels;
   Cycle()
   {
	   System.out.println("I am default construction");
   }
   Cycle(int accountNo,int noOfWheels)
   {
	   this();
	   System.out.println("I am another construction");
   }
   public String toString()
   {
	   return "accountNo :"+accountNo+" "+"noOfWheels :"+noOfWheels;
   }
   public static void main(String[] args) 
   {
	   //Cycle c1=new Cycle();
	  // System.out.println(c1);
	   
	   Cycle c2=new Cycle(101,2);
	   System.out.println(c2);
	   
	   
   }
   
}
