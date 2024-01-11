package com.connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetCrud {
	
	Connection con= null;
	static Scanner sc= new Scanner(System.in);
	Statement st;
	ResultSet rs;
	
	public ResultSetCrud() {
		
		con= DBConnect.getConnect();
		
		try {
			st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs= st.executeQuery("select * from course");
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		
	}
	
	public void fetchAllCourses()
	{
		try {
			// take cursor before the first row
			rs.beforeFirst();
			//rs= st.executeQuery("select * from course");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getFloat(4)+" "+rs.getInt(5));
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public void fetchAllCoursesReverse()
	{
		try {
		
			rs.afterLast();
			//rs= st.executeQuery("select * from course");
			while(rs.previous())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getFloat(4)+" "+rs.getInt(5));
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public void insertCourse()
	{
		System.out.println("Enter course id:");
		int id= sc.nextInt();
		
		System.out.println("Enter the course name:");
		String cname= sc.next();
		
		System.out.println("Enter duration(in months):");
		int dur= sc.nextInt();
		
		System.out.println("Enter fees:");
		float fees= sc.nextFloat();
		
		try {
			rs.moveToInsertRow();
			rs.updateInt(1, id);
			rs.updateString(2, cname);
			rs.updateInt(3, dur);
			rs.updateFloat(4, fees);
			rs.updateInt(5, 0);
			rs.insertRow();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void deleteCourse()
	{
		System.out.println("Enter the courseid to be deleted:");
		int id=sc.nextInt();
		
		try {
			rs.beforeFirst();
			while(rs.next())
			{
				if(rs.getInt(1)==id)
				{
					rs.deleteRow();
				}
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	
	public void updateCourseFees()
	{
		System.out.println("Enter course name whose fees is to updated:");
		String cname=sc.next();
		
		try {
			rs.beforeFirst();
			while(rs.next())
			{
				if(rs.getString(2).equalsIgnoreCase(cname))
				{
					System.out.println("Old fees:"+rs.getFloat(4));
					System.out.println("Enter the new fees:");
					float fees= sc.nextFloat();
					
					rs.updateFloat(4, fees);
					rs.updateRow();
				}
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		
	}
	public static void main(String[] args) {
				
		ResultSetCrud d1= new ResultSetCrud();
		int choice;
		char ch;
		
		do
		{
			System.out.println("=========================================================");
			System.out.println("1. Add new Course");
			System.out.println("2. Delete Course");
			System.out.println("3. Update Course fees");
			System.out.println("4. View all courses ");
			System.out.println("5. View all courses Reverse ");
			System.out.println("6. Exit");
			
			System.out.println("Enter your choice:");
			System.out.println("---------------------------------------------------");
			
			choice= sc.nextInt();
			
			switch(choice)
			{
			case 1: d1.insertCourse();
			        break;
			case 2: d1.deleteCourse();
			        break;
			case 3: d1.updateCourseFees();
			        break;
			case 4: d1.fetchAllCourses();
			        break;
			case 5: d1.fetchAllCoursesReverse();
			        break;
			case 6: System.out.println("------------Closing the course application---------------");
				    System.exit(0);	 
			        break;
			
		    default: System.out.println("Wrong input");       
		   }
			
			System.out.println("Do you want perform more operation(y-yes/n-no)");
			ch= sc.next().charAt(0);
			
		}while(ch=='y'||ch=='Y');
		
	}
		
}



