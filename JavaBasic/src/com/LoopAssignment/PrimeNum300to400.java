package com.LoopAssignment;
//11.Find all prime number between 400 to 300;
public class PrimeNum300to400 {
	public static void printPrimeNumber()
	{
		for (int i=300;i<=400;i++)         
         { 		  	  
            int counter=0; 	  
            for(int num=i;num>=1;num--)
	         {
                if(i%num==0)
	             {
		           counter = counter + 1;
	             }
	         }
	       if (counter ==2)
	       {
				System.out.println(i);
		   }
         }
	}
	public static void main(String[] args) 
	{
		printPrimeNumber();
	}

}
