package Constructors;


  class Course
 {
	private int id;
	 private String name;
	 
	
	 Course()
	 {
		 System.out.println("Course Default Counstruction");
	 }
	 public void setId(int id)
	 {
		 this.id=id;
	 }
	 public int getId()
	 {
		 return id;
	 }
	 public void setname(String name)
	 {
		 this.name=name;
	 }
	 public String getname()
	 {
		 return name;
	 }
	 public String toString()
		{
			return id+" "+name+"";
		}
	 
	 class Subcourse
	 {
		 private int subId;
			private String subName;
	 }
	 Subcourse()
	 {
		 System.out.println("Subcourse default constructor");
	 }
	 public void setSunId(int subId)
	 {
		 this.subId=subId;
	 }
	 public int getSunId() 
	 {
		 return subId;
	 }
	 public void setSubName(String subName)
	 {
		 this.subName=subName;
	 }
	 public String getSunName() 
	 {
		 return subName;
	 }
	 
}
 public class Course1
 {
 	public static void main(String[] args)
 	{
 		Course c=new Course();
 		System.out.println(c);
 		
 		
 		
 		
 		
 	}
 }
 
