package com.dao;


import com.pojo.Student;

public class StudentDaoImpl implements StudentDao
{
	Student stdarr[];
	int i;
	int index;
	Student std;
	public StudentDaoImpl()
	{
		stdarr=new Student[10];
		index=0;
	}
	@Override
	public void addStudent(Student std)
	{
		stdarr[index]=std;
		index++;
		
	}

	@Override
	public void updateStudent(Student std1)
	{
		std=searchBookById(std1.getSid());
		if(std!=null)
		{
			System.out.println("Student is Present");
			for(int i=0;i<index;i++)
			{
				if(std1.getSid()==stdarr[i].getSid())
				{
					stdarr[i]=std1;
					System.out.println("Student is Updated");
					break;
				}
			}
		}
		
	}

	@Override
	public void deleteStudent(int sid)
	{
		std = searchBookById(sid);
	    if (std != null) 
	    {
	       System.out.println("Student is  Present");
	       for (int i=0;i<index;i++)
	       {
	    	   if(sid==stdarr[i].getSid())
	    	   {
	    		   stdarr[i]=null;
	    		   System.out.println("Student is Removed");
	    		   break;
	    	   }
	       }
	    }
	    else
	    	System.out.println("Student is not Present");
		
	}

	@Override
	public void showAllBook()
	{
		for(int i=0;i<index;i++) {
			if(stdarr[i]!=null)
			System.out.println(stdarr[i]);
		}
		
	}

	@Override
	public Student searchBookById(int sid)
	{
		Student s=null;
		for(int i=0;i<index;i++) {
			if(stdarr[i].getSid()==sid) {
				s=stdarr[i];
				
				break;
			}
		}
		return s;
	}

}


