package com.Comparable;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2)
	{
		if(e1.getEsalary()==e2.getEsalary())
		{
			return e1.getEname().compareTo(e2.getEname());
		}
		else if(e1.getEsalary()<e2.getEsalary())
		{
			return -1;
		}
		else
			return 1;
	}

}
