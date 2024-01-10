package Constructors;


public class Employee1 
{
	private int eid;
	  private String ename;
	  private float salary;
	  Employee1()
	  {
		  System.out.println("Default Constructor");
	  }
	  Employee1(int eid,String ename, float salary)
	  {
		  this.eid=eid;
		  this.ename=ename;
		  this.salary=salary;
		  
	  }
	  public void setEid(int eid)
	  {
		  this.eid=eid;
	  }
	  public int getEid()
	  {
		  return eid;
	  }
	  public void setEname(String ename)
	  {
		this.ename=ename;  
	  }
	  public String getEname()
	  {
		  return ename;
	  }
	  public void setSalaryl(float salary)
	  {
		  this.salary=salary;
	  }
	  public float getSalary()
	  {
		  return salary;
	  }
	 
	  public String toString()
		{
			return eid+" "+ename+" "+salary;
		}
	  
}
