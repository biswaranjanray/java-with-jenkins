package com.java.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaWithJenkinsApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(JavaWithJenkinsApplicationTests.class);
	
	@Test
	public void contextLoads() {
		assertEquals(true, true);
		logger.info("Loading and executing the testcase...");
		logger.info("Loading and executing a second log statement in the testcase...");
	}

}
