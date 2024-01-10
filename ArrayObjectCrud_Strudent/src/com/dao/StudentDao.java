package com.dao;

import com.pojo.Student;

public interface StudentDao {

	void addStudent(Student std);
	void updateStudent(Student std);
	void deleteStudent(int  sid);
	void showAllBook();
	Student searchBookById(int sid);
	
}

