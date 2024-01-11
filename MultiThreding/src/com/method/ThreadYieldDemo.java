package com.method;

//static method
//causes current thread to pause and give some other thread of same priority to run
//thread - long time consuming thread and doesnot have any critical section

public class ThreadYieldDemo {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread()
				{
			      public void run()
			      {
			    	  for(int i=0;i<=100;i++)
			    	  {
			    		  System.out.println(Thread.currentThread().getName()+":"+i);
			    		  Thread.yield();
			    	  }
			      }
			
				};
				
	  Thread t2 = new Thread()
				{
			      public void run()
			      {
			    	  for(int i=0;i<=5;i++)
			    	  {
			    		  System.out.println(Thread.currentThread().getName()+":"+i);
			    	  }
			      }
			
				};	
				
	t1.start();
	t2.start();
		
	}

}
