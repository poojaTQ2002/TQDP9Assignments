package AssignmentsOnArrayOfObject;

public class EmployeeTest2 
{
   public static void main(String[] args)
   {
	  Department d1[]=new Department[3];
	  d1[0]=new Department(101,"IT");
	  d1[1]=new Department(102,"Production");
	  d1[2]=new Department(103,"Testing");
	  
	  Employee2 e2[]=new Employee2[5];
	  e2[0]=new Employee2(101,"Kartik",d1[0]);
	  e2[1]=new Employee2(102,"Nisha",d1[1]);
	  e2[2]=new Employee2(103,"Komal",d1[2]);
	  e2[3]=new Employee2(104,"Ali",d1[0]);
	  e2[4]=new Employee2(105,"Tejas",d1[1]);
	  
	  for(Employee2 emp:e2)
		  System.out.println(emp);
	  
	  
   }
}
