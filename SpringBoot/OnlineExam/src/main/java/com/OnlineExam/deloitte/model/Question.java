package com.OnlineExam.deloitte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "hr", name = "question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String questionId;
	@Column
	private String questionCategory;
	@Column
	private String question;
	@Column
	private String questionChoice1;
	@Column
	private String questionChoice2;
	@Column
	private String questionChoice3;
	@Column
	private String questionAnswer;
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionCategory=" + questionCategory + ", question="
				+ question + ", questionChoice1=" + questionChoice1 + ", questionChoice2=" + questionChoice2
				+ ", questionChoice3=" + questionChoice3 + ", questionAnswer=" + questionAnswer + "]";
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestionCategory() {
		return questionCategory;
	}
	public void setQuestionCategory(String questionCategory) {
		this.questionCategory = questionCategory;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getQuestionChoice1() {
		return questionChoice1;
	}
	public void setQuestionChoice1(String questionChoice1) {
		this.questionChoice1 = questionChoice1;
	}
	public String getQuestionChoice2() {
		return questionChoice2;
	}
	public void setQuestionChoice2(String questionChoice2) {
		this.questionChoice2 = questionChoice2;
	}
	public String getQuestionChoice3() {
		return questionChoice3;
	}
	public void setQuestionChoice3(String questionChoice3) {
		this.questionChoice3 = questionChoice3;
	}
	public String getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public Question() {
		super();
	}
	public Question(String questionCategory, String question, String questionChoice1, String questionChoice2,
			String questionChoice3, String questionAnswer) {
		super();
		this.questionCategory = questionCategory;
		this.question = question;
		this.questionChoice1 = questionChoice1;
		this.questionChoice2 = questionChoice2;
		this.questionChoice3 = questionChoice3;
		this.questionAnswer = questionAnswer;
	}
	
	
	
	
	
	
}
