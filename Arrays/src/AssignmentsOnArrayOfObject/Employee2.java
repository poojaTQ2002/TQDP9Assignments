package AssignmentsOnArrayOfObject;

public class Employee2 
{
   private int empno;
   private String name;
   private Department department;
   Employee2()
   {
	   
   }
public Employee2(int empno, String name, Department department) {
	super();
	this.empno = empno;
	this.name = name;
	this.department = department;
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee2 [empno=" + empno + ", name=" + name + ", department=" + department + "]";
}

  
   
   
}
