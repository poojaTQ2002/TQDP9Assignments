package AssignmentsOnArrayOfObject;

public class JoiningDate 
{
  private int day;
  private String month;
  private int year;
  JoiningDate()
  {
	  
  }
public JoiningDate(int day, String mounth, int year) {
	super();
	this.day = day;
	this.month = mounth;
	this.year = year;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public String getMounth() {
	return month;
}
public void setMounth(String month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return "JoiningDate [day=" + day + ", mounth=" + month + ", year=" + year + "]";
}
  
  
}
