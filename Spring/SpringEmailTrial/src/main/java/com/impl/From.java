package com.impl;

public class From {

	public From(String fromName, String fromEmail) {
		super();
		this.fromName = fromName;
		this.fromEmail = fromEmail;
	}
	private String fromName;
	private String fromEmail;
	
	public From() {
		super();
	}
	public String getFromEmail() {
		return fromEmail;
	}
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
	public String getFromName() {
		return fromName;
	}
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	@Override
	public String toString() {
		return "From [fromName=" + fromName + ", fromEmail=" + fromEmail + "]";
	}
	
	
}
