package com.containment;

public class Showroom 
{
   private int sno;
   private String sname;
   private Car1 car1;
   Showroom()
   {
	   
   }
   Showroom(int sno,String sname,Car1 car1)
   {
	   this.sno=sno;
	   this.sname=sname;
	   this.car1=car1;
   }
   public int getSno() {
	return sno;
   }
   public void setSno(int sno) {
	this.sno = sno;
   }
   public String getSname() {
	return sname;
   }
   public void setSname(String sname) {
	this.sname = sname;
   }
   public Car1 getCar1() {
	return car1;
}
   public void setCar1(Car1 car1) {
	this.car1 = car1;
}
public String toString() {
	return "Showroom [sno=" + sno + ", sname=" + sname + ", car1=" + car1 + "]";
}
  
   
}
