package com.customTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class AddressTag extends TagSupport{
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		
		try {
			out.println("Block \"C\" Divyasree Technopolis");
			out.println("Survey No: 123 &132/2, Yemlur Post");
			out.println("Off Old Airport Road Karnataka 560037.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return super.doStartTag();
	}
}
