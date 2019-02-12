package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;

@RestController
@RequestMapping("/")
public class JMSController {

	@Autowired
	JmsTemplate jmsTemplate;

	@RequestMapping("/send")
	public void sendMessage() {

		jmsTemplate.convertAndSend("outboundQueue", new Book(100, "oracle"));

	}
}
