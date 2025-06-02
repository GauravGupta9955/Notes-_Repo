package in.gupta.JdbcUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.sql.Statement;
import java.util.Properties;



public class ConnectionJdbc {
	private ConnectionJdbc() {
		
	}
public static Connection getjdbcConnection() throws IOException {
	Connection conn =null;
	Properties props =new Properties();
	
	 try (FileInputStream fis = new FileInputStream("F:\\myWorkspace\\BankingApp\\src\\in\\gupta\\JdbcUtility\\jdbc.property")) {
         props.load(fis);
     } catch (IOException e) {
         throw new IOException("Error loading JDBC properties file.", e);
     }
	 
	 String url =props.getProperty("url");
	 String id =props.getProperty("id");
	 String password =props.getProperty("password");
	
	try {
		conn= DriverManager.getConnection(url,id,password);
		if(conn!=null);
			return conn;
		
	}
	catch(SQLException se) {
		se.printStackTrace();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	return conn;
	
}

public static void closeConnection(ResultSet rs,Connection con,Statement st) throws SQLException {
	if(st!=null)
		st.close();
	if(rs!=null)
	   rs.close();
	if(con!=null)
		con.close();
	
}
}
