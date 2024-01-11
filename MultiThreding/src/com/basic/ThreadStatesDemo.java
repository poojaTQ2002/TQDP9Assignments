package com.basic;

public class ThreadStatesDemo {
	
	public static void main(String[] args) {
		
		Thread.State st[]=Thread.State.values();
		for(Thread.State s: st)
		{
			System.out.println(s);
		}
	}

}

