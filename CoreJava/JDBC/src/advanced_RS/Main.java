package advanced_RS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException {
		Customer customer = new Customer();
		customer.accept();

		Connection conn = DBConnection.makeConnection();
		PreparedStatement smt = conn.prepareStatement("insert into hr.customer values(?,?,?,?)");

		smt.setInt(1, customer.getCustomerid());
		smt.setString(2, customer.getCustomerName());
		smt.setString(3, customer.getCustomerAddress());
		smt.setInt(4, customer.getBillAmount());

		smt.executeUpdate();

		System.out.println(customer.getCustomerName() + " ,your record saved successfully !");
	}
}
