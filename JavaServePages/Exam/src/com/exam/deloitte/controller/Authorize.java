package com.exam.deloitte.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Authorize
 */
public class Authorize extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authorize() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		
		HttpSession session = request.getSession();
		session.setAttribute("candidate", username);
		
		String correctAns[] = {"A","B","C"};
		session.setAttribute("correctAnswer", correctAns);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Welcome.jsp");
		dispatcher.forward(request, response);
	}

}
