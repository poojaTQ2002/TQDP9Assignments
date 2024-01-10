package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{

	List<Employee> elist=null;
	Employee eobj=null;
	
	public EmployeeDaoImpl() 
	{
		elist=new ArrayList<Employee>();
	}
	
	@Override
	public void addEmployee(Employee emp)
	{
		
		elist.add(emp);
	}

	@Override
	public void updateEmployee(Employee emp) 
	{
		for(int i=0;i<elist.size();i++)
		{
			if(elist.get(i).getEid()==emp.getEid())
			{
				elist.set(i, emp);
				System.out.println("Employee Update Succesfully");
				break;
			}
		}
	}

	@Override
	public void deleteEmployee(int empid) {
		eobj=searchEmployeeById(empid);
		
		if(eobj!=null) {
			for(int i=0;i<elist.size();i++) {
				if(empid==elist.get(i).getEid()) {
					elist.remove(i);
					System.out.println("employee deleted");
				}
			}
		}
		else {
			System.out.println("employee record not found");
		}
		
	}

	@Override
	public List<Employee> showEmployeeList() {
		
		return elist;
	}

	@Override
	public Employee searchEmployeeById(int empid) {
		eobj=null;
		for(int i=0;i<elist.size();i++) {
			if(empid==elist.get(i).getEid()) {
				System.out.println("id:"+empid);
				eobj=elist.get(i);
				break;
			}
		}
		return eobj;
	}

}

