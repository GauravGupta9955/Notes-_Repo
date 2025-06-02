package in.neuron.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;

import in.ineuron.jdbcUtil.Connectionjdbc;

public class RetreiveStrudentRecordusingColumnNames {
public static void main(String[] args) {
	Connection connection =null;
	java.sql.CallableStatement cstmt =null;
	ResultSet resultSet =null;
	
	try {
		connection =Connectionjdbc.getJdbcConnection();
		String storedProcedure ="{call getStudentsById(?,?,?)}";
		if(connection!=null)
		//fetching the procedure
		cstmt=connection.prepareCall(storedProcedure);
		if(cstmt!=null) {
			//before calling set the input value to StoredProcedure
			Integer id =1;
			cstmt.setInt(1, id);
			
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.VARCHAR);
			cstmt.execute();
			
			System.out.println("Name of the Student is ::"+cstmt.getString(2));
			System.out.println("address of the Student is ::"+cstmt.getString(3));
			
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
