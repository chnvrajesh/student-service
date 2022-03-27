package com.nvrviews.studentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nvrviews.studentservice.entity.Student;
import com.nvrviews.studentservice.model.StudentVO;
import com.nvrviews.studentservice.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController implements StudentApiContract{
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/{id}")
	public StudentVO getStudentById(@PathVariable("id") Long id) {
		return studentService.getStudentById(id);
	}
	
	@GetMapping("/")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

}
