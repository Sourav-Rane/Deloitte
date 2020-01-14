package com.onlineexam.pojo;

public class Statistic {

	private String studentEmail;
	private String studentName;
	private int score;
	private String category;


	@Override
	public String toString() {
		return "Statistic [studentEmail=" + studentEmail + ", studentName=" + studentName + ", score=" + score
				+ ", category=" + category + "]";
	}


	public Statistic(String studentEmail, String studentName, int score, String category) {
		super();
		this.studentEmail = studentEmail;
		this.studentName = studentName;
		this.score = score;
		this.category = category;
	}


	public String getStudentEmail() {
		return studentEmail;
	}


	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}
	
	
}


