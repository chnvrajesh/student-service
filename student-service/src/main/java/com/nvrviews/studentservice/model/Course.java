package com.nvrviews.studentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

	private Long courseId;
	private String courseName;
	private String courseDescription;
	private String courseCode;
}
