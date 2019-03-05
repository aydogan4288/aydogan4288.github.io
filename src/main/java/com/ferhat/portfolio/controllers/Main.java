package com.ferhat.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

	
	
	@GetMapping("/")
	public String index2() {
		System.out.println("loading index 2");
		return "index-3.jsp";
	}
	
	@GetMapping("/p2")
	public String portfolio() {
		System.out.println("loading index 2");
		return "portfolio-single-2.jsp";
	}
	
}
