package com.containtment;

public class DepartmentTest 
{
	public static void InfoEmployeeDeparmentWise(Employee[]emp,Departments[]dep)
	{
		for(Departments d:dep)
		{
			System.out.println(d);
			for(Employee e:emp)
			{
				if(d.getEmployee().equals(dep))
				{
					System.out.println(e.getId()+" "+e.getEname()+" "+e.getSalary());
				}
			}
			System.out.println("---------------");
		}
			
	}
	
	
   public static void main(String[] args)
   {
	   Employee emp[]=new Employee[8];
	   emp[0]=new Employee(101,"Pooja",50000);
	   emp[1]=new Employee(102,"Reetu",45000);
	   emp[2]=new Employee(103,"Ram",35000);
	   emp[3]=new Employee(104,"Nisha",25000);
	   emp[4]=new Employee(105,"Rakesh",30000);
	   emp[5]=new Employee(106,"Ali",40000);
	   emp[6]=new Employee(107,"Teju",38000);
	   emp[7]=new Employee(108,"Anija",45000);
	   
//	   for(Employee e:emp)
//	   {
//		   System.out.println(e);
//	   }
	   
	   
	   Departments d1[]=new Departments[5];
       d1[0]=new Departments(1,"IT",emp[0]);
       d1[1]=new Departments(2,"Sale",emp[1]);
       d1[2]=new Departments(3,"HR",emp[0]);
       d1[3]=new Departments(4,"IT",emp[3]);
       d1[4]=new Departments(5,"Sale",emp[1]);

	   
//	   for(Departments d:d1)
//	   {
//		   System.out.println(d);
//	   }
	  // System.out.println("-----------------");
	   InfoEmployeeDeparmentWise(emp,d1);
	   
	   
	
   }
}
