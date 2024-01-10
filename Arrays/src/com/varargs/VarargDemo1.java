package com.varargs;


	public class VarargDemo1 {
		
		static void display(int ar[])
		{
			for(int a:ar)
			{
				System.out.print(a+" ");
			}
			
			System.out.println();
		}
		
		/// ellipsis
		static void display2(int ...ar)
		{
			for(int a:ar)
			{
				System.out.print(a+" ");
			}
			
			System.out.println();
		}
		
		public static void main(String[] args) {
			
			int a1[]= {2,3,4,5};
			int a2[]= {5,6};
			int a3[]= {3,4,5};
			
			display(a1);
			display(a2);
			display(a3);
			
			System.out.println("==================================");
			
			display2(3,4);
			display2(1,2,3,4,5);
			
			
		}

	}


