package in.neuron.main;

import java.sql.Connection;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.CallableStatement;

import in.ineuron.jdbcUtil.Connectionjdbc;

public class RetrievingStu {
	public static void main(String[] args) {
		 Connection connection = null;
	        java.sql.CallableStatement cstmt = null;
	        ResultSet resultSet = null;

	        try {
	            // Establish connection
	            connection = Connectionjdbc.getJdbcConnection();

	            // Prepare the stored procedure call
	            String storedProcedure = "{call getStudents(?)}";
	            if (connection != null) {
	                cstmt = connection.prepareCall(storedProcedure);

	                // Set input parameter for the stored procedure
	                Integer id = 1;
	                cstmt.setInt(1, id);

	                // Execute the stored procedure
	                boolean hasResultSet = cstmt.execute();

	                // Process the result set
	                if (hasResultSet) {
	                    resultSet = cstmt.getResultSet();
	                    if (resultSet != null) {
	                        boolean recordFound = false;
	                        while (resultSet.next()) {
	                            recordFound = true;
	                            System.out.println(
	                                resultSet.getInt(1) + "\t" +
	                                resultSet.getString(2) + "\t" +
	                                resultSet.getString(3)
	                            );
	                        }
	                        if (!recordFound) {
	                            System.out.println("No records found for the id: " + id);
	                        }
	                    }
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                Connectionjdbc.closeConnection(resultSet, cstmt, connection);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
		
	}

}
