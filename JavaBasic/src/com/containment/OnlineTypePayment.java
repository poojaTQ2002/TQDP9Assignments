package com.containment;

import java.util.Scanner;

public class OnlineTypePayment 
{
   public static void onlinePayment()
   {
	   Scanner sc=new Scanner(System.in); 
	   System.out.println("Enter Payment mode : \n1.Cash\n2.Card");
	   int mode=sc.nextInt();
	   if(mode==1)
	   {
		   System.out.println("Payment done by cash...");
	   }else
	   {  
		   System.out.println("Which card is use: \1.DebitCredit");
		   String cardtype=sc.next();
	   }
	   String op=sc.next();
	   switch(cardtype)
	   {
	   case "Card":
		   
		   
		   System.out.println("Enter card number :");
		   int cardnum=sc.nextInt();
		   System.out.println("Enter cvv :");
		   String cvv=sc.next();
		   break;
		   
	   case "Cash":
		   
		   break;
		}
  }
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   
	   onlinePayment();
	   
   }
}
