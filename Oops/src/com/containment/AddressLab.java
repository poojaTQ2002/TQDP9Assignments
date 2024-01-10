package com.containment;

public class AddressLab 
{
   private int roomno;
   private String city;
   private int pincode;
   
   AddressLab()
   {
	   
   }
   AddressLab(int roomno,String city,int pincode)
   {
	 this.roomno=roomno;
	 this.city=city;
	 this.pincode=pincode;
   }
   public void setRoomnao(int roomno)
   {
	   this.roomno=roomno;
   }
   public int getRoomno()
   {
	   return roomno;
   }
   public void setCity(String city)
   {
	   this.city=city;
   }
   public String getCity()
   {
	   return city;
   }
   public void setPincode(int pincode)
   {
	   this.pincode=pincode;
   }
   public int getPincode()
   {
	   return pincode;
   }
   public String toString() 
   {
	  return "AddressLab : roomno=" + roomno + ", city=" + city + ", pincode=" + pincode;
   }
   
   
}
