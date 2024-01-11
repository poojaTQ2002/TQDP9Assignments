package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBtest_courseConnect
{
	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://localhost:3306/test_course";
    public static final String USERNAME="root";
    public static final String PASSWORD="root";
	static Connection con=null;
	public static Connection getConnect()
	{
		try 
		{
		  Class.forName(JDBC_DRIVER);
		  System.out.println("Driver lodede...");
		   con=DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
		   System.out.println("Connection establishes..");
		} catch (Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
  public static void main(String[] args)
  {
	getConnect();
	  
}
}
