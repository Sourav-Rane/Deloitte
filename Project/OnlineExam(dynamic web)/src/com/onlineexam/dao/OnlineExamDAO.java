package com.onlineexam.dao;

import java.util.List;

import com.onlineexam.pojo.Question;

public interface OnlineExamDAO {

	public boolean addQuestion(Question qn);
	
	public boolean deleteQuestion(int qn_id);
	
	public  List<Question> listQuestionsbyCategory();

}
