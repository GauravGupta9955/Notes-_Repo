package in.back.project;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import in.gupta.JdbcUtility.ConnectionJdbc;

public class TransactionImplementaion {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs,rs1;
	String name;
	int balance;
	String sqlInsertQuery;
	
	public  void insert() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		name = sc.next();
		System.out.println("enter the balance");
		balance = sc.nextInt();
		sqlInsertQuery = "insert into accounts(name,balance) values(?,?)";
		
		try {
			conn = ConnectionJdbc.getjdbcConnection();
			if (conn != null) {
				conn.setAutoCommit(false);
                ps =conn.prepareStatement(sqlInsertQuery);
                ps.setString(1, name);
                ps.setInt(2, balance);
                
                int rowCount =ps.executeUpdate();
                System.out.println("Row updated"+ rowCount);
                
                System.out.println("Do you really want to commit yes/no");
    			String option =sc.next();
    			if(option.equalsIgnoreCase("yes")){
    				conn.commit();
    		   }
    			else
    			{
    				conn.rollback();
    				System.out.println("transaction roll back");
    			}
    			
    			

			}
		} catch (IOException j) {
			j.printStackTrace();
		} catch (Exception k) {
			k.printStackTrace();

		} finally {
			try {
				ConnectionJdbc.closeConnection(rs, conn, ps);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}


	public void select() {
		// TODO Auto-generated method stub
		
	}
	
		

}
