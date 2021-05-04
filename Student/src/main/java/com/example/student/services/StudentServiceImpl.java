package com.example.student.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public Student updateMarks(long id) {
		Optional<Student> findById = studentRepo.findById(id);
		Student student = findById.get();
		return student;
	}

	@Override
	public Student updateNewMarks(long id, long marks) {
		
		Optional<Student> findById = studentRepo.findById(id);
		Student student = findById.get();
		student.setMarks(marks);
		studentRepo.save(student);
		
		return student;
	}

	@Override
	public void deleteRecord(long id) {

		studentRepo.deleteById(id);
		
	}

	@Override
	public List<Student> getStudents() {
		List<Student> findAll = studentRepo.findAll();
		return findAll;
	}

}
