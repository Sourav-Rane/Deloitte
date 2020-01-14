package com.onlineexam.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onlineexam.dao.OnlineExamDAO;
import com.onlineexam.pojo.Question;

public class OnlineExamDAOImpl implements OnlineExamDAO{
	
	Configuration config = null;
	SessionFactory factory = null;  

	@Override
	public boolean addQuestion(Question qn) {
		
		return false;
	}

	@Override
	public boolean deleteQuestion(int qn_id) {
		
		return false;
	}

	@Override
	public List<Question> listQuestionsbyCategory() {
		
		return null;
	}

}
