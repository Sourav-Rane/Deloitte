import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateCustomerRecord {

	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.makeConnection();
		Customer customer = new Customer();
		Scanner sc = new Scanner(System.in);

		customer.accept();
//		System.out.println("Enter your id ");
//		int id = sc.nextInt();
//
//		System.out.println("Update the following fields ");
//		System.out.println("Name");
//		String name = sc.next();
//		System.out.println("Address");
//		String addr = sc.next();
//		System.out.println("Bill");
//		int bill = sc.nextInt();

		String query = "update hr.customer set customername =? , customeraddr =? , billamount =? where customerid = ?";

		PreparedStatement smt = conn.prepareStatement(query);

//		smt.setString(1, name);
//		smt.setString(2, addr);
//		smt.setInt(3, bill);
//		smt.setInt(4, id);

		smt.setInt(4, customer.getCustomerid());
		smt.setString(1, customer.getCustomerName());
		smt.setString(2, customer.getCustomerAddress());
		smt.setInt(3, customer.getBillAmount());

		smt.executeUpdate();

		System.out.println(customer.getCustomerName() + " ,your record updated successfully !");
	}
}
