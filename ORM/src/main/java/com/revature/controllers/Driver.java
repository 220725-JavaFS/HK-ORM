package com.revature.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Driver {
	
	private static Logger log = LoggerFactory.getLogger(Driver.class);

	public static void main(String[] args) {
		log.debug("I am a debug log.");
		log.info("I am an info log.");
		log.warn("I am a warn log.");
		log.error("I am an error log.");
	}

}
