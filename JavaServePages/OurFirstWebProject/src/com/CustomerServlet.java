package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

/**
 * Servlet implementation class CustomerServlet
 */
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
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
			response.getWriter().println(customerid+" alraedy exists");
		else {
			customerDAO.addCustomer(customer);
			
			response.getWriter().println("<html><body>");
			response.getWriter().println(customername+" saved succesfully !");
			response.getWriter().println("<h4>Customerid  : "+customerid+"</h4>");
			response.getWriter().println("<h4>customername  : "+customername+"</h4>");
			response.getWriter().println("<h4>customeraddr  : "+customeraddr+"</h4>");
			response.getWriter().println("<h4>customerbill   : "+customerbill+"</h4>");
			response.getWriter().println("</body></html>");
		}
		
		
		
	}

}
