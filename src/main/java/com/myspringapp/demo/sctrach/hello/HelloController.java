package com.myspringapp.demo.sctrach.hello;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello") // this kind of call is only for get methods, for others u need to mention, by default it would be get method
	public String sayHi(){
		return "Hi !!";
	}

//	@RequestMapping("/topics")
//	public List<Topic> getAllTopics(){
//		return Arrays.asList(
//				new Topic ("1", "Core Java", "Core Java course"),
//				new Topic("2", "Selenium", "Selenium Webdriver and Selenium 3.0 course"),
//				new Topic("3", "REst Automation", "Rest API Automation with RestAssured")
//				
//				);
//	}
}
