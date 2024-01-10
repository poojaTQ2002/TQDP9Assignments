package ArraysAssignments;


public class EmployeeTest
{
	public void checkSalary(Employee emp[])
	{
		
		
	}
	public static void main(String[] args) 
	{
		Employee emp[]=new Employee[5];
		   for(int i=0;i<emp.length;i++)
		   {
			   emp[i]= new Employee();
		   }
		   emp[0]=new Employee(1,"Pooja",54000);
		   emp[1]=new Employee(2,"Reetu",60000);
		   emp[2]=new Employee(3,"Pramod",35000);
		   emp[3]=new Employee(4,"Teju",40000);
		   emp[4]=new Employee(5,"Raju",60000);
		   for(Employee e: emp)
		   {
			   System.out.println(e);
		   }
	}
   
   
   
}
