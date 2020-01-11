package com.pms.deloitte.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.dao.impl.ProductDAOImpl;
import com.pms.deloitte.model.Product;

/**
 * Servlet implementation class StoreProduct
 */
public class StoreProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StoreProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int productId = Integer.parseInt(request.getParameter("pid"));
		String productName = request.getParameter("productname");
		int price = Integer.parseInt(request.getParameter("price"));
		int qty = Integer.parseInt(request.getParameter("qty"));

		ProductDAO productDAO = new ProductDAOImpl();
		Product product = new Product(productId, productName, price, qty);
		
		HttpSession session = request.getSession();
		boolean result = productDAO.addProduct(product);
		
		session.setAttribute("result", result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Confirm_NotConfirm.jsp");
		dispatcher.forward(request, response);

	}

}
