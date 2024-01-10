package com.enumDemo;

enum Season{WINTER,SUMER,SPRING,MONSOON};

public class EnumDemo2
{
   public static void main(String[] args)
   {
	  Season s=Season.MONSOON;
	  switch (s) 
	  {
	  case WINTER: System.out.println("Woolean Clothes");
	               break;
	  case SPRING: System.out.println("Full Sleaves Clothes");
                     break;
	  case SUMER: System.out.println("Cotton Clothes");
                   break;
	  case MONSOON: System.out.println("Carry Umbrella");
                    break;
	  default: System.out.println("Error...");
		
	}
   }
}
