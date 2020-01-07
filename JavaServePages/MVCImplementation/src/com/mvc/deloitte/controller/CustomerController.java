package com.mvc.deloitte.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.deloitte.model.Customer;

/**
 * Servlet implementation class CustomerController
 */
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customerId = Integer.parseInt(request.getParameter("cid"));
		String customerName = request.getParameter("username");
		String customerAddr = request.getParameter("caddr");
		int bill = Integer.parseInt(request.getParameter("bill"));
		
		Customer customer = new Customer(customerId, customerName, customerAddr, bill);
		HttpSession session = request.getSession();
		session.setAttribute("custDetails", customer);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);
		
		
		
	}

}
