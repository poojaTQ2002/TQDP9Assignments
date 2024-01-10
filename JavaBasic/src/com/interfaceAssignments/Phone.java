package com.interfaceAssignments;
class PhoneBook
{
	 private String name;
	 private long contract;
	public PhoneBook() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public PhoneBook(String name, long contract)
	{
		super();
		this.name = name;
		this.contract = contract;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContract() {
		return contract;
	}
	public void setContract(long contract) {
		this.contract = contract;
	}
	@Override
	public String toString() {
		return "PhoneBook [name=" + name + ", contract=" + contract + "]";
	}
	
	
	 
}
public class Phone 
{
    public static void main(String[] args)
    {
    	PhoneBook p=new PhoneBook("Pooja",54866525);
    	System.out.println(p);
    	
    }
}
