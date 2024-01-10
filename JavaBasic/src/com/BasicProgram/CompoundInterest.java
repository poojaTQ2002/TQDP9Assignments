package com.BasicProgram;

public class CompoundInterest {
	public static void main(String args[])
	{
		float p,r,t,CI;
		p=100000;
	    r=5;
	    t=3;
		CI=(float) (p*(Math.pow((1+r/100),t))-p);
		System.out.println("Compound Interest is :"+CI);
		
	}

}
