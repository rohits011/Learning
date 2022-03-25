package com.rohit.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rohit.springmvc.dto.User;

@Controller
public class UserController {
	
	@RequestMapping("/registrationPage")
	public ModelAndView showRegistrationPage() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("userReg");
		return mav;
	}

	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user")User user) {
		System.out.println(user);
		ModelAndView mav=new ModelAndView();
		mav.addObject("user", user);
		mav.setViewName("regResult");
		return mav;
	}
}
