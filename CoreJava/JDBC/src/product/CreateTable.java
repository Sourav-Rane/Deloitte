package product;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void create() throws SQLException {
		Connection conn = DBConnection.makeConnection();
		Statement smt = conn.createStatement();
		String query = "create table hr.product( prodid integer, prodname varchar(20) , proprice integer , qty integer)";
		smt.execute(query);

	}

}
