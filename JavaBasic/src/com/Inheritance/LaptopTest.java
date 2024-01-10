package com.Inheritance;
class Laptop
{
	private int noOfUSBPort;
	private int processorSpeed;
	public Laptop()
	{
		
	}
	public Laptop(int noOfUSBPort, int processorSpeed) 
	{
		super();
		this.noOfUSBPort = noOfUSBPort;
		this.processorSpeed = processorSpeed;
	}
	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}
	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}
	public int getProcessorSpeed() {
		return processorSpeed;
	}
	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	public String toString() {
		return "Laptop [noOfUSBPort=" + noOfUSBPort + ", processorSpeed=" + processorSpeed + "]";
	}
}
public class LaptopTest
{
     public static void main(String[] args)
     {
		  Laptop l1=new Laptop();
		  l1.setNoOfUSBPort(2);
		  l1.setProcessorSpeed(100);
		 System.out.println(l1);
		 
		 System.out.println("--------------------------------------------");
		 
		 Laptop l2=new Laptop();
		 l2.setNoOfUSBPort(4);
		 l2.setProcessorSpeed(50);
		 
		 System.out.println("NoOfUSBPort :"+l2.getNoOfUSBPort());
		 System.out.println("setProcessorSpeed :"+l2.getProcessorSpeed());
		 
		 
		 
		 
	}
}
