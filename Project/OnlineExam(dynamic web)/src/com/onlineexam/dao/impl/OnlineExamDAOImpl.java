package com.onlineexam.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onlineexam.dao.OnlineExamDAO;
import com.onlineexam.pojo.Question;

public class OnlineExamDAOImpl implements OnlineExamDAO{
	
	Configuration config = null;
	SessionFactory factory = null; 
	
	
	public void  OnlineExamDAOImpl() {
		config = new Configuration().configure();
		factory = config.buildSessionFactory();
	}

	@Override
	public boolean addQuestion(Question qn) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(qn);
		transaction.commit();
		session.close();
		return true;
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
