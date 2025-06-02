package in.ineuron.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


//Using Hikaricp configuration for connection pooling
public class JdbcUtil {
	
	private JdbcUtil() {
		
	}
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public static Connection getJdbcConnection() throws SQLException, IOException {
		HikariConfig config=new HikariConfig("E:\\workspaces\\myWorkspace\\JDBCCRUD1\\src\\main\\java\\in\\ineuron\\properties\\db.properties");
		
	    HikariDataSource dataSource=new HikariDataSource(config);
		Connection connection =dataSource.getConnection();
		return connection;
	    
		
		
	}
	
	public static Connection physicalConnection() throws SQLException, IOException {
		
		FileInputStream fis=new FileInputStream("E:\\workspaces\\myWorkspace\\JDBCCRUD1\\src\\main\\java\\in\\ineuron\\properties\\db.properties");
		Properties properties=new Properties();
		properties.load(fis);
		
		String url=properties.getProperty("jdbcUrl");
		String username=properties.getProperty("dataSource.user");
		String password=properties.getProperty("dataSource.password");
		
		Connection connection=DriverManager.getConnection(url,username,password); 
		
		return connection;
		
		
	}

}
