package HWForLogic;

import java.util.Arrays;

public class CompleteMerge 
{
	
	public static  int[] completeMerge(int a1[], int a2[])
	{
		int mar[]= new int[a1.length+a2.length];
		
		int index=0;
		for(int i=0;i<a1.length;i++)
		{
			mar[index++]=a1[i];			
		}
		
		for(int i=0;i<a2.length;i++)
		{
			mar[index++]=a2[i];
		}
		
		return mar;
		
	}

        public static void main(String[] args)
        {
		
		int ar1[]= {10,20,30,40};
		int ar2[]= {50,60,70,80,90};
		
		System.out.println(Arrays.toString(ar1));
		
		System.out.println(Arrays.toString(ar2));
		
		System.out.println("Complete Merge:");
	    System.out.println(Arrays.toString(completeMerge(ar1, ar2)));
        }
}
