package com.nvrviews.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nvrviews.studentservice.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	Student findByStudentId(Long id);

}
