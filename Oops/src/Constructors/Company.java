package Constructors;

class Employee 
{
    private int eid;
   private String ename;
   private double esalary;
   public Employee()
   {
	   
   }
   public Employee(int eid, String ename,double esalary) 
   {
	   this.eid=eid;
	   this.ename=ename;
	   this.esalary=esalary;
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
   public void setEsalary(double esalary)
   {
	   this.esalary=esalary;
   }
   public double getEsalary()
   {
	   return esalary;
   }
   public String toString()
   {
	   return eid+" "+ename+" "+esalary; 
   }
}
public class Company
{
	public static void main(String[] args)
	{
		Employee e1=new Employee(101,"Pooja",54123);
		Employee e2=new Employee(102,"Deepa",98413);
		
		System.out.println(e1);
		System.out.println(e2);
		
		Employee e3=new Employee();
		e3.setEid(103);
		e3.setEname("reetu");
		e3.setEsalary(56103);
		
		System.out.println(e3);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
