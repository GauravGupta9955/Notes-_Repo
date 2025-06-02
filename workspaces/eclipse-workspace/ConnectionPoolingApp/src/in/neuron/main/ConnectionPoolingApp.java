package in.neuron.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

public class ConnectionPoolingApp {
public static void main(String[] args) throws SQLException {
	//creating a Pooled Connection Object
	MysqlConnectionPoolDataSource dataSource = new MysqlConnectionPoolDataSource();
	
	dataSource.setUrl("jdbc:mysql://localhost:3306/ineuron");
	dataSource.setUser("root");
	dataSource.setPassword("Gaurav45");
	
	//logical connection bought from Connection Pool
	Connection connection=dataSource.getConnection();
	
	Statement statement =connection.createStatement();
	
	if(connection !=null && statement!=null) {
	ResultSet resultSet =statement.executeQuery("select sid,sname,saddr from student");
	
	System.out.println("SID\tSNAME\tsaddress");
	while(resultSet.next()) {
		int sid =resultSet.getInt(1);
		String name =resultSet.getString(2);
		String saddress =resultSet.getString(3);
		
		System.out.println(sid+"\t"+name+"\t"+saddress);
	}
	
	}
	connection.close();
	
}
}
