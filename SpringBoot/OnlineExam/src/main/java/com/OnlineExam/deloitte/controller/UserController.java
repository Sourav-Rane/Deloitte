package com.OnlineExam.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.OnlineExam.deloitte.model.Question;
import com.OnlineExam.deloitte.model.User;

@Controller
public class UserController {
	
	@RequestMapping("/userLogin")
	public ModelAndView userLogin(User user) {
		System.out.println("Question Controller => userLogin ");
		ModelAndView view = new ModelAndView("userLogin");
		view.addObject("command",new User());
		System.out.println(user);
		return view;
		
	}
	
	
	

	@RequestMapping("/userSignup")
	public ModelAndView userSignup(User user) {
		System.out.println("Question Controller => userSignup ");
		ModelAndView view = new ModelAndView("userSignup");
		view.addObject("command",new User());
		System.out.println(user);
		return view;
		
	}
	

}
