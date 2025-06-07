import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/ineuron";
		String id ="root";
		String pass="Gaurav45";
		Connection connection=DriverManager.getConnection(url,id,pass);
		try {
			if(connection!=null) {
				Statement statement =connection.createStatement();
				if(statement!=null) {
					String querry =
							"update Student set sage =38 where sid=1";
					if(statement!=null) {
					int resultSet=statement.executeUpdate(querry);
					/*
					 * while (resultSet.next()) { Integer id1 = resultSet.getInt(1); String name =
					 * resultSet.getString(2); Integer age = resultSet.getInt(3); String team =
					 * resultSet.getString(4); System.out.println(id1 + "\t" + name + "\t" + age +
					 * "\t" + team); } resultSet.close();
					 */
					System.out.println(resultSet);
					}
				}
			}
			
			
		}
		catch(SQLException sq) {
			sq.printStackTrace();
		}
	}

}
