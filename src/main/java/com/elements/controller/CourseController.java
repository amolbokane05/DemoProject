package com.elements.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {

    System.out.println("java learn");

	
	//course?name=SpringBoot
			
	@GetMapping("/course")
	public String course(String name, Model model) {
		
		String mess = "Hi "+ name + " Welcome to JDC-04";
		
		model.addAttribute("msg", mess);
		
		return "index";
	}
	
	//courseDetails?courseName=SpringBoot&trainerName=Anil
	
	@GetMapping("courseDetails")
	public String courseDetails(@RequestParam String courseName,@RequestParam("tName") String trainerName, Model mod) {
		 
		String ms;
		
		if(courseName.equals("SpringBoot") && trainerName.equals("Charan")) {
			
			ms = courseName + " by " + trainerName + " starting from 17-Jan-2022 !!!";
		}else {
			ms = "Please contact to branch..!";
		}
		
		mod.addAttribute("msg1", ms);
		
		return "index";
	}
	
	
}
