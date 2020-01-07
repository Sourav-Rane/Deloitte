package com.cms.deloitte.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

/**
 * Servlet implementation class StoreCustomerRecord
 */
@WebServlet("/StoreCustomerRecord")
public class StoreCustomerRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StoreCustomerRecord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int customerid = Integer.parseInt(request.getParameter("cid"));
		String customername = request.getParameter("username");
		String customeraddr = request.getParameter("caddr");
		int customerbill = Integer.parseInt(request.getParameter("bill")); 
		
		
		Customer customer = new Customer(customerid , customername , customeraddr , customerbill);
		
		CustomerDAO customerDAO = new CustomerDAOImpl();
		
		if(customerDAO.isCustomerExists(customerid))
			{
			response.getWriter().println("<html><body align = \"center\">");
			response.getWriter().println("<h4>Customer Already Exists !</h4>");
			response.getWriter().println(" <a href=\"AddCustomer.html\">Try again?</a>");
			response.getWriter().println("</body></html>");

			}
		else {
			customerDAO.addCustomer(customer);
			
			response.getWriter().println("<html><body align = \"center\">");
			response.getWriter().println("<h4>Customer Saved succesfully !</h4>");
			response.getWriter().println("<ul style=\"list-style-type: none\">");
			response.getWriter().println("<li>ID:"+customerid+"</li>");
			response.getWriter().println("<li>NAME:"+customername+"</li>");
			response.getWriter().println("<li>ADDRESS:"+customeraddr+"</li>");
			response.getWriter().println("<li>SALARY:"+customerbill+"</li>");
			response.getWriter().println("<a href=\"Home.html\">Back to Home</a>");
			response.getWriter().println("</body></html>");
			
		
		}
	}

}
