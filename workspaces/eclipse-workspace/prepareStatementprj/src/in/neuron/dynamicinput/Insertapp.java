package in.neuron.dynamicinput;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.JdbcConnection;

import in.ineuron.jdbcUtil.Connectionjdbc;

public class Insertapp {
	public static void main(String[] args) throws SQLException {

		Connection connection=null;
		PreparedStatement pstmt=null;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the age");
		int sage =sc.nextInt();
		
		System.out.println("Enter the sname");
		String sname =sc.next();
		
		System.out.println("enter the saddress");
		String saddr =sc.next();
		
		String sqlInsertQuery="Insert into student(sname,sage,saddr)"
				+ "values(?,?,?)";
		try {
			connection=Connectionjdbc.getJdbcConnection();
			if(connection!=null) {
				
				pstmt=connection.prepareStatement(sqlInsertQuery);
				
				if(pstmt!=null) {
					pstmt.setString(1 ,sname);
					pstmt.setInt(2, sage);
					pstmt.setString(3, saddr);
					
					int rowaffected=pstmt.executeUpdate();
					System.out.println("No.of row affected "+rowaffected);
				}
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			Connectionjdbc.closeConnection(null, pstmt, connection);
			
			if(sc!=null)
				sc.close();
		}

	
	}

}
