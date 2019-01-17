package com.springboot.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	 
    @RequestMapping("/pfr") 
    public String sayHello(){
    	logger.error("hello world error");
        logger.info("hello world info");
        logger.debug("hello world debug");
        return "Hello,World!";
    }
}
