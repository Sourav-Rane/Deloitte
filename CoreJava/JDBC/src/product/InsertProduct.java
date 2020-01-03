package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertProduct {

	public static void insert() throws SQLException {
		Product product = new Product();
		product.accept();

		Connection conn = DBConnection.makeConnection();
		PreparedStatement smt = conn.prepareStatement("insert into hr.product values(?,?,?,?)");

		smt.setInt(1, product.getProdid());
		smt.setString(2, product.getProdname());
		smt.setInt(3, product.getProdprice());
		smt.setInt(4, product.getQty());

		smt.executeUpdate();

		System.out.println(product.getProdname() + " has been inserted successfully !");
	}

}
