package HWForLogic;

import java.util.Arrays;

public class SecoundHighestWithoutSorting 
{
	static void findSecoundHighest(int ar[])
	{
		int max=ar[0];
		int secoundmax=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				secoundmax=max;
				max=ar[0];
			}
			else if(secoundmax<ar[i] && ar[i]!=max)
			{
				secoundmax=ar[i];
			}
		}
		System.out.println("Maximum NUmber is :"+max);
		System.out.println("Secound Maximum NUmber is :"+secoundmax);
		
	}
   public static void main(String[] args) 
   {
	   int arr[]= {500,80,90,100,};
	   System.out.println(Arrays.toString(arr));
	   System.out.println("-----------------");
	   findSecoundHighest(arr);
   }
}
