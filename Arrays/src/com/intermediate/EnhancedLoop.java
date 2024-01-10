package com.intermediate;

public class EnhancedLoop 
{
public static void main(String[] args) {
		
		int arr[]= {3,4,1,2,3,6};
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		// cube of each number
		//cannot update
		// no access to index
		for(int i:arr)
		{
			i=i*i*i;
		}
		//  no change is visible
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		
	}

}
