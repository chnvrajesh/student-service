package com.nvrviews.studentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentVO {

	private Long studentId;
	private String firstName;
	private String lastName;
	private String email;
	private Course course;
	public void setCourse() {
		// TODO Auto-generated method stub
		
	}
}
