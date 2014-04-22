package org.thayz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value={ "/", "welcome**"}, method = RequestMethod.GET)
	public ModelAndView welcomePage(){
		
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is Welcome Page!!!");
		model.setViewName("hello");
		
		return model;
	}
	
	@RequestMapping(value="/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage(){
		System.out.println("in adminPage()...");
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World.");
		model.addObject("message", "This is protected page.");
		
		model.setViewName("admin");
		
		return model;
	}
}
