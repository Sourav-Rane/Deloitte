package advanced_RS;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
	public static Connection makeConnection() {

		Connection conn = null;
		try {
			FileReader reader = new FileReader("database.properties");
			Properties prop = new Properties();
			prop.load(reader);

			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");

			Class.forName(driver);
			System.out.println("Driver Loaded");

			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}
}
