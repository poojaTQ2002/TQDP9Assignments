package methodOverridingAssignment;
class bike
{
	String color;
	long speed;
    void bikeinfo()
    {
    	color="Black";
    	speed=100;
    }
	public String getColor() {
		return color;
	}
	public long getSpeed() {
		return speed;
	}
    
	
}
class Pulsar extends bike
{
  void bikeinfo()
  {
	  super.bikeinfo();
	  System.out.println("Pulsor bike");
  }
}

public class BikeDetails 
{
  public static void main(String[] args) 
  {
	bike b=new bike();
	b.color="Black";
	b.speed=50;
	
	System.out.println("Color is :"+b.getColor());
	System.out.println("speed is :"+b.getSpeed());
	System.out.println("*************************************");
	
	Pulsar p=new Pulsar();
	p.bikeinfo();
	p.color="Red";
	p.speed=80;
	System.out.println("Color is :"+p.getColor());
	System.out.println("speed is :"+p.getSpeed());
	
  }
}
