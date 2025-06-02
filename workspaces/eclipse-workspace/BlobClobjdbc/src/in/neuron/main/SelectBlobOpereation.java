package in.neuron.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.io.IOUtils;

import in.ineuron.jdbcUtil.Connectionjdbc;

public class SelectBlobOpereation {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet =null;
		String name ="gautam";

		try {
			connection = Connectionjdbc.getJdbcConnection();
		
			String sqlInsertQuery = "select name,image from person where name =?";
			pstmt = connection.prepareStatement(sqlInsertQuery);
				
				if (connection != null && pstmt != null) {
					pstmt.setString(1, name);
					resultSet = pstmt.executeQuery();
					
					while (resultSet.next()) {
						String userName =resultSet.getString(1);
						
						//fetching the image and keeping it in harddisk
					  InputStream is =resultSet.getBinaryStream(2);
					  String fileName ="gautam.jpg";
					  File file =new File(fileName);
					  FileOutputStream fos =new FileOutputStream(file);
					  
					  IOUtils.copy(is,fos);

					  fos.flush();
					    
                        System.out.println(userName);
                        System.out.println("File is save to the location::" +file.getAbsolutePath());

					}
					

					
				}
		} catch (SQLException se) {
			se.printStackTrace();
		}  catch (Exception e) {
			e.printStackTrace();
		} finally {
			Connectionjdbc.closeConnection(null, pstmt, connection);
		}

	}

}

