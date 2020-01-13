package com.impl;

public class Subject {
	
	private String caption;

	@Override
	public String toString() {
		return "Subject [caption=" + caption + "]";
	}

	public Subject() {
		super();
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Subject(String caption) {
		super();
		this.caption = caption;
	}
	
	
}
