package com.customTag;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomName extends TagSupport {
	
	private int noOftimes=3;
	private String nameToPrint;
	
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		for(int i=0;i<noOftimes;i++) {
		try {
			out.println(nameToPrint);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		}
		return super.doStartTag();

	}

	public int getNoOftimes() {
		return noOftimes;
	}

	public void setNoOftimes(int noOftimes) {
		this.noOftimes = noOftimes;
	}

	public String getNameToPrint() {
		return nameToPrint;
	}

	public void setNameToPrint(String nameToPrint) {
		this.nameToPrint = nameToPrint;
	}
}

