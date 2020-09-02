package io.javabrains.springstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("Spring","Spring Framework","Spring Framwork Description"),
				new Topic("Java", "Core Java", "Java Description"),
				new Topic("Javascript", "Javascript", "Javascript Description")
				);
	}
}
