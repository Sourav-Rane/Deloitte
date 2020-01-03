package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteProd {

	public static void delete() throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection conn = DBConnection.makeConnection();

		System.out.println("enter the prod id to delete : ");
		int id = sc.nextInt();

		PreparedStatement smt = conn.prepareStatement("delete from hr.product where prodid = ?");

		smt.setInt(1, id);

		smt.executeUpdate();

		System.out.println("Product deleted successfully !");
	}

}
