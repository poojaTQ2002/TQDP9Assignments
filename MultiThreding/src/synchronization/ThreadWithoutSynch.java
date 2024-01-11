package synchronization;

class Table
{
	
	// synchronized method
//   public synchronized void printTable(int n)
//   {
//	   for(int i=1;i<=10;i++)
//		  {
//			  System.out.println(n+"X"+i+"="+(n*i));
//			  try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				System.out.println(e);
//			}
//		  }
//   }
//   
	// static synchronization
   public static synchronized void printTable(int n)
   {
	   for(int i=1;i<=10;i++)
		  {
			  System.out.println(n+"X"+i+"="+(n*i));
			  try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		  }
   }
	
	// synchronized block in resource
//  public void printTable(int n)
//  {
//	  System.out.println(Thread.currentThread().getName()+" has started");
//	  
//	  synchronized (this) {
//
//		   for(int i=1;i<=10;i++)
//			  {
//				  System.out.println(n+"X"+i+"="+(n*i));
//				  try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					System.out.println(e);
//				}
//			  }
//		
//	  }
//	   
//	   System.out.println(Thread.currentThread().getName()+" has finished"); 
//  }


}

public class ThreadWithoutSynch {
	
	public static void main(String[] args) {
		
		Table obj= new Table();
		Table obj1= new Table();
		Thread t1= new Thread()
				{
			     public void run()
			     {
			    	 obj.printTable(2);
			     }
				};
				
	 Thread t2= new Thread()
				{
			     public void run()
			     {
			    	 obj.printTable(5);
			     }
				};	
	 Thread t3= new Thread()
				{
			     public void run()
			     {
			    	 obj1.printTable(10);
			     }
				};				
				
				
	t1.start();
	t2.start();
	t3.start();
	}

}
