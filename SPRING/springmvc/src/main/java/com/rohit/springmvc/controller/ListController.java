package com.rohit.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rohit.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("displayList");
		Employee e=new Employee();
		e.setId(1);;
		e.setName("rohit");
		e.setSalary(10000);
		Employee e1=new Employee();
		e1.setId(2);;
		e1.setName("rohit singh");
		e1.setSalary(50000);
		Employee e2=new Employee();
		e2.setId(3);;
		e2.setName("raja");
		e2.setSalary(10000);
		List<Employee> employees=new ArrayList<>();
		employees.add(e);
		employees.add(e1);
		employees.add(e2);
		mav.addObject("employees",employees );
		return mav;
	}
}
