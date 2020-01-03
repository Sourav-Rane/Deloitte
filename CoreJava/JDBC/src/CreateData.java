import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateData {
	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.makeConnection();
		Statement smt = conn.createStatement();
		String query = "create table hr.salaryJava( salary integer , bonus integer)";
		smt.execute(query);

	}
}
