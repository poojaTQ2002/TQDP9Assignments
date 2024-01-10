package HWForLogic;

import java.util.Arrays;

public class AlternateMerge
{
	public static int[] alternateMerge(int a1[],int a2[])
	{
		int mar[]= new int[a1.length+a2.length];
		int index=0;
		
		int maxLength= Math.max(a1.length, a2.length);
		
		for(int i=0;i<maxLength;i++)
		{
			if(i<a1.length)
			{
				mar[index++]=a1[i];
			}
			
			if(i<a2.length)
			{
				mar[index++]=a2[i];
			}
				
		}
		
		
		return mar;
	}
     public static void main(String[] args) 
{
		
		int ar1[]= {1,2,3,4,5};
		int ar2[]= {10,20,30,40,50};
		
		System.out.println(Arrays.toString(ar1));
		
		System.out.println(Arrays.toString(ar2));
		
		System.out.println("Alternate Merge");
	    System.out.println(Arrays.toString(alternateMerge(ar1, ar2)));
}
}
