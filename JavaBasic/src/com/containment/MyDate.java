package com.containment;

public class MyDate 
{
   private int day;
   private String month;
   private long year;
   MyDate()
   {
	   
   }
   MyDate(int day,String month,long year)
   {
	   this.day=day;
	   this.month=month;
	   this.year=year;
   }
   public int getDay()
   {
	 return day;
   }
   public void setDay(int day)
   {
	  this.day = day;
   }
   public String getMonth()
   {
	 return month;
   }
   public void setMonth(String month)
   {
	 this.month = month;
   }
   public long getYear()
   {
	 return year;
   }
   public void setYear(long year)
   {
	 this.year = year;
   }
   
   public String toString()
   {
	    return "MyDate :day=" + day + ", month=" + month + ", year=" + year;
   }
   
   
   
}
