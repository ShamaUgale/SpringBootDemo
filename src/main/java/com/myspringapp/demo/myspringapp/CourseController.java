package com.myspringapp.demo.myspringapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspringapp.demo.sctrach.hello.Topic;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(
				new Course("1", "Core Java") ,
				new Course("2", "Selenium"),
				new Course("3", "REst Automation")
				
				);
	}
}
