package methodOverridingAssignment;
class company
{  int companyId;
   String companyName;
   
	public company() 
	{
		
	} 

	public void address()
	{
		System.out.println("Company address");
	}

	@Override
	public String toString() {
		return "company [companyId=" + companyId + ", companyName=" + companyName + "]";
	}
	
}
class eBay extends company
{
  int eBayId;
  String eBayLocation;
   public eBay() 
   {
	super();
	// TODO Auto-generated constructor stub
   }
  public eBay(int eBayId, String eBayLocation) 
  {
	super();
	this.eBayId = eBayId;
	this.eBayLocation = eBayLocation;
  }
@Override
public String toString() 
{
	return super.toString()+" "+"eBay [eBayId=" + eBayId + ", eBayLocation=" + eBayLocation + "]";
}
  public void address()
  {
	  System.out.println("eBoy Address..");
  }
  
  
}
public class Company2 
{
  public static void main(String[] args)
  {
	company c1=new company();
	c1.address();
	System.out.println("************************************");
	c1=new eBay();
	c1.address();
  }
}
