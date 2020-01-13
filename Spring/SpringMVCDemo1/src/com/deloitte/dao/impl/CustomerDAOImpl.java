package com.deloitte.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.dao.CustomerDAO;
import com.deloitte.dbcon.DBConnection;
import com.deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	private static final String INSERT_CUSTOMER_QUERY = "insert into hr.customer values (?,?,?,?)";
	private static final String UPDATE_CUSTOMER_QUERY = "update hr.customer set customername = ?, customeraddr = ?, billamount = ? where customerid = ? ";
	private static final String DELETE_CUSTOMER_QUERY = "delete from hr.customer where customerid = ?";
	private static final String FETCH_CUSTOMER_QUERY = "select * from hr.customer";
	private static final String FETCH_SINGLE_CUSTOMER_QUERY = "select * from hr.customer where customerid = ?";

	@Override
	public boolean addCustomer(Customer customer) {

		int result = 0;
		Connection connection = DBConnection.makeConnection();
		try {
			PreparedStatement smt = connection.prepareStatement(INSERT_CUSTOMER_QUERY);

			smt.setInt(1, customer.getCustomerId());
			smt.setString(2, customer.getCustomerName());
			smt.setString(3, customer.getCustomerAddress());
			smt.setInt(4, customer.getBillAmount());

			result = smt.executeUpdate();

			return result == 0 ? false : true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {

		int result = 0;
		Connection connection = DBConnection.makeConnection();
		try {
			PreparedStatement smt = connection.prepareStatement(UPDATE_CUSTOMER_QUERY);

			smt.setString(1, customer.getCustomerName());
			smt.setString(2, customer.getCustomerAddress());
			smt.setInt(3, customer.getBillAmount());
			smt.setInt(4, customer.getCustomerId());

			result = smt.executeUpdate();

			return result == 0 ? false : true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {

		int result = 0;
		Connection connection = DBConnection.makeConnection();
		try {
			PreparedStatement smt = connection.prepareStatement(DELETE_CUSTOMER_QUERY);
			smt.setInt(1, customerId);
			result = smt.executeUpdate();

			return result == 0 ? false : true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Customer findCustomer(int customerId) {
		Customer customer = new Customer();

		Connection connection;
		try {
			connection = DBConnection.makeConnection();
			PreparedStatement statement = connection.prepareStatement(FETCH_SINGLE_CUSTOMER_QUERY);

			statement.setInt(1, customerId);
			ResultSet res = statement.executeQuery();

			res.next();
			customer.setCustomerId(res.getInt(1));
			customer.setCustomerName(res.getString(2));
			customer.setCustomerAddress(res.getString(3));
			customer.setBillAmount(res.getInt(4));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;

	}

	@Override
	public boolean isCustomerExists(int customerId) {

		boolean result = false;
		Connection connection;
		try {
			connection = DBConnection.makeConnection();
			PreparedStatement statement = connection.prepareStatement(FETCH_SINGLE_CUSTOMER_QUERY);

			statement.setInt(1, customerId);
			ResultSet res = statement.executeQuery();

			result = res.next();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result ? true : false;

	}

	@Override
	public List<Customer> listCustomer() {

		boolean result = false;
		Connection connection;
		List<Customer> allCustomers = new ArrayList<Customer>();

		try {
			connection = DBConnection.makeConnection();
			PreparedStatement statement = connection.prepareStatement(FETCH_CUSTOMER_QUERY);

			ResultSet res = statement.executeQuery();

			while (res.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(res.getInt(1));
				customer.setCustomerName(res.getString(2));
				customer.setCustomerAddress(res.getString(3));
				customer.setBillAmount(res.getInt(4));
				allCustomers.add(customer);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return allCustomers;

	}

}
