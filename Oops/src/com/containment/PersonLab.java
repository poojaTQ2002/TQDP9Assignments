package com.containment;

public class PersonLab 
{
   private String name;
   private int age;
   private String email;
   private AddressLab addresslab;
   
   PersonLab()
   {
	   
   }
   PersonLab(String name,int age,String email,AddressLab addresslab)
   {
	   this.name=name;
	   this.age=age;
	   this.email=email;
	   this.addresslab=addresslab;
   }
   public void setName(String name)
   {
	   this.name=name;
   }
   public String getName()
   {
	   return name;
   }
   public void setAge(int age)
   {
	   this.age=age;
   }
   public int getage()
   {
	   return age;
   }
   public void setEmail(String email)
   {
	   this.email=email;
   }
   public String getEmail()
   {
	   return email;
   }
   public void setAddressLab(AddressLab addresslab)
   {
	   this.addresslab=addresslab;
   }
   public AddressLab getAddressLab()
   {
	   return addresslab;
   }
   public String toString() 
   {
	 return "PersonLab :name=" + name + ", age=" + age + ", email=" + email + ", addresslab=" + addresslab;
   }
  
   
}
