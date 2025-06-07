package DateOperation;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import in.ineuron.jdbcUtil.Connectionjdbc;

public class SelectQuery {
	public static void main(String[] args) throws SQLException {

		Connection connection=null;
		PreparedStatement pstmt=null;
		ResultSet resultSet=null;
		String name =null;
	    String dob =null;
		
		
		try {	
			String selectQuery="select name,dob from userdata";
			connection=Connectionjdbc.getJdbcConnection();
			if(connection!=null) {
				pstmt =connection.prepareStatement(selectQuery);
				resultSet = pstmt.executeQuery();
				if (resultSet != null) {
					while (resultSet.next()) {
						 name =resultSet.getString(1);
						Date dob1 =resultSet.getDate(2);
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						dob = sdf.format(dob1);
					}
				}
			}
			
			System.out.println("Name \t"+"DOB");
			System.out.println(name +"\t"+dob);
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			Connectionjdbc.closeConnection(null, pstmt, connection);
		}
	}

}
