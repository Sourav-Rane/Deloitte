package com;

public class ContactDetails {
	private String mobileNumber;
	private String email;
	@Override
	public String toString() {
		return "ContactDetails [mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public ContactDetails(String mobileNumber, String email) {
		super();
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	public ContactDetails() {
		super();
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
