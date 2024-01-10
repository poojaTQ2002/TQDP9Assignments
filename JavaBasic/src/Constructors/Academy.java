package Constructors;


public class Academy 
{
	private int aid;
	  private String aname;
	  private String address;
	  Academy()
	  {
		  System.out.println("Default Constructor");
	  }
	  Academy(int aid,String aname, String address)
	  {
		  this.aid=aid;
		  this.aname=aname;
		  this.address=address;
		  
	  }
	  public void setAid(int aid)
	  {
		  this.aid=aid;
	  }
	  public int getAid()
	  {
		  return aid;
	  }
	  public void setAname(String aname)
	  {
		this.aname=aname;  
	  }
	  public String getAname()
	  {
		  return aname;
	  }
	  public void setAddress(String address)
	  {
		  this.address=address;
	  }
	  public String getaddress()
	  {
		  return address;
	  }
	 
	  public String toString()
		{
			return aid+" "+aname+" "+address;
		}
	  
}
