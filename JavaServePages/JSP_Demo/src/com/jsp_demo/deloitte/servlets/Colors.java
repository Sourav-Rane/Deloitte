package com.jsp_demo.deloitte.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Colors
 */
public class Colors extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Colors() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String selectedItems[] = request.getParameterValues("color");
    	String username = request.getParameter("username");
    	
    	RequestDispatcher rd = request.getRequestDispatcher("Color.jsp");
    	rd.forward(request, response);
    	
    	
    }

}
