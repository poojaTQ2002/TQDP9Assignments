package com.containment;

public class Car1 
{
  private int cno;
  private String cmodel;
  private int price;
   public Car1() 
   {
	
   }
  public Car1(int cno, String cmodel, int price) 
  {
	this.cno = cno;
	this.cmodel = cmodel;
	this.price = price;
  }
public int getCno() {
	return cno;
}
public void setCno(int cno) {
	this.cno = cno;
}
public String getCmodel() {
	return cmodel;
}
public void setCmodel(String cmodel) {
	this.cmodel = cmodel;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

   public String toString()
   {
    	return "Car1 [cno=" + cno + ", cmodel=" + cmodel + ", price=" + price + "]";
   }

}
