package Constructors;
class Student3
{
	private int id;
	private String name;
	public Student3() 
	{
	 
		System.out.println("Default constror....");
		
	}
	public Student3(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class StudentAssignment
{
    public static void main(String[] args) 
    {
    	Student3 s1=new Student3();
		 s1.setId(11);
		 s1.setName("Punam");
		 System.out.println("Id :"+s1.getId()+" "+"Name :"+s1.getName());
		 System.out.println("**********************************");
		 Student3 s2=new Student3();
		 s2.setId(21);
		 s2.setName("Nisha");
		 System.out.println("Id :"+s2.getId()+" "+"Name :"+s2.getName());
		 
		 
	}
}
