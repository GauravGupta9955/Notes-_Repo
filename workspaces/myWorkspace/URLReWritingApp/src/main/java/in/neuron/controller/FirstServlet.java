package in.neuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/test1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accNO=request.getParameter("accNo");
		String accName=request.getParameter("accName");
		
		HttpSession session =request.getSession();
		session.setAttribute("accNO", accNO);
		session.setAttribute("accName", accName);
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<center>");
		out.println("<table border =1>");
		out.println("<form method ='get' action='"+response.encodeURL("./test2")+"'>");
		out.println("<tr><th>AccountType</th><td><input type ='text' name ='accType'/></td></tr>");
		out.println("<tr><th>AccountBranch</th><td><input type ='text' name ='accBranch'/></td></tr>");
		out.println("<tr><td><input type='submit' value='Next' /></td></tr>");
		
		out.println("</table>");
		out.println("</center>");
		out.close();
		
	}

}
