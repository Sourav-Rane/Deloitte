package com.OnlineExam.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.OnlineExam.deloitte.model.Question;


@Controller
public class QuestionController {

	@RequestMapping("/addQuestion")
	public ModelAndView addQuestion(Question question) {
		System.out.println("Question Controller => addQuestion ");
		ModelAndView view = new ModelAndView("addQuestion");
		view.addObject("command",new Question());
		System.out.println(question);
		return view;
		
	}
	
	
	@RequestMapping("/saveQuestion")
	public ModelAndView saveQuestion(Question question) {
		System.out.println("Question Controller => saveQuestion ");
		ModelAndView view = new ModelAndView("productForm");
		view.addObject("command",new Question());
		System.out.println(question);
		return view;
		
	}
	
	

	@RequestMapping("/deleteQuestion")
	public ModelAndView deleteQuestion(Question question) {
		System.out.println("Question Controller => deleteQuestion ");
		ModelAndView view = new ModelAndView("productForm");
		view.addObject("command",new Question());
		System.out.println(question);
		return view;
		
	}
	
	@RequestMapping("/viewQuestion")
	public ModelAndView viewQuestion(Question question) {
		System.out.println("Question Controller => viewQuestion ");
		ModelAndView view = new ModelAndView("productForm");
		view.addObject("command",new Question());
		System.out.println(question);
		return view;
		
	}
	
}
