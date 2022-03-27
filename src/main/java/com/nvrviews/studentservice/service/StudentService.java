package com.nvrviews.studentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nvrviews.studentservice.entity.Student;
import com.nvrviews.studentservice.model.Course;
import com.nvrviews.studentservice.model.StudentVO;
import com.nvrviews.studentservice.repository.StudentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	public StudentVO getStudentById(Long id) {
		// TODO Auto-generated method stub
		
		log.info("Student Service > get student by Id");
		StudentVO studentObj = new StudentVO();
		
		Student s = studentRepository.findByStudentId(id);
		
		Course c= restTemplate.getForObject("http://API-GATEWAY/course/"+ s.getCourseId(), Course.class);
		
		studentObj.setStudentId(s.getStudentId());
		studentObj.setFirstName(s.getFirstName());
		studentObj.setLastName(s.getLastName());
		studentObj.setEmail(s.getEmail());
		studentObj.setCourse(c);
		
		return studentObj;
		
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		List<Student> studentObjs = studentRepository.findAll();
		
		return studentObjs;
	}

}
