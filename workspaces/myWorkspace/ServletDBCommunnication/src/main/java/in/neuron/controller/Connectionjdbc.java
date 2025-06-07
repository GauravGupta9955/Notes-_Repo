package in.neuron.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectionjdbc {
	private Connectionjdbc() {
	}

	public static Connection getJdbcConnection() throws SQLException {
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/ineuron";
		String id = "root";
		String pass = "Gaurav45";
		try {
			connection = DriverManager.getConnection(url, id, pass);
			if (connection != null)
				return connection;
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection(ResultSet rs, Statement st, Connection con) throws SQLException {
		if (st != null)
			st.close();
		if (con != null)
			con.close();
		if (rs != null)
			rs.close();
	}
}
