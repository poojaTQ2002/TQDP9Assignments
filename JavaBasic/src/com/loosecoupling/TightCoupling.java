package com.loosecoupling;
interface MessageS
{
	void sendMessage(String msg);
	
	default void messageStatus(String st)
	{
		System.out.println(st);
	}

}

class Whatsapp implements MessageS
{
	String rName;
	
	public Whatsapp(String rName) {
		this.rName=rName;
	}

	@Override
	public void sendMessage(String msg) {

       System.out.println("Whatsapp:"+msg);
		
	}
	
	public void status()
	{
		System.out.println("SEEN");
	}
	

}

class Facebook implements MessageS
{
	@Override
	public void sendMessage(String msg) {

       System.out.println("Facebook:"+msg);
		
	}
	


}

public class TightCoupling {
	
	// Tight Coupling
	public void messageType(Whatsapp w, String msg)
	{
		w.sendMessage(msg);
		
	}
	
	// Loose coupling
	
	public void sendMessageType(MessageS m, String msg)
	{
		
		m.sendMessage(msg);
		m.messageStatus("Send");
		
		
	}
	public static void main(String[] args) {
		
		TightCoupling o1= new TightCoupling();
		
	     Whatsapp w1= new Whatsapp("Pranali");
	     o1.messageType(w1, "Welcome");
	     
//	     Facebook f1= new Facebook();
//	     o1.messageType(f1, null);
	     
	     System.out.println("-----------------------------");
	     
	     MessageS m1;
	     m1= new Whatsapp("Pranay");
	     o1.sendMessageType(m1, "Welcome");
	     
	     m1= new Facebook();
	     
	     o1.sendMessageType(m1, "Hello");
		
	}

}
