package ArraysAssignments;

import java.util.Arrays;

//1. WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90] 
public class SecoundMaxArrays
{   
	public static void findMaxelem(int ar[])
	{
		int max=ar[0];
		int secondMax=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
			secondMax=max;
			max=ar[i];
		    }
			else if(secondMax < ar[i] && ar[i]!=max)
			{
				secondMax=ar[i];
		           
		    }
		}
		System.out.println("Maximun Number   :"+max);
    	System.out.println("Second Maximun Number   :"+secondMax);
	}
	
	public static void main(String[] args) {
		
        int arr[]= {20, 0, 31, 45, 1000, 1, 2000, 90};
		
		System.out.println(Arrays.toString(arr));
		
        findMaxelem(arr);
	}

}
