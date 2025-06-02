package in.neuron.dynamicinput;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import in.ineuron.jdbcUtil.Connectionjdbc;

public class selectApp {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sid");
		int sid = sc.nextInt();

		String sqlSelctQuery = "select sid,sname,sage,saddr " + "from student where sid =? ";
		try {
			connection = Connectionjdbc.getJdbcConnection();
			if (connection != null) {

				pstmt = connection.prepareStatement(sqlSelctQuery);

				if (pstmt != null) {

					pstmt.setInt(1, sid);

					resultSet = pstmt.executeQuery();
					if (resultSet != null) {
						while (resultSet.next()) {
							Integer id = resultSet.getInt(1);
							String name = resultSet.getString(2);
							Integer age = resultSet.getInt(3);
							String addr = resultSet.getString(4);
							System.out.println(id + "\t" + name + "\t" + age + "\t" + addr);
						}
					}
					else {
						System.out.println("Record not found");
					}

				}
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Connectionjdbc.closeConnection(null, pstmt, connection);

			if (sc != null)
				sc.close();
		}

	}

}
