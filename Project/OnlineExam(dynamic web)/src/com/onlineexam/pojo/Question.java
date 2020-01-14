package com.onlineexam.pojo;

public class Question {
	private int questionId;
	private String category;
	private String question;
	private String choice1;
	private String choice2;
	private String choice3;
	private String answer;
	
	public Question(int questionId, String category, String question, String choice1, String choice2, String choice3,
			String answer) {
		super();
		this.questionId = questionId;
		this.category = category;
		this.question = question;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.answer = answer;
	}
	
	public Question() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", category=" + category + ", question=" + question + ", choice1="
				+ choice1 + ", choice2=" + choice2 + ", choice3=" + choice3 + ", answer=" + answer + "]";
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getChoice1() {
		return choice1;
	}
	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}
	public String getChoice2() {
		return choice2;
	}
	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}
	public String getChoice3() {
		return choice3;
	}
	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
