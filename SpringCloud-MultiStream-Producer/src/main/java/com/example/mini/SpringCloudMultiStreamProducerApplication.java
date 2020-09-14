package com.example.mini;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mini.model.Book;

@SpringBootApplication
@EnableBinding(Source.class)
@RestController
public class SpringCloudMultiStreamProducerApplication {

	@Autowired
	private MessageChannel output; 
	
	@PostMapping(value = "publish")
	public Book publishBook(@RequestBody Book book) {
		output.send(MessageBuilder.withPayload(book).build());
		return book;
		
	}
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMultiStreamProducerApplication.class, args);
	}

}
