package product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayProduct {

	public static void display() throws SQLException {
		Connection conn = DBConnection.makeConnection();
		Statement smt = conn.createStatement();
		ResultSet res = smt.executeQuery("select * from hr.product"); // extracts and store result

		while (res.next()) {
			System.out.print(res.getString(1) + " ");
			System.out.print(res.getString(2) + " ");
			System.out.print(res.getString(3) + " ");
			System.out.print(res.getString(4) + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.makeConnection();
		Statement smt = conn.createStatement();
		ResultSet res = smt.executeQuery("select * from hr.product"); // extracts and store result

		while (res.next()) {
			System.out.print(res.getString(1) + " ");
			System.out.print(res.getString(2) + " ");
			System.out.print(res.getString(3) + " ");
			System.out.print(res.getString(4) + " ");
			System.out.println();
		}
	}
}
