package com.myspringapp.demo.sctrach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.myspringapp.demo.sctrach.hello.Topic;

@Service
public class TopicService {

	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic ("1", "Core Java", "Core Java course"),
			new Topic("2", "Selenium", "Selenium Webdriver and Selenium 3.0 course"),
			new Topic("3", "REst Automation", "Rest API Automation with RestAssured")
			
			));
	
	public List<Topic> getAlltopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		for(int i =0; i<topics.size();i++){
			Topic t= topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}
	}

	public void dleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t -> t.getId().equals(id));
	}
}
