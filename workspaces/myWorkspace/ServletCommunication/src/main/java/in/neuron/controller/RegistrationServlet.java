package in.neuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet(urlPatterns = {"/reg"}, 
initParams = {
@WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/userdatabase"),
@WebInitParam(name = "user", value = "root"), 
@WebInitParam(name = "password", value = "Gaurav45")})
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn = null;

	public RegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		ServletConfig config = getServletConfig();
		String url = config.getInitParameter("url");
		String user = config.getInitParameter("user");
		String psw = config.getInitParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, psw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String age = request.getParameter("uage");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		int rowCount = 0;
		String dbAge = null;
		String dbName = null;
		String dbmail = null;
		String dbMobile = null;
		int userId = 3;
		int parseAge = 0;

		if (age != null) {
			parseAge = Integer.parseInt(age);
		}

		if (parseAge < 18 || parseAge > 30) {
			response.sendError(504, "user age is not sufficient for this Recruitment");

		}

		else {
			String insertQuery = "insert into userstable(username,userage,email,mobile) values(?,?,?,?)";
			try {
				if (conn != null) {
					pstmt = conn.prepareStatement(insertQuery);
					if (pstmt != null) {
						pstmt.setString(1, name);
						pstmt.setString(2, age);
						pstmt.setString(3, email);
						pstmt.setString(4, mobile);

						rowCount = pstmt.executeUpdate();
						System.out.println("rowUpdate" + rowCount);
					}
				}
			} catch (SQLException sq) {
				sq.printStackTrace();
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			String selectQuery = "select userage,username,email,mobile from userstable where userid=?";
			try {
				if (conn != null) {
					pstmt1 = conn.prepareStatement(selectQuery);
					if (pstmt1 != null) {
						pstmt1.setInt(1, userId);

						rs = pstmt1.executeQuery();

						while (rs.next()) {
							dbAge = rs.getString(1);
							dbName = rs.getString(2);
							dbmail = rs.getString(3);
							dbMobile = rs.getString(4);

						}
					}
				}
			} catch (SQLException sq) {
				sq.printStackTrace();
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			// if age is less than 10 greater than 30 not eligible for recruitment

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><head><title>Output</title></head>");
			out.println("<body bgcolor =\"skyblue\" text=\"red\">");
			out.println("<font color ='red'>");
			out.println("<h2>ineuron Consultancy Services</h2>");
			out.println("<h2>User registration Details</h2>");
			out.println("</font>");
			out.println("<table border =1>");
			out.println("<tr>");
			out.println("<td>Username</td><td>" + dbName + "</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>User age</td><td>" + dbAge + "</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>Email</td><td>" + dbmail + "</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>Mobile</td><td>" + dbMobile + "</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>Registration status</td><td>Registered Successful</td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		}

	}
}
