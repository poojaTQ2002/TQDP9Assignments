package com.encapsulation;

import java.util.Scanner;

public class IndianGame
{
  public static void main(String[] args) 
  {
			Scanner sc=new Scanner(System.in);
			String country;
			String nationalGame;
			System.out.println("Choose any country :");
			country=sc.next();
			switch(country)
			{
			case "India":
				nationalGame="Hockey";
				System.out.println(nationalGame);
				break;
			case "China":
				nationalGame="Table Tennis";
				System.out.println(nationalGame);
				break;
			case "Bangaldesh":
				nationalGame="Kabaddi";
				System.out.println(nationalGame);
				break;
			case "Italy":
				nationalGame="Football";
				System.out.println(nationalGame);
				break;
			case "united states":
				nationalGame="Baseboll";
				System.out.println(nationalGame);
				break;
				default:
					System.out.println("Information not available");
				
				
			       
			}
		}
  }

