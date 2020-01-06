package com.shopping.deloitte.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Admin
 */
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		// TODO Auto-generated method stub
 		String username = request.getParameter("username");
 		response.setContentType("text/html");
 		PrintWriter out = response.getWriter();
 		out.println("<h1>Welcome "+username);
 		out.println("<h1>You are the Administrator");
 		out.println("<h3><a href ='Item.html'>Select Products </a> ");
 	}
 	

}
