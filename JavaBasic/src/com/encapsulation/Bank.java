package com.encapsulation;

public class Bank 
{ private int BId;
  private String Bname;
  private int Bno;
  private String Baddress;
  
  /*public void setDetails(int id,String name,int no,String address)
  {
	  BId=id;
	  Bname=name;
	  Bno=no;
	  Baddress=address;
  }*/
  public void setBId(int BId)
  {
	  this.BId=BId;
  }
  public int getBId()
  {
	  return BId;
  }
  public void setBname(String Bname)
  {
	  this.Bname=Bname;
  }
  public String getBname()
  {
	  return Bname;
  }
  public void setBno(int Bno)
  {
	  this.Bno=Bno;
  }
  public int getBno()
  {
	  return Bno;
  }
  public void setBaddress(String Baddress)
  {
	  this.Baddress=Baddress;
  }
  public String getBaddress()
  {
	  return Baddress;
  }
  
  
  public void setDetails(int BId,String Bname,int Bno,String Baddress)
  {
	 this. BId=BId;
	  this.Bname=Bname;
	  this.Bno=Bno;
	  this.Baddress=Baddress;
  }
  
  
  
  public void show()
  {
	  System.out.println("Bank Id :"+BId);
	  System.out.println("Bank Name :"+Bname);
	  System.out.println("Bank Number :"+Bno);
	  System.out.println("Bank Address :"+Baddress);
	  
  }
 /* public void setDetails()
  {
	  BId=01;
	  Bname="ICIC Bank";
	  Bno=2314;
	  Baddress="M.D.Rode,Pune";
	  
	  
  }*/
  
}

