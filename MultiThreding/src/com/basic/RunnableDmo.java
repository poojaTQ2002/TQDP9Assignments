package com.basic;

public class RunnableDmo implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		
		RunnableDmo r1= new RunnableDmo();
		RunnableDmo r2= new RunnableDmo();
		
		Thread t;
		t= new Thread(r1);
		t.start();
		
		t= new Thread(r2);
		t.start();
		
		
	}

	

}

