package com.Inheritance;
class Cake
{
	private String cname;
	private int price;
	public Cake() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cake(String cname, int price) {
		super();
		this.cname = cname;
		this.price = price;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "cake [cname=" + cname + ", price=" + price + "]";
	}
}
class Strawberry extends Cake
{
	private String shape;
	Strawberry()
	{
		
	}
	public Strawberry(String cname,int price,String shape) {
		super(cname,price);
		this.shape = shape;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		shape = shape;
	}
	public String toString() {
		return super.toString()+"Strawberry [Shape=" + shape + "]";
	}
	
}
class BlackForest extends Cake
{
	private String shape;

	public BlackForest() 
	{
		super();
	}

	public BlackForest(String cname,int price,String shape) {
		super(cname, price);
		this.shape = shape;
	}

	public String getShape() {
		return shape;
	}

	public void setshape(String shape) {
		this.shape = shape;
	}

	public String toString() 
	{
		return super.toString()+"BlackForest [Shape=" + shape + "]";
	}
	
}
public class Bake 
{
    public static void main(String[] args) 
    {
		Cake c=new Cake("Vanilla",540);
		System.out.println(c);
		System.out.println("*******************************");
		
		Strawberry s=new Strawberry("Strawberry",450,"Barbie");
		System.out.println(s);
		System.out.println("*********************************");
		
		
		BlackForest b=new BlackForest("BlackForest",640,"Square");
		System.out.println(b);
		
		
		
		
		
		
		
	}
}
