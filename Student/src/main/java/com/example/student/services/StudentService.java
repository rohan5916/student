package com.example.student.services;

import java.util.List;

import com.example.student.entity.Student;

public interface StudentService {
	
	Student updateMarks(long id); 
	Student updateNewMarks(long id,long marks);
	
	void deleteRecord(long id);
	List<Student> getStudents();

}
