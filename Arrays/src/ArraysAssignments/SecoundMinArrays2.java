package ArraysAssignments;

import java.util.Arrays;

//2. WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23] 
public class SecoundMinArrays2
{   
	public static void findMinelem(int ar[])
	{
		int max=ar[0];
		int secondMax=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<max)
			{
			secondMax=max;
			max=ar[i];
		    }
			else if(secondMax > ar[i] && ar[i]!=max)
			{
				secondMax=ar[i];
		           
		    }
		}
		System.out.println("Minimun Number   :"+max);
    	System.out.println("Second Minimun Number   :"+secondMax);
	}
	
	public static void main(String[] args) {
		
        int arr[]= {-20, 0, -25, 15, 19, 37, 23};
		
		System.out.println(Arrays.toString(arr));
		
        findMinelem(arr);
	}

}
