package com.impl;

public class Body {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Body() {
		super();
	}

	@Override
	public String toString() {
		return "Body [message=" + message + "]";
	}

	public Body(String message) {
		super();
		this.message = message;
	}
	
	
}
