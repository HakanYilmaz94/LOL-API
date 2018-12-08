package com.lol.rest.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "customHealth")
public class SystemHealthCheckController {
	
	private static Logger log = LoggerFactory.getLogger(SystemHealthCheckController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public String systemUpAndRunning() {
		log.info("Service called by client: System is UP and RUNNING");
		
		return ("LOL API IS UP AND RUNNING");
	}
	

}
