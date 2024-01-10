package Constructors;

public class ConstructDemo
{
  String name;
  public ConstructDemo() 
  {
	  System.out.println("Is Default Constructor");
	  name="Unknown";
  }
  ConstructDemo(String name)
  {
	  System.out.println("Is Parameter Constructor");
	  this.name=name;
	 
  }
  public String getName()
  {
	  return name;
  }
  public static void main(String[] args) 
  {
	  ConstructDemo c1=new ConstructDemo();
	  System.out.println(c1.getName());
	  
	  ConstructDemo c2=new ConstructDemo("Pooja");
	  System.out.println(c2.getName());
  }
}
