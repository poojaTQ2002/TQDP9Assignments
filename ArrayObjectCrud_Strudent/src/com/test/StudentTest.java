package com.test;

import java.util.Scanner;

import com.dao.StudentDaoImpl;
import com.pojo.Course;
import com.pojo.Student;

public class StudentTest 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int choice;
		int sid;
		String sname;
		Course course;
		char ch;
		int students=0;
		Student std = null;
		StudentDaoImpl sdao = new StudentDaoImpl();
		do {
			System.out.println("----Welcome to StudentInfo----");
			System.out.println("-----------------------------");
			System.out.println("1.add Student");
			System.out.println("2.update Student");
			System.out.println("3.delete Student");
			System.out.println("4.show Student");
			System.out.println("5.search Student by id");
			System.out.println("-----------------------------");

			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("~~~~Add Student~~~~");
				System.out.println("how many Student you want to add");
				students = sc.nextInt();
				for (int i = 1; i <= students; i++) {
					System.out.println("enter student id:");
					sid = sc.nextInt();
					System.out.println("enter student name:");
					sname = sc.next();
					//System.out.println("enter  Course:");
					
					std = new Student(sid, sname, new Course(101,"Science"));
					sdao.addStudent(std);
				}
				break;
			case 2:
				System.out.println("enter student id:");
				sid = sc.nextInt();
				System.out.println("enter student name:");
				sname = sc.next();
//				System.out.println("enter  Course:");
//				std.getCourse().setCid(sc.nextInt());
//				std.getCourse().setCname(sc.nextLine());
				std = new Student(sid, sname, new Course(101,"IT"));
				sdao.updateStudent(std);
				
				break;
			case 3:
				System.out.println("~~~~Delate Student~~~~");
				System.out.println("Enter Student id:");
				sid=sc.nextInt();
				sdao.deleteStudent(sid);
				break;
	
				
			case 4:
				System.out.println("~~~~Show Student~~~~");
				if(students!=0) {
				sdao.showAllBook();
				}
				else {
					System.out.println("no book found");
				}
				break;
				
			case 5:
				System.out.println("~~~~Search Student~~~~");
				System.out.println("Enter Student id:");
				sid=sc.nextInt();
				std=sdao.searchBookById(sid);
				if(std!=null) {
					System.out.println(std);
				}
				else {
					System.out.println("please check book id");
				}
				break;
			}
			System.out.println("Do u Want to continue??");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}

}


