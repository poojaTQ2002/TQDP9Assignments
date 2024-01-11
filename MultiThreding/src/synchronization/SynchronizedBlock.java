package synchronization;

class Message
{
  public void processMessage(String msg)
  {
	  System.out.println("Sending:"+msg);
	  try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  System.out.println("Received:"+msg);
	  
  }


}
public class SynchronizedBlock {
	
	public static void main(String[] args) {
		Message m = new Message();
		
		Thread t1= new Thread()
				{
			      public void run()
			      {
			    	  System.out.println(Thread.currentThread().getName());
				      System.out.println("-------------------------------------");
				    
				     
				     synchronized (m) {
				    	 System.out.println("Welcome:"+Thread.currentThread().getName());
				    	 m.processMessage("Pay the fees");
					}
				    
			      }
			
				};
				
		Thread t2= new Thread()
				{
			      public void run()
			      {
			    	  System.out.println(Thread.currentThread().getName());
				      System.out.println("-------------------------------------");
				   
				     synchronized (m) {
				    	  System.out.println("Welcome:"+Thread.currentThread().getName());
				    	 m.processMessage("Welcome to the fest");
					}
				    
			      }
			
				};	
				
		t1.setName("Pranay");
		t2.setName("Bhaskar");
		t1.start();
		t2.start();
		
	}

}
