package com.example.student.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import com.example.student.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private StudentRepository studentRepo;
	
	@RequestMapping("/addStudent")
	public String addStudent() {
		return "addStudent";
	}
	
	@RequestMapping("/addStudentRecord")
	public String addStudentRecord(@ModelAttribute("student") Student student) {
		studentRepo.save(student);
		return "dashboard";
	}
	
	@RequestMapping("/modifyMark")
	public String modifyMark() {
		return "modifyMark";
	}
	
	@RequestMapping("/modifyMarksRecord")
	public String modifyMarksRecord(@RequestParam("id") Long id,ModelMap modelMap) {
		Student updateMarks = studentService.updateMarks(id);
		modelMap.addAttribute("student", updateMarks);
		return "modifyMark1";
	}
	
	@RequestMapping("/modifyMarksRecord1")
	public String modifyMarksRecord1(@RequestParam("id") long id,@RequestParam("marks")long marks) {
	studentService.updateNewMarks(id, marks);
		return "dashboard";
	}
	
	
	@RequestMapping("/deleteStudent")
	public String deleteStudent() {
		return "deleteStudent";
	}
	
	@RequestMapping("/deleteStudentRecord")
	public String deleteStudentRecord(@RequestParam("id")long id) {
		studentService.deleteRecord(id);
		return "dashboard";
	}
	
	@RequestMapping("/allStudent")
	public String allStudent(ModelMap modelMap) {
		List<Student> student = studentService.getStudents();

		modelMap.addAttribute("student",student);
		return "allStudent";
	}
	
	
	
	
}
