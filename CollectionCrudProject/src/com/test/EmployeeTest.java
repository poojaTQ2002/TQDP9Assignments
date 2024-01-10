package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.EmployeeDaoImpl;
import com.pojo.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		int eid;
		String ename;
		double esal;
		Scanner sc = new Scanner(System.in);
		int choice;
		char ch;
		Employee emp=null;
		EmployeeDaoImpl edao = new EmployeeDaoImpl();
		List<Employee> elist = new ArrayList<Employee>();
		
		do {
		System.out.println("---Employee Operation----");
		System.out.println("--------------------------");
		System.out.println("1.add employee");
		System.out.println("2.update employee");
		System.out.println("3.delete employee");
		System.out.println("4.show employee list");
		System.out.println("5.search employee by id");
		System.out.println("--------------------------");

		System.out.println("Enter your choice");
		choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("---add employee---");
			System.out.println("how many eployee you want to add in list?");
			int num = sc.nextInt();
			for (int i = 1; i <= num; i++) {
				System.out.println("Enter emp id:");
				eid = sc.nextInt();
				System.out.println("Enter emp name:");
				ename = sc.next();
				System.out.println("Enter emp sal:");
				esal = sc.nextDouble();
				emp = new Employee(eid, ename, esal);
				edao.addEmployee(emp);
			}
			break;
		case 2://update employee
				System.out.println("Enter emp id:");
				eid = sc.nextInt();
				System.out.println("Enter emp name:");
				ename = sc.next();
				System.out.println("Enter emp sal:");
				esal = sc.nextDouble();
				emp = new Employee(eid, ename, esal);
				edao.updateEmployee(emp);
			
			break;
		case 3://delete employee
			System.out.println("---Delete employee---");
			System.out.println("Enter Employee id:");
			eid=sc.nextInt();
			edao.deleteEmployee(eid);
			break;
		case 4://show employee
			elist=edao.showEmployeeList();
			
			if(!elist.isEmpty()) {
				System.out.println("Employee List");
				for(Employee e1:elist) {
					System.out.println(e1);
				}
			}
			else {
				System.out.println("no list found");
			}
			break;
		case 5://search employee
			System.out.println("Enter emp id:");
			eid = sc.nextInt();
			emp=edao.searchEmployeeById(eid);
			if(emp!=null) {
				System.out.println(emp);
			}
			else {
				System.out.println("employee not present");
			}
			break;
		}
		System.out.println("do u want to continue??");
		ch = sc.next().charAt(0);
	} while (ch == 'y' || ch == 'Y');
	}

}


