package com.cms.deloitte.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dbcon.DBConnection;
import com.cms.deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	int result = 0;
	private static final String INSERT_CUSTOMER_QUERY = "insert into hr.customer values (?,?,?,?)";

	@Override
	public boolean addCustomer(Customer customer) {

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

		return false;
	}

	@Override
	public boolean deleteCustomer(int customer) {

		return false;
	}

	@Override
	public List<Customer> listCustomer() {

		return null;
	}

	@Override
	public Customer findCustomer(int customerId) {

		return null;
	}

	@Override
	public boolean isCustomerExists(int customerId) {

		return false;
	}

}
