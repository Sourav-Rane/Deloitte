package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    int counter = 0;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		counter++;
		
		String usern = request.getParameter("username");
		String pass = request.getParameter("password");
		
		response.getWriter().println("<h1>Welcome to my website : "+usern+"</h1>");
		response.getWriter().println("<h2>You are visitor number:"+counter+"</h1>");
		response.getWriter().println("<h4><a href='Shop.html'>Shop</a></h4>");
		
		
	}

}
