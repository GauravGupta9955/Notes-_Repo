package in.neuron.main;

import java.io.File;
import java.io.*;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.io.IOUtils;

import in.ineuron.jdbcUtil.Connectionjdbc;

public class clobSelect {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet =null;
		String name ="Bengaluru";

		try {
			connection = Connectionjdbc.getJdbcConnection();
		
			String sqlInsertQuery = "select name,history from cities where name =?";
			pstmt = connection.prepareStatement(sqlInsertQuery);
				
				if (connection != null && pstmt != null) {
					pstmt.setString(1, name);
					resultSet = pstmt.executeQuery();
					
					while (resultSet.next()) {
						String userName =resultSet.getString(1);
						
						//fetching the image and keeping it in harddisk
					  Reader rs =resultSet.getCharacterStream(2);
					  String fileName ="Bengaluru.txt";
					  File file =new File(fileName);
					  FileWriter writer =new FileWriter(file);
					  
					  IOUtils.copy(rs,writer);

					  writer.flush();
					    
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
