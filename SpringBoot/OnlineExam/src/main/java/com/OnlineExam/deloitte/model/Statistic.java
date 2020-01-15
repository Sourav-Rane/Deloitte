package com.OnlineExam.deloitte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "hr", name = "statistic")
public class Statistic {
	@Column
	private String statCategory;
	@Column
	private String statDateTime;
	@Column
	private String stateName;
	@Column
	private String statEmail;
	@Column
	private int statScore;

}
