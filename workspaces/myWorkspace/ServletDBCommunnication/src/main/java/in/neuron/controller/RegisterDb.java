package in.neuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterDb
 */
@WebServlet(urlPatterns = { "/reg" }, initParams = {
		@WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/ineuron"),
		@WebInitParam(name = "user", value = "root"), @WebInitParam(name = "password", value = "Gaurav45") })
public class RegisterDb extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("RegisterServlet class is loading...");
	}

	public RegisterDb() {
		System.out.println("Register Servlet class is instantiated...");
	}

	private Connection conn = null;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		ServletConfig config = getServletConfig();
		String url = config.getInitParameter("url");
		String password = config.getInitParameter("password");
		String user = config.getInitParameter("user");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String Country = request.getParameter("country");
		int rowcount = 0;

		PreparedStatement pstmt = null;

		String insertQuery = "INSERT INTO people (username, email, city, country) VALUES (?, ?, ?, ?);";

		try {
			if (conn != null) {
				pstmt = conn.prepareStatement(insertQuery);
				if (pstmt != null) {
					pstmt.setString(1, username);
					pstmt.setString(2, email);
					pstmt.setString(3, city);
					pstmt.setString(4, Country);

					rowcount = pstmt.executeUpdate();

				}
			}

		} catch (SQLException sql) {
			sql.printStackTrace();
		} catch (Exception Ex) {
			Ex.printStackTrace();
		}

		String username1 = null;
		String email1 = null;
		String city1 = null;
		String country1 = null;
		ResultSet rs = null;

		PreparedStatement pstmt1 = null;
		int peopleId = 1;

		String selectQuery = "select username,email,city,country from people where peopleid=?;";

		try {
			if (conn != null) {
				pstmt1 = conn.prepareStatement(selectQuery);
				if (pstmt1 != null) {
					pstmt1.setInt(1, peopleId);

					rs = pstmt1.executeQuery();
					if (rs != null) {
						while (rs.next()) {
							username1 = rs.getString(1);
							email1 = rs.getString(2);
							city1 = rs.getString(3);
							country1 = rs.getString(4);
						}
					}
				}
			}

		} catch (SQLException sql) {
			sql.printStackTrace();
		} catch (Exception Ex) {
			Ex.printStackTrace();
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><head><title>Output</title></head>");
		out.println("<body bgcolor =\"skyblue\" text=\"red\">");
		out.println("<table align ='center'>");
		out.println("<tr>");
		out.println("<td>Username</td><td>" + username1 + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Email</td><td>" + email1 + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>City</td><td>" + city1 + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Country</td><td>" + country1 + "</td>");
		out.println("</tr>");

		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

	}
}
