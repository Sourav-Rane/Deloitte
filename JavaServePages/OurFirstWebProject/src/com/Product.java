package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

    int counter = 0;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		counter++;
		response.getWriter().println("<h1>Welcome to my Product site</h1>");
		response.getWriter().println("<h2>You are visitor number:"+counter+"</h1>");
		response.getWriter().println("<h4><a href='Welcome'>Welcome</a></h4>");
		
		
	}


}
