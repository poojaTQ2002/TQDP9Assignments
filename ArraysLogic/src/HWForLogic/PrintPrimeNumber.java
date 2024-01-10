package HWForLogic;

import java.util.Arrays;

public class PrintPrimeNumber 
{
	static void findPrimeNumner(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<arr[i];j++)
			{
			   if(arr[i]%j==0)
			   {
				   isPrime=false;
				   break;
			   }
			}
			if(isPrime)
				System.out.println(arr[i]);
		}
	}
	
   public static void main(String[] args) 
   {
	   int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	   System.out.println(Arrays.toString(arr));
		  System.out.println("--------------------");
		  System.out.println("Prime Number in Arrays is :");
		  findPrimeNumner(arr);
   }

}

