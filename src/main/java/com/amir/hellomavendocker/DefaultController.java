package com.amir.hellomavendocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
	@RequestMapping
	public String hello(){return "hello again";}
}
