package com.overriding;
//final: restrict the user
//applied : variable, class, method

//initialized during compilation

//instance- final : initialize them in every constructor
//if we initialize in instance block then remove from constr
//because the value is allocated and cannot be changed from const

//no setters for final variable 


//final  : We cannot inherit it
//String class- final
class Developer
{
final String ename;
float salary;
final static String companyName;
final static int noOfHours=8;
final String panNo;

static
{
	   companyName="ThinkQ";
}

//{
//	   panNo="Unknown";
//}
public Developer() {
	   
	 ename="Unknown";
	 panNo="Unknown";
	
}

	public Developer(String ename, float salary, String panNo) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.panNo = panNo;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public static String getCompanyname() {
		return companyName;
	}

	public static int getNoofhours() {
		return noOfHours;
	}

	public String getPanNo() {
		return panNo;
	}

	// method : override
	
	final void skillSet()
	{
		System.out.println("c, Html, Java, SQL");
	}


}

class FullStackDeveloper extends Developer
{
	
//	final void skillSet()
//	{
//		System.out.println("c, Html, Java, SQL, Angular");
//	}
	
}

public class FinalDemo {

	public static void main(String[] args) {
		
		Developer d1= new Developer("Reetu", 430000, "YH78GH40");
	//	d1.setEname("reetu rani");
		
		//Developer.noOfHours=9;
		
		
	}
}
