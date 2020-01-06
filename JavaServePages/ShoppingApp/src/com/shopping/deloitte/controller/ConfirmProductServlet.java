package com.shopping.deloitte.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ConfirmProductServlet
 */
public class ConfirmProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		// TODO Auto-generated method stub
  		String selectedItems[] = request.getParameterValues("item");
  		response.setContentType("text/html");
  		PrintWriter out = response.getWriter();
  		
  		HttpSession session = request.getSession();
  		String str = (String) session.getAttribute("currentBuyer");
  		
  		
  		if(selectedItems == null) {
  			out.println("<h4>"+str+" Dont be smart ..! Select atleast one product");
  			out.println("<h5><a href='Item.html'>Go back</a>");
  		}
  		else {
  			out.println(str+" You selected following items");
  			for(String product : selectedItems)
  				out.println("<h5>"+product+"</h5>");
  		}
  	}

}
