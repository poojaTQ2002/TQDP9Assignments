package AssignmentsOnArrayOfObject;

public class EmployeeTest 
{
	static void findSameSalary(Employee e1[])
	{
		for(int i=0;i<e1.length;i++)
		{
			for(int j=i+1;j<e1.length;j++)
			{
				if(e1[i].getSalary()!=e1[j].getSalary())
					continue;
				else
				{
					System.out.println(e1[i]);
					System.out.println(e1[j]);
					break;
				}
			}
		}
	}
	public static void sameJoiningDate(Employee e1[])
	{
		for(int i=0;i<e1.length;i++)
		{
			for(int j=i+1;j<e1.length;j++)
			{
				if(e1[i].getDate()!=e1[j].getDate())
					continue;
				else
				{
					System.out.println(e1[i]);
					System.out.println(e1[j]);
					break;
				}
			}
		}
	}
	public static void sameDepartmentName(Employee e1[])
	{
		for(int i=0;i<e1.length;i++)
		{
			for(int j=i+1;j<e1.length;j++)
			{
				if(e1[i].getDepartment()!=e1[j].getDepartment())
					continue;
				else
				{
					System.out.println(e1[i]);
					System.out.println(e1[j]);
					break;
				}
			}
		}
	}
    public static void main(String[] args) 
    {
    	JoiningDate d1[]=new JoiningDate[3];
    	d1[0]=new JoiningDate(07,"Feb",2002);
    	d1[1]=new JoiningDate(13,"March",2011);
    	d1[2]=new JoiningDate(22,"April",2018);
    	
    	Department dp1[]=new Department[4];
    	dp1[0]=new Department(101,"IT");
    	dp1[1]=new Department(102,"Finance");
    	dp1[2]=new Department(103,"Teating");
    	dp1[3]=new Department(104,"Marketing");
    	
    	
		Employee e1[]=new Employee[5];
		e1[0]=new Employee(101,"Pooja",40000,d1[0],dp1[0]);
		e1[1]=new Employee(102,"Pranay",35000,d1[1],dp1[1]);
		e1[2]=new Employee(103,"Reetu",40000,d1[2],dp1[2]);
		e1[3]=new Employee(104,"Nisha",5000,d1[0],dp1[3]);
		e1[4]=new Employee(105,"Harsh",35000,d1[1],dp1[2]);
		
		for(Employee emp:e1)
			System.out.println(emp);
		System.out.println("-------------------------------");
//		System.out.println("Employee Having Same Salary :");
//		findSameSalary(e1);
//		System.out.println("-------------------------------");
//		System.out.println("Employee Having Same Joining Date :");
//		sameJoiningDate(e1);
//		System.out.println("-------------------------------");
		sameDepartmentName(e1);
	}
}
