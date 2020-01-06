package com.shopping.deloitte.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AuthenticationServlet
 */
public class AuthenticationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String usertype = request.getParameter("usr_type");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		session.setAttribute("currentBuyer", username);
		
		
		
		response.setContentType("text/html");
		out.println("<h2>Authentication Successfull .. ");
		
		Cookie allCookies[] = request.getCookies();
 		boolean already_visited = false;
 		
 		if(allCookies !=null) {
 		for(Cookie c:allCookies) {
 			if(c.getName().equals(username)) {
 				already_visited= true;
 				break;
 			}
 		}
 		}
 		
 		if(!already_visited) {
 			out.println("you are the first time user "+username);
 			Cookie cookie = new Cookie(username , username);
 			response.addCookie(cookie);
 		}else {
 			out.println("you have already visited "+username);
 			
 		}
 		  
 		
 		out.println("<form action=\"Guest\">");
 		out.println("wife Name : <input type=\"text\" name=\"wifeName\">");
 		out.println("<input type=\"hidden\" name=\"username\" value="+username+">");
 		out.println("<input type=\"submit\" value=\"Enter\">");
 		out.println("</form>");
 		
// 		RequestDispatcher dispatcher=request.getRequestDispatcher("Guest");
//		dispatcher.include(request, response);
	
	

	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
