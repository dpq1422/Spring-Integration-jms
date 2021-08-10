package com.dpq.filter.containers;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class MessageSelectorFilterStartup {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-integration-message-selector-filter.xml");
		System.out.println("Contanier started.....");
		while(true) {
			
		}
		
	}

}
