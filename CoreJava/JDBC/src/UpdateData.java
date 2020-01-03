import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.makeConnection();
		Statement smt = conn.createStatement();

		String query = "insert into hr.customer values (1919,'Sourav','MH',12333)";
		int rowsAffected = smt.executeUpdate(query);
		System.out.println("Success : " + rowsAffected + " row/rows affected");

	}
}
