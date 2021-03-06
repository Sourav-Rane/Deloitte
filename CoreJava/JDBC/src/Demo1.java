import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.Load appropriate driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded....");

		// 2.Obtain the database connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:hr/hr@localhost:1521:XE", "system", "admin");
		System.out.println("Connected....");

		// 3.
		Statement smt = con.createStatement();

		ResultSet res = smt.executeQuery("select * from hr.customer"); // extracts and store result

		ResultSetMetaData rsmd = res.getMetaData();

		int cl = rsmd.getColumnCount();

		for (int i = 1; i <= cl; i++) {
			System.out.print(rsmd.getColumnLabel(i) + " ");
		}
		System.out.println();

		while (res.next()) {
			for (int i = 1; i <= cl; i++) {
				System.out.print(res.getString(i) + " ");
			}
			System.out.println();
		}
		con.close();
		smt.close();
	}

}
