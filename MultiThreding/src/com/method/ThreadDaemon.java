package com.method;

public class ThreadDaemon extends Thread {
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(Thread.currentThread().getName()+" is daemon thread");
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" is user thread");
		}

			
	}
	
	public static void main(String[] args) {
		
		ThreadDaemon t1 = new ThreadDaemon();
		ThreadDaemon t2= new ThreadDaemon();
		
		t1.setDaemon(true);
		t1.start();
		//t1.setDaemon(true);
		t2.start();
		
		
	}

}
