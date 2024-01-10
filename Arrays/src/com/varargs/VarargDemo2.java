package com.varargs;

public class VarargDemo2
{
	/// ellipsis
		static void addNumbers(int ...ar)
		{
			int sum=0;
			for(int a:ar)
			{
				sum+=a;
			}
			
			System.out.println("Sum:"+sum);
			
			System.out.println();
		}
		
		public static void main(String[] args) {
			
					
			System.out.println("==================================");
			
			addNumbers(3,4);
			addNumbers(6,7,8,10);
			
			
		}

}
