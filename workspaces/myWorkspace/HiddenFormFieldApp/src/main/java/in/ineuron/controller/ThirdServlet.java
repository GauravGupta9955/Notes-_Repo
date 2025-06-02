package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/test3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//collect the data from the request object
		String sid =request.getParameter("sid");
		String sname =request.getParameter("sname");
		String saddr =request.getParameter("saddr");
		String sage =request.getParameter("sage");
		String semail =request.getParameter("semail");
		
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<center>");
		out.println("<table bgcolor='lightGreen' border=1>");
		out.println("<form>");
		out.println("<tr>");
		out.println("<th>Student Name</th><td>"+sname+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Student id</th><td>"+sid+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Student address</th><td>"+saddr+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Student Age</th><td>"+sage+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Student Email</th><td>"+semail+"<td>");
		out.println("</tr>");
		out.println("</form>");
		out.println("</center>");
		out.close();
		
	}

}
