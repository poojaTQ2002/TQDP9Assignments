package methodOverridingAssignment;
class person
{
	void readScript()
	{
		System.out.println("Person read script...");
	}
}
class Actor extends person
{
	void readScript()
	{
		System.out.println("Actor reading script...");
	}
}
public class PersonReadScript
{
  public static void main(String[] args) 
  {
	person p=new person();
	System.out.println("Person Information");
	p.readScript();
	System.out.println("++++++++++++++++++++++++++++++");
	Actor a=new Actor();
	a.readScript();
  }
}
