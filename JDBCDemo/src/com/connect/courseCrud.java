package com.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class courseCrud
{
	static Connection con=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc=new Scanner (System.in);
	
	
	courseCrud()
	{
		con=DBConnect.getConnect();
		System.out.println("Connection established...");
		try
		{
		  st=con.createStatement();	
		} catch (SQLException e)
		{
			System.out.println(e);
		}
	}
	public void fetchCourseDetails()
	{
		try
		{
			rs=st.executeQuery("select * from course");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getFloat(4)+" "+rs.getInt(5));
			}
		} catch (SQLException e) 
		{
			System.out.println(e);
		}
	}
	public void insertCouse()
	{
		System.out.println("Enter the course id :" );
		int id=sc.nextInt();
		System.out.println("Enter the course name :");
		String cname=sc.next();
		System.out.println("Enter the duration(in months) :");
		int dur=sc.nextInt();
		System.out.println("Enter  fees :");
		float fees=sc.nextFloat();
		try 
		{
			pst= con.prepareStatement("insert into course values(?,?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, cname);
			pst.setInt(3, dur);
			pst.setFloat(4, fees);
			pst.setInt(5, 0);
			int noOfRowsInserted=pst.executeUpdate();
			if(noOfRowsInserted>0)
			{
				System.out.println("Course added...");
			}
			else
			{
				System.out.println("Error in adding course...");
			}
		} catch (SQLException e)
		{
			System.out.println(e);
		}
	}
	public void deleteCouseById()
	{
		System.out.println("Enter the courseid to be deleted");
		int id=sc.nextInt();
		try 
		{
		 int noOfRowsDeleted=st.executeUpdate("delete from course where cid ="+id);	
		 if(noOfRowsDeleted>0)
		 {
			 System.out.println("Course :"+id+" is deleted");
			 System.out.println("---------------------------------------------------");
			 fetchCourseDetails();
		 }
		 else
		 {
			 System.out.println("Course is not present....");
		 }
		} catch (SQLException e)
		{
			System.out.println(e);
		}
		
	}
	public boolean searchCourseById(int id)
	{
		boolean isFound=false;
		try 
		{
			pst=con.prepareStatement("select * from course where cid=?");
			pst.setInt(1, id);
			rs=pst.executeQuery();
			while(rs.next())
			{
				isFound=true;
				System.out.println("Course id :"+rs.getInt(1));
				System.out.println("Course Name :"+rs.getString(2));
				System.out.println("Duration :"+rs.getInt(3));
				System.out.println("Fees :"+rs.getFloat(4));
				System.out.println("Number of Student :"+rs.getInt(5));
			}
		} catch (Exception e) 
		{
			System.out.println(e);
		}
		return isFound;
	}
	public void updateCourseFees()
	{
		System.out.println("Enter course id whose fees is to update");
		int id=sc.nextInt();
		if(searchCourseById(id))
		{
			System.out.println("Enter new Fees :");
			float fees=sc.nextFloat();
			try 
			{
			 pst=con.prepareStatement("update course set fees=? where cid=?");
			 pst.setFloat(1, fees);
			 pst.setInt(2, id);
			 int noOfRowsUpdated=pst.executeUpdate();
			 if(noOfRowsUpdated>0)
			 {
				 System.out.println("Course fees updated");
				 searchCourseById(id);
			 }
			 else
			 {
				 System.out.println("Error id is not found...");
			 }
			} catch (Exception e)
			{
				System.out.println(e);
			}
			
		}
		
		else
		{
			System.out.println("Course not found....");
		}
	}
	
  public static void main(String[] args) 
  {
	courseCrud obj=new courseCrud();
//	obj.fetchCourseDetails();
//	obj.deleteCouseById();
	int choice;
	char ch;
	 
	do
	{
	  System.out.println("=======================================================");
	  System.out.println("1. Add new Course");
	  System.out.println("2. Delete Course");
	  System.out.println("3. Update Course Fees");
	  System.out.println("4.  Views all Course");
	  System.out.println("5. Views Course By id");
	  System.out.println("6. Exit");
	  
	  System.out.println("Enter Your Choice");
	  System.out.println("------------------------------------------");
	  
	  choice=sc.nextInt();
	  switch(choice)
	  {
	  case 1: obj.insertCouse();
	          break;
	  case 2:obj.deleteCouseById();
	         break;
	  case 3:obj.updateCourseFees();;
             break;
	  case 4:obj.fetchCourseDetails();;
             break;
	  case 5:System.out.println("Enter the course id to be searched :");
	         int id=sc.nextInt();
	         boolean isPresent=obj.searchCourseById(id);
	         if(!isPresent)
	         {
	        	 System.out.println("Course not found....");
	         }
             break;
	  case 6:System.out.println("------Closing the course Application------");
	         System.exit(0);
             break;
      default : System.out.println("Wrong Input...");       
	        
	  }
	  System.out.println("Do you want to continue(y-yes/n-no ");
	  ch=sc.next().charAt(0);
	}while(ch=='y'||ch=='Y');
  }
}
