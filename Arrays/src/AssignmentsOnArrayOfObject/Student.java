package AssignmentsOnArrayOfObject;

public class Student 
{
  private int roll;
  private String name;
  private int age;
  private float marks;
  Student()
  {
	  
  }
 public Student(int roll, String name, int age, float marks) 
 {
	super();
	this.roll = roll;
	this.name = name;
	this.age = age;
	this.marks = marks;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
}
 
  
}
