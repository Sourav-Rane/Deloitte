package advanced_RS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Ad_RS_demo {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			String userName = "system";
			String password = "admin";
			String url = "jdbc:oracle:thin:hr/hr@localhost:1521:XE";
			Properties props = new Properties();
			props.put("user", userName);
			props.put("password", password);
			conn = DriverManager.getConnection(url, props);

			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");
			System.out.println("Before...");
			System.out.println("ID     Name     Degree     Semester");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "      " + rs.getString(2) + "      " + rs.getString(3) + "     "
						+ rs.getInt(4));
			}
			// inserting a new row
			rs.moveToInsertRow();
			rs.updateInt("RegNo", 3);
			rs.updateString("name", "Geeta");
			rs.updateString("degree", "B.E.");
			rs.updateInt("semester", 3);
			rs.insertRow();
			// updating 2nd row � changing name to Seetha
			rs.absolute(2);
			rs.updateString(2, "Seetha");
			rs.updateRow();

			rs.beforeFirst();
			System.out.println("After...");
			System.out.println("ID     Name      Degree     Semester");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "      " + rs.getString(2) + "       " + rs.getString(3) + "     "
						+ rs.getInt(4));
			}
		} catch (SQLException e) {
			System.err.println("Failed to connect to database" + e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}
}
