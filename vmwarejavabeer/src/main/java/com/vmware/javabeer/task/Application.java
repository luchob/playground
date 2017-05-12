package com.vmware.javabeer.task;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Value("${customvalue:42}")
	private int value;

	public Application() {
		logger.info("In constructor - the value is {}.", value);
	}

	@PostConstruct
	private void postConstruct() {
		logger.info("In post construct - the value is {}.", value);
	}
}
