package com.tss.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {


	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public String test(@RequestParam("userName") String userName){
		logger.info("Request Came Here userName:"+userName);
		return "Hi "+userName;
	}
}
