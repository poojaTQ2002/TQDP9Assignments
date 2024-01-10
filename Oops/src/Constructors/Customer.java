package Constructors;

public class Customer 
{
  private int customerid;
  private String customername;
  private String customeremail;
  private long customercontact;
  private String customerpass;
  Customer()
  {
	  System.out.println("Default Constructor");
  }
  Customer(int customerid,String customername, String costomeremail,long customercontact,String customerpass)
  {
	  this.customerid=customerid;
	  this.customername=customername;
	  this.customeremail=customeremail;
	  this.customercontact=customercontact;
	  this.customerpass=customerpass;
  }
  public void setCustomerid(int customerid)
  {
	  this.customerid=customerid;
  }
  public int getCustomerid()
  {
	  return customerid;
  }
  public void setCustomername(String customername)
  {
	this.customername=customername;  
  }
  public String getCustomername()
  {
	  return customername;
  }
  public void setCustomeremail(String customeremail)
  {
	  this.customeremail=customeremail;
  }
  public String getCustomeremail()
  {
	  return customeremail;
  }
  public void setCustomercontact(long customercontact)
  {
	  this.customercontact=customercontact;
  }
  public long getCustomercontact()
  {
	  return customercontact;
  }
  public void setCustomerpass(String customerpass)
  {
	  this.customerpass=customerpass;
  }
  public String getCustomerpass()
  {
	  return customerpass;
  }
  public String toString()
	{
		return customerid+" "+customername+" "+customeremail+" "+customercontact+" "+customerpass ;
	}
  
  
  
  
  
  
  
}
