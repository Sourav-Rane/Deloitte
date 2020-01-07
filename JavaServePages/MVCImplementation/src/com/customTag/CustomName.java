package com.customTag;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomName extends TagSupport {
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		
		try {
			out.println("Sourav");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return super.doStartTag();
	}
}

