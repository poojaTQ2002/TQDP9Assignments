package AssignmentsOnArrayOfObject;

public class Employee 
{
	   private int eid;
	   private String ename;
	   private double salary;
	   private JoiningDate date;
	   private Department department;
	   public Employee()
	   {
		   
	   }
	   Employee(int id,String ename,double salary,JoiningDate date,Department department)
	   {
		   this.eid=id;
		   this.ename=ename;
		   this.salary=salary;
		   this.date=date;
		   this.department=department;
	   }
	   public void setId(int eid)
	   {
		   this.eid=eid;
	   }
	   public int getId()
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
	   public void setSalary(double salary)
	   {
		   this.salary=salary;
	   }
	   public double getSalary()
	   {
		   return salary;
	   }
	   public void setDate(JoiningDate date)
	   {
		   this.date=date;
	   }
	   public JoiningDate getDate()
	   {
		   return date;
	   }
	   public void setDepartment(Department department)
	   {
		   this.department=department;
	   }
	   public Department getDepartment()
	   {
		   return department;
	   }
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", date=" + date + ", department="
				+ department + "]";
	}
	   
}
