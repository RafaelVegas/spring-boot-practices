package com.curso3.practices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping(path = "/greet")
public class BasicController {
	
	@GetMapping(path = {"/helloworld", "/hello"})
	public String greetWorld() {
		return "index";
	}
}
