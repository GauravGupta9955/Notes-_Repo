package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/test3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		//create the session object and store the request data in 
		//session object
		HttpSession session=request.getSession();
		session.setAttribute("email", email);
		session.setAttribute("mobile", mobile);
		
		String name=session.getAttribute("name").toString();
		String age=session.getAttribute("age").toString();
		String qual=session.getAttribute("qualification").toString();
		String design=session.getAttribute("designation").toString();
		String mail=session.getAttribute("email").toString();
		String mob=session.getAttribute("mobile").toString();
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Response page</title>");
		out.println("</head>");
		out.println("<body bgcolor='skyblue'>");
		out.println("<center>");
		out.println("<table border='1'>");
		out.println("<form>");
		out.println("<tr>");
		out.println("<th>Name</th><td>"+name+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>AGE</th><td>"+age+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>QUAL</th><td>"+qual+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>DESIGN</th><td>"+design+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Email</th><td>"+mail+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>MOBILE</th><td>"+mob+"<td>");
		out.println("</tr>");
		out.println("</form>");
		out.println("</table>");
		
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
	}

}
