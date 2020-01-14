package com.onlineexam.client;

import com.onlineexam.dao.OnlineExamDAO;
import com.onlineexam.dao.impl.OnlineExamDAOImpl;
import com.onlineexam.pojo.Question;

public class Client {
	public static void main(String[] args) {
		
		OnlineExamDAO questionDAO = new OnlineExamDAOImpl();
		Question question = new Question();
		question.acceptQuestion();
		boolean result = false;
		if (questionDAO.is(question.getProductId()))
			System.out.println(question.getProductId() + " already exits !");
		else {
			result = questionDAO.addProduct(question);
			System.out.println(question.getProductName() + " added successfully !");
		}
		System.out.println(result);

	}
}
