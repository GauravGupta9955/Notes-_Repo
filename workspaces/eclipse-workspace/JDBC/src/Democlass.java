import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Democlass{
	public static void main(String[] args) throws Exception {
		String sql = "select * from books";
		String url ="jdbc:mysql://localhost:3306/book_shop";
		String username ="root@localhost";
		String password="Gaurav45";
		
		Connection con =DriverManager.getConnection(url, username, password);
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		rs.next();
		String name =rs.getString(1);
		System.out.println(name);
	}

}
