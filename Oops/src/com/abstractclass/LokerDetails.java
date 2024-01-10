package com.abstractclass;
abstract class Locker
{
	protected int money;
	protected String jewellary;
	static int pincode;
	Locker()
	{
		
	}
	Locker(int money,String jewellary)
	{
		super();
		this.money=money;
		this.jewellary=jewellary;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getJewellary() {
		return jewellary;
	}
	public void setJewellary(String jewellary) {
		this.jewellary = jewellary;
	}
	static int givepincode(int pin)
	{
		pincode=pin;
		return pincode;
	}
	abstract void description();
	final void dispaly()
	{
		System.out.println("Money :"+money);
		System.out.println("Jewellary :"+jewellary);
		
	}
	
}
class Shope extends Locker
{
	private int id;
	private String sname;
	private String address;
	Shope()
	{
		
	}
	public Shope(int money, String jewellary,int id,String sname,String address) 
	{
		super(money, jewellary);
		this.id=id;
		this.sname=sname;
		this.address=address;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	void description()
	{
	System.out.println("Money :"+money);
	System.out.println("jewellary :"+jewellary);
		System.out.println("-----------------------------------------");
		System.out.println("Id :"+id);
		System.out.println("Name :"+sname);
		System.out.println("Address :"+address);
		
	}
	
}
public class LokerDetails 
{
  public static void main(String[] args)
  {
	  Locker.pincode=54123;
		Shope s1=new Shope(521400,"Dimond",101,"J.D.shope","Pune");
		s1.description();
		
  }
}
