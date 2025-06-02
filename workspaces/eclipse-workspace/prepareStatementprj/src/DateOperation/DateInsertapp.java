package DateOperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import in.ineuron.jdbcUtil.Connectionjdbc;

public class DateInsertapp {
public static void main(String[] args) throws SQLException, ParseException {
	Connection connection=null;
	PreparedStatement pstmt=null;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name::");
	String name =sc.next();
	
	System.out.println("Enter the data Of Birth::(dd-mm-yyyy)");
	String sDOB =sc.next();
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
	java.util.Date uDate =sdf.parse(sDOB);
	
	long time =uDate.getTime();
	java.sql.Date sqlDate = new java.sql.Date(time);
	
	System.out.println("String dob id :: "+sDOB);
	System.out.println("Util date is  :: "+uDate);
	System.out.println("SQL data is   :: "+sqlDate);
	
	
	
	try {
		connection =Connectionjdbc.getJdbcConnection();
		String sqlInsertQuery="insert into userdata(name,dob) values(?,?)";
		if(connection!=null) {
			
		    pstmt=connection.prepareStatement(sqlInsertQuery);
		    if(pstmt!=null) {
		    	pstmt.setString(1, name);
		    	pstmt.setDate(2, sqlDate);
		    	
		    	int rowaffected=pstmt.executeUpdate();
				System.out.println("No.of row affected "+rowaffected);
		    }
			
			
		}
	}catch(SQLException se) {
		se.printStackTrace();
	}
	finally{
		try {
		Connectionjdbc.closeConnection(null, pstmt, connection);
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
}
}
