package com.lavanya.gudimella;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoggerExample {

	private static Logger logger = LogManager.getLogger(LoggerExample.class);

	public static void main(String[] args) {
		logger.info("This is my first logging message using Log4j Tool");
		logger.error("ERROR MESSAGE");
	}
}
