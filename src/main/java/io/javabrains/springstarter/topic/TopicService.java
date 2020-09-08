package io.javabrains.springstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("Spring","Spring Framework","Spring Framwork Description"),
			new Topic("Java", "Core Java", "Java Description"),
			new Topic("Javascript", "Javascript", "Javascript Description")
			);
	
	public List<Topic> getTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		for(Topic topic : topics) {
			System.out.print(topic.getId());
			if(topic.getId().equals(id)) {				
				return topic;
			}
		}
		return null;
	}
}
