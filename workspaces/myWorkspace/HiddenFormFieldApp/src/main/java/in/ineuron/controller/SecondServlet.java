package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//collect the data from the request object
		String sid =request.getParameter("sid");
		String sname =request.getParameter("sname");
		String saddr =request.getParameter("saddr");
		String sage =request.getParameter("sage");
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<center>");
		out.println("<table bgcolor='lightGreen' border=1>");
		out.println("<form action ='./test3'>");
		out.println("<tr>");
		out.println("<th>Student Age</th><td><input type ='hidden' name ='sage'value='"+sage+"'/><td>");
		out.println("<tr><th>Student ID</th><input type ='hidden' name ='sid' value='"+sid+"'/><td></tr>");
		out.println("<tr><th>Student Name</th><input type ='hidden' name ='sname' value='"+sname+"'/><td></tr>");
		out.println("<tr><th>Student Address</th><input type ='hidden' name ='saddr' value='"+saddr+"'/><td></tr>");
		out.println("<th>Student Email</th><td><input type ='text' name ='semail' placeholder='Student Email'/><td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input type='submit' value='Next'/><td>");
		out.println("</tr>");
		out.println("</form>");
		out.println("</center>");
		out.close();
		
	}

}
