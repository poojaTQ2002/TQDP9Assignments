package HWForLogic;

import java.util.Arrays;

public class AlternateWithSkip 
{
	public static int[] alternateMergeSkip(int a1[],int a2[])
	{
		int maxLength= Math.max(a1.length, a2.length);
		
		int mar[]= new int[maxLength];
		int index=0;
		int i=0;
		while(index<maxLength)
		{
			if(i<a1.length)
			{
				mar[index++]= a1[i];
				i++;
			}
			if(i<a2.length)
			{
				mar[index++]=a2[i];
				i++;
			}
		}
		
		
		return mar;
	}
      public static void main(String[] args) 
      {
		
    	  int ar1[]= {1,2,3,4,5};
  		int ar2[]= {10,20,30,40,50,60,70};
  		
  		System.out.println(Arrays.toString(ar1));
  		
  		System.out.println(Arrays.toString(ar2));
	System.out.println("Alternate Merge with skip");
    System.out.println(Arrays.toString(alternateMergeSkip(ar1, ar2)));
      }
}
