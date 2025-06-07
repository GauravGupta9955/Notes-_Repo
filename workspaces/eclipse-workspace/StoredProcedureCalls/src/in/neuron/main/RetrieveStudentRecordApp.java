package in.neuron.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.CallableStatement;

import in.ineuron.jdbcUtil.Connectionjdbc;

public class RetrieveStudentRecordApp {
public static void main(String[] args) {
	Connection connection =null;
	java.sql.CallableStatement cstmt =null;
	ResultSet resultSet =null;
	
	try {
		connection =Connectionjdbc.getJdbcConnection();
		String storedProcedure ="{call getStudents(?)}";
		if(connection!=null)
		//fetching the procedure
		cstmt=connection.prepareCall(storedProcedure);
		if(cstmt!=null) {
			//before calling set the input value to StoredProcedure
			Integer id =1;
			cstmt.setInt(1, id);
			//execute the stored Procedure
			cstmt.execute();
			resultSet =cstmt.getResultSet();
			
			if(resultSet!=null) {
				if(resultSet.next()) {
					System.out.println(resultSet.getInt(1) +"\t"+resultSet.getString(2) +"\t" + resultSet.getString(3));
				
				}
				else {
					System.out.println("Record not found for the id ::" +id);
				}
			}
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			Connectionjdbc.closeConnection(resultSet, cstmt, connection);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
}
