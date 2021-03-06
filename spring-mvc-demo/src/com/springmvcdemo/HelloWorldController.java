package com.springmvcdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
//	@RequestMapping("/processForm")
//	public String processForm() {
//		return "helloworld";
//	}
	
	@RequestMapping("/processForm2")
//	public String processForm2(HttpServletRequest request, Model model) {
//		String name = request.getParameter("name");
	public String processForm2(@RequestParam("name") String name, Model model) {
		name= name.toUpperCase();
		model.addAttribute("message", name);
		return "helloworld";
		
	}
}
