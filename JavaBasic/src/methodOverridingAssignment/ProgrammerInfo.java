package methodOverridingAssignment;
class Programmer
{
	void WorkingHours()
	{
		System.out.println("Programmer working...");
	}
}
class employee extends Programmer
{
	void WorkingHours()
	{
		System.out.println("Employee working 24 hours");
	}
}
public class ProgrammerInfo
{
   public static void main(String[] args) 
   {
	Programmer p=new Programmer();
	System.out.println("Programmer Information");
	p.WorkingHours();
	System.out.println("+++++++++++++++++++++++++++++++++++++++");
	
	employee e=new employee();
	System.out.println("Employee Information");
	e.WorkingHours();
	
   }
}
