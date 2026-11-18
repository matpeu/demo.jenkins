package com.example.demo.jenkins.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping ("/api/hello")
public class HelloRestController {

	@GetMapping
	public String hello()
	{
	  return "Hello from api";
	}
}