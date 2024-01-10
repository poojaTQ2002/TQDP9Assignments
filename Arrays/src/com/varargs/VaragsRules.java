package com.varargs;

public class VaragsRules
{
	// Rule 1: Only 1 varags as argument
	
//		static void display(int ...a1, int ...a2)
//		{
//			
//		}
		
		//Rule2: varags has to be last argument
		
//		static void display(int ...a1, int a2)
//		{
//			
//		}
		
		static void display(int a1, int ...a2)
		{
			System.out.println(a1);
			for(int a:a2)
				System.out.print(a+" ");
			
			System.out.println();
		}
		
		
		public static void main(String[] args) {
			
			display(3,4,5,6,7,8);
			
		}

	}


