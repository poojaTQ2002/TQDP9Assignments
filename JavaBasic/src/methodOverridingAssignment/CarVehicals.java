package methodOverridingAssignment;
class vehicals
{
	public String accelerate(long mph)
	{
		return "Vehical is accelerating at"+" "+mph+"mph";
	}
	public String stop()
	{
		return "Vehicle has stopped";
		
	}
	public String run()
	{
		return "vehicle is running";
	}
}
class car extends vehicals
{
	public String accelerate(long mph)
	{
		return "Car is accelerating at"+" "+mph+"mph";
	}
}
public class CarVehicals 
{
   public static void main(String[] args) 
   {
	 vehicals v;
	 v=new vehicals();
	 v.accelerate(5000);
	 System.out.println(v.accelerate(50));
	 System.out.println(v.run());
	 System.out.println(v.stop());
	 System.out.println("---------------------------------------------");
	 
	 car c=new car();
	 System.out.println(c.accelerate(40));
	 System.out.println(c.run());
	 System.out.println(c.stop());
   }
}
