package com.abstractclass;
abstract class Bike
{
	private int id;
	private String name;
	private double cost;
	
	static String brandName;
	static double discount;
	
	static 
	{
		brandName="Honda";
	}
	Bike()
	{
		
	}
	public Bike(int id,String name,double cost)
	{
		super();
		this.id=id;
		this.name=name;
		this.cost=cost;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	static double giveDiscount(double dis)
	{
		discount=dis;
		return discount;
	}
	abstract void description();
	final void display()
	{
		System.out.println("Brand Name :"+brandName);
		System.out.println("Discount on all Bike :"+discount+"%");
		System.out.println("-----------------------------------------");
		System.out.println("Id :"+id);
		System.out.println("Model :"+name);
		System.out.println("Cost :"+cost);
		System.out.println("Discounted cost :"+(cost - (discount/100)*cost));
	}
}

class SportBike extends Bike
{
	private int gears;
	private double maxSpeed;
	public SportBike()
	{
		super();
	}
	public SportBike(int id,String name,double cost,int gears, double maxSpeed) {
		super(id,name,cost);
		this.gears = gears;
		this.maxSpeed = maxSpeed;
	}
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears = gears;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	void description()
	{
		System.out.println("This is a sport bike--------");
		System.out.println("Number of gears :"+gears);
		System.out.println("Max speed :"+maxSpeed);
	}
	
	
}
class BasicBike extends Bike
{
	private float avg;
	BasicBike()
	{
		
	}
	public BasicBike(int id,String name,double cost,float avg) {
		super(id,name,cost);
		this.avg = avg;
	}
	void description()
	{
		System.out.println("This is a normal bike-------");
		System.out.println("Number of gears :4");
		System.out.println("Average is :"+avg);
	}
}
public class AbstractDemo 
{
  public static void main(String[] args) 
  {
	Bike.giveDiscount(20);
	SportBike s1=new SportBike(101,"CVR10",78000,6,250);
	s1.display();
	s1.description();
  }
}
