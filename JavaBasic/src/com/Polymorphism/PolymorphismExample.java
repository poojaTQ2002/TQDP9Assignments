package com.Polymorphism;
class Kid
{
    private String name;
    private int id;
    
	public Kid() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Kid(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	void readbook(String bookname) 
	{ 
		System.out.println("Herry Potter...");
	} 
	
	void readbook(int bno,String bprice)
	{
		System.out.println("Book name");
	}


	@Override
	public String toString() {
		return "Kid [name=" + name + ", id=" + id + "]";
	}
	
}
class Bigkid extends Kid
{
	void readbook()
	{
		System.out.println("BigKid reading...");
	}
}
class Teenager extends Kid
{
	void readbook()
	{
	  System.out.println("Teenager reading....");	
	}
}
public class PolymorphismExample 
{
  public static void main(String[] args) 
  {
	 Kid k1=new Kid("Ramayan",101);
	 Kid k2=new Kid("Life",102);
	 System.out.println(k1);
	 System.out.println(k2);
	 System.out.println("**************************");
	 Bigkid bk1=new Bigkid();
	 bk1.readbook();
	 System.out.println(bk1);
	 System.out.println("****************************");
	 Teenager t1=new Teenager();
	 t1.readbook();
	 System.out.println(t1);
	 
	 
	 
  }
}
