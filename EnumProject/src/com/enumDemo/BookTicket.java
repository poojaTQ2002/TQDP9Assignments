package com.enumDemo;

import java.util.Scanner;

public class BookTicket 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose ticket Type :");
		System.out.println("1. Standard :"+MovieSeats.STANDARD.price);
		System.out.println("2. Premium :"+MovieSeats.PREMINUM.price);
		System.out.println("3. Recliner :"+MovieSeats.RECLINER.price);
		
		int seatType=sc.nextInt();
		
		System.out.println("Enter Nimber of Seats :");
		int n=sc.nextInt();
		
		MovieSeats ms=null;
		
		 switch (seatType) 
		 {
		   case 1: ms=MovieSeats.STANDARD;
		           break;
		   case 2: ms=MovieSeats.PREMINUM;
                   break;
		   case 3: ms=MovieSeats.RECLINER;
                   break;
		  default: System.out.println("Error in input");
		           System.exit(0);
		}
		 
		 System.out.println("---------------------------------------");
		 System.out.println("Ticket type :"+ms);
		 //System.out.println("Ticket type :"+ms);
		 System.out.println("Total Ticket  :"+n);
		 System.out.println("Total Price :"+(n*(ms.price)));
		 
    	
	}
}
