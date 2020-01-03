package advanced_RS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateCustomerRecord {

	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.makeConnection();
		Statement smt = conn.createStatement();

		String query = "select hr.customer.* from hr.customer";

		ResultSet res = smt.executeQuery(query);

		res.absolute(3);
		res.previous();

		System.out.println(res.getInt(1) + " ");
		System.out.println(res.getString(2) + " ");
		System.out.println(res.getString(3) + " ");
		System.out.println(res.getInt(4) + " ");

		res.moveToInsertRow();
		res.updateInt("customerid", 3);
		res.updateString("customerName", "Geeta");
		res.updateString("customerAddr", "Pune");
		res.updateInt("bill", 3);

	}
}
