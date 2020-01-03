package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateProduct {

	public static void update() throws SQLException {
		Connection conn = DBConnection.makeConnection();
		Product product = new Product();

		product.accept();

		String query = "update hr.product set prodname =? , proprice =? , qty =? where prodid = ?";

		PreparedStatement smt = conn.prepareStatement(query);

		smt.setInt(4, product.getProdid());
		smt.setString(1, product.getProdname());
		smt.setInt(2, product.getProdprice());
		smt.setInt(3, product.getQty());

		smt.executeUpdate();

		System.out.println(product.getProdid() + " has been updated successfully");
	}

	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.makeConnection();
		Product product = new Product();

		product.accept();

		String query = "update hr.product set prodname =? , proprice =? , qty =? where prodid = ?";

		PreparedStatement smt = conn.prepareStatement(query);

		smt.setInt(4, product.getProdid());
		smt.setString(1, product.getProdname());
		smt.setInt(2, product.getProdprice());
		smt.setInt(3, product.getQty());

		smt.executeUpdate();

		System.out.println(product.getProdid() + " has been updated successfully");

	}
}
