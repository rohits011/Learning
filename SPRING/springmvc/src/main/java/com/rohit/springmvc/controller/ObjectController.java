package com.rohit.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rohit.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("displayObject");
		Employee e=new Employee();
		e.setId(1);;
		e.setName("rohit");
		e.setSalary(10000);
		mav.addObject("employee",e );
		return mav;
	}
}
