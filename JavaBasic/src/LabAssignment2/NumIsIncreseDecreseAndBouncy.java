package LabAssignment2;

import java.util.Scanner;

public class NumIsIncreseDecreseAndBouncy 
{
	public static boolean incresingNumber(int num)
	{
		int rem;
		int temp=num;
		while(num!=0) {
			rem=num%10;
			if(temp>rem) {
				num=num/10;
				temp=rem;
			}else {
				break;
			}
		}
		if(num==0) {
			return true;
		}
		return false;
		 
}
	public static boolean decresingNumber(int num)
	{
		int rem;
		int temp=0;
		while(num!=0) {
			rem=num%10;
			if(temp<rem){
				num=num/10;
				temp=rem;
				}else {
					break;
				}
			if(num==0)
			{
				return true;
			}
			
		}
		return false;
	}
	public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number :");
	int num=sc.nextInt();
	if(incresingNumber(num)) {
		System.out.println(num+" is incresing number");
	}else if(decresingNumber(num)){
		System.out.println(num+" is decresing number");
	}else {
		System.out.println(num+" is bouncy number");
	}
  }
}
