package com.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class studentCrud 
{
	static Connection con=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc=new Scanner(System.in);
	
	studentCrud()
	{
	  con=DBConnect.getConnect();
	  System.out.println("Connect establishes...");
	  try 
	  {
		st=con.createStatement();
	
	  } catch (SQLException e) 
	  {
		System.out.println(e);
	  }
	}
	public void fetchStudentDetails()
	{
		try
		{
		  rs=st.executeQuery("select * from student");	
		  while(rs.next())
		  {
			  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getDate(7));
		  }
		} catch (SQLException e)
		{
			System.out.println(e);
		}
	}
	public void insertStudent()
	{
		System.out.println("Enter the student id :" );
		int id=sc.nextInt();
		System.out.println("Enter the student name :");
		String sname=sc.next();
		System.out.println("Enter email:");
		String email=sc.next();
		System.out.println("Enter  phoneNo :");
		int phoneno=sc.nextInt();
		System.out.println("Enter  cid :");
		int cid=sc.nextInt();
		System.out.println("Enter  Fees Status :");
		String feesstatus=sc.next();
		System.out.println("Enter  joining date :");
		String joiningdate=sc.next();
		try 
		{
			pst= con.prepareStatement("insert into course values(?,?,?,?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, sname);
			pst.setString(3, email);
			pst.setInt(4, phoneno);
			pst.setInt(5, cid);
			pst.setString(6, feesstatus);
			pst.setString(7, joiningdate);
			int noOfRowsInserted=pst.executeUpdate();
			if(noOfRowsInserted>0)
			{
				System.out.println("Student added...");
			}
			else
			{
				System.out.println("Error in adding Student...");
			}
		} catch (SQLException e)
		{
			System.out.println(e);
		}
	}
	public void deleteStudentById()
	{
		System.out.println("Enter the studentid to be deleted");
		int id=sc.nextInt();
		try 
		{
			int noOfRowDeleted=st.executeUpdate("delete from student where sid="+id);
			if(noOfRowDeleted>0)
			{
				System.out.println("Student :"+id+" is deleted");
				System.out.println("-----------------------------------------");
				fetchStudentDetails();
			}
			else
			{
				System.out.println("Student id is not present....");
			}
		} catch (SQLException e)
		{
			System.out.println(e);
		}
	}
	
	public boolean searchStudentById(int id)
	{
		boolean isFound=false;
		try 
		{
			pst=con.prepareStatement("select * from student where sid=?");
			pst.setInt(1, id);
			rs=pst.executeQuery();
			while(rs.next())
			{
				isFound=true;
				System.out.println("Student id :"+rs.getInt(1));
				System.out.println("Student Name :"+rs.getString(2));
				System.out.println("Email :"+rs.getString(3));
				System.out.println("Phone No :"+rs.getInt(4));
				System.out.println("Course Id :"+rs.getInt(5));
				System.out.println("Fees Status :"+rs.getString(4));
				System.out.println("Joining Date :"+rs.getString(5));
			}
		} catch (Exception e) 
		{
			System.out.println(e);
		}
		return isFound;
	}
	public void updateStudentFees()
	{
		System.out.println("Enter student id whose fees is to update");
		int id=sc.nextInt();
		if(searchStudentById(id))
		{
			System.out.println("Enter new Fees :");
			float fees=sc.nextFloat();
			try 
			{
			 pst=con.prepareStatement("update student set cid=? where cid=?");
			 pst.setFloat(1, fees);
			 pst.setInt(2, id);
			 int noOfRowsUpdated=pst.executeUpdate();
			 if(noOfRowsUpdated>0)
			 {
				 System.out.println("Student fees updated");
				 searchStudentById(id);
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
	studentCrud obj=new studentCrud();
//	obj.fetchStudentDetails();
//	obj.deleteStudentById();
	
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
	  case 1: obj.insertStudent();
	          break;
	  case 2:obj.deleteStudentById();
	         break;
	  case 3:obj.updateStudentFees();;
             break;
	  case 4:obj.fetchStudentDetails();;
             break;
	  case 5:System.out.println("Enter the student id to be searched :");
	         int id=sc.nextInt();
	         boolean isPresent=obj.searchStudentById(id);
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

