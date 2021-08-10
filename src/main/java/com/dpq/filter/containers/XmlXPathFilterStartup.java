package com.dpq.filter.containers;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class XmlXPathFilterStartup {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-integration-xml-xpath-filter.xml");
		System.out.println("Contanier started.....");
		while(true) {
		}
		
	}

}
