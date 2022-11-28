package br.com.notlinoel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Olá, mundo Java Web com Spring e Spring Boot!";
	}

}