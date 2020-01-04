import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTableDemo {
	public static void main(String[] args) {
		Customer customer = new Customer();

		int rowsAffected = 0;

		Connection conn = DBConnection.makeConnection();

		String Q1 = "insert into hr.customer values (12,'bhibu','pune',343)";
		String Q2 = "insert into hr.customer values ('bhibuwife','pune',343)";

		try {
			Statement smt = conn.createStatement();
			rowsAffected = smt.executeUpdate(Q1);

		} catch (SQLException e) {
			// TODO Auto-generated catch block

		}

		System.out.println(customer.getCustomerName() + " ,your record saved successfully !");
	}
}
