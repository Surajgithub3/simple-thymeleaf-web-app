package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HellowordController {
	
	@GetMapping("/hello")
	public String hello(Model model)
	{	
		model.addAttribute("msg", "Hello Vivek Balaji B");
		return "helloword";
	}
	@GetMapping("/wel")
	public String welcome(Model model)
	{	
		//model.addAttribute("msg", "Hello Vivek Balaji B");
		return "index";
	}
	@GetMapping("/helloword")
	public String home(Model model)
	{	
		model.addAttribute("msg", "Hello Vivek Balaji B");
		return "helloword";
	}
}
