package in.neuron.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.ineuron.jdbcUtil.Connectionjdbc;

public class clobInsert {
	public static void main(String[] args) throws SQLException {
		
	
	Connection connection = null;
	PreparedStatement pstmt = null;

	try {
		connection = Connectionjdbc.getJdbcConnection();
		String sqlInsertQuery = "Insert into cities(name,history)" + "values(?,?);";
		if (connection != null) {

			pstmt = connection.prepareStatement(sqlInsertQuery);
			if (pstmt != null) {
				pstmt.setString(1, "Bengaluru");
				// Image file is reaching to java application
				File f = new File(
						"C:\\Users\\gauta\\eclipse-workspace\\BlobClobjdbc\\src\\in\\neuron\\main\\Bengaluru.txt");
				FileReader reader = new FileReader(f);
				// setting the input information and sending the data to database
				pstmt.setCharacterStream(2, reader);

				System.out.println("Insert image from :: " + f.getAbsolutePath());

				int noofRows = pstmt.executeUpdate();
				if (noofRows >= 1)
					System.out.println("Record Inserted successfully");
				else
					System.out.println("Record not inserted");
			}
		}
	} catch (SQLException se) {
		se.printStackTrace();
	} catch (FileNotFoundException fe) {
		fe.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		Connectionjdbc.closeConnection(null, pstmt, connection);
	}
	}
}
