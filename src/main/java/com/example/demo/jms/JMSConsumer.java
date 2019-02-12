package com.example.demo.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Book;

@Component
public class JMSConsumer {

	@JmsListener(destination = "outboundQueue")
	public void recieveMessage(Book book) {
		System.out.println("recieved message   " + book.getBookId() + "  " + book.getBookId());
	}

}
