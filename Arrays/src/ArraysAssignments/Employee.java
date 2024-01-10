package ArraysAssignments;

public class Employee 
{
	  private int eid;
	  private String ename;
	  private double Salary;
	  Employee()
	  {
		  
	  }
	public Employee(int eid, String ename, double salary)
	{
		super();
		this.eid = eid;
		this.ename = ename;
		Salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", Salary=" + Salary + "]";
	}
	
	  
}
