package com.connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class callableStatementDemo3 {
	
	static Connection con=null;
	Statement st;
	ResultSet rs;
    CallableStatement cst;
	static Scanner sc= new Scanner(System.in);
	
	callableStatementDemo3()
	{ 
		con=DBtest_courseConnect.getConnect();
		System.out.println("Connection established...");
		try {
			st=con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	
	// call functions
	// checkOddEven
	
	public void callFunction3()
	{
		System.out.println("Enter a department name:");
		String dname=sc.next();
		
		try {
			cst= con.prepareCall("{?= call findManager(?) }");
			cst.registerOutParameter(1, Types.VARCHAR);
			cst.setString(2, dname);
			
			boolean status= cst.execute();
	        if(!status)
	        {
	        	System.out.println(" Manager Name:"+cst.getString(1));
	        }
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// storedprocedure 
	
	public void callStoredPro1()
	{
//		System.out.println("Enter a salary:");
//		float salary=sc.nextFloat();
		
		try {
			
			cst= con.prepareCall("{call empDetails}");
//			cst.setFloat(1, salary);
			
			boolean status= cst.execute();
			if(status)
			{
				rs= cst.getResultSet();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
				}
			}
			
		} catch (Exception e) {
		
			System.out.println(e);
		}
	}
	
	public void callStoredPro2()
	{
		System.out.println("Enter departmentid:");
		int did= sc.nextInt();
		
		try {
			
			cst= con.prepareCall("{call deptWiseSalary(?,?)}");
			cst.setInt(1, did);
			cst.registerOutParameter(1, Types.INTEGER);
			cst.registerOutParameter(2, Types.FLOAT);
			
			boolean status= cst.execute();
			if(status)
			{
				rs= cst.getResultSet();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getFloat(2));
				}
			}
			
		} catch (Exception e) {
		
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		
		callableStatementDemo3 obj= new callableStatementDemo3();
		//obj.callFunction3();
		//obj.callStoredPro1();
		obj.callStoredPro2();
		
	}

}

