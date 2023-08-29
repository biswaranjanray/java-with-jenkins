package com.java.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaWithJenkinsApplication {
	
	public static final Logger logger = LoggerFactory.getLogger(JavaWithJenkinsApplication.class);

	public void init() {
		logger.info("The application is loaded...");
	}
	
	public static void main(String[] args) {
		logger.info("The application is execute...");
		SpringApplication.run(JavaWithJenkinsApplication.class, args);
	}

}
