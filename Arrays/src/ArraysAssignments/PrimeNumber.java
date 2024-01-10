package ArraysAssignments;

public class PrimeNumber 
{
	static void checkPrime(int ar[])
	{
		for(int i=0; i<ar.length; i++){
	        boolean isPrime = true;
	        
	        //check to see if the numbers are prime
	        for (int j=2; j<ar[i]; j++)
	        {
	            
	            if(ar[i]%j==0)
	            {
	                isPrime = false;
	                break;
	            }
	        }
	        //print the number
	        if(isPrime)
	        
	        	System.out.println("Prime number is :"+ar[i]);
	        	//System.out.println(ar[i]);
	        

	            
		}
		
	}
	
//		static void printAlternatePrimeNumber(int[] ar)   
//		{   
//			int i;
//		
//		//if the value of temp variable is odd, we do not print the prime number  
//		//if the value of temp variable is even, we print the prime number  
//		int temp = 2;   
//		for(int num = 2; num <= ar.length-1; num++)   
//		{   
//		//checking the number is prime or not  
//		if (checkPrime(ar[i]) == 1)   
//		{    
//		//prints the prime number if temp is even  
//		if (temp % 2 == 0)   
//		System.out.print(num + " ");   
//		//increments the temp variable by 1  
//		temp ++; 
//		}
//		}
//		  
//	}
	
  public static void main(String[] args)
  {
	 int arr[]= {1,2,3,4,5,6,7,8,9,10};
	 checkPrime(arr);
  }
}
