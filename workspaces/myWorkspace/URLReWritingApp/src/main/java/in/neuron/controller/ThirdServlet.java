package in.neuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/test3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String depName=request.getParameter("depName");
		String depAmount=request.getParameter("depAmount");
		
       //get the data from session object
		
		HttpSession session =request.getSession();
		
		Object accNo=session.getAttribute("accNO");
		Object accName=session.getAttribute("accName");
		Object accType=session.getAttribute("accType");
		Object accBranch=session.getAttribute("accBranch");
		
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<center>");
		out.println("<table bgcolor='lightGreen' border=1>");
		out.println("<form>");
		out.println("<tr>");
		out.println("<th>Department Name</th><td>"+depName+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Department Amount</th><td>"+depAmount+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Account Number</th><td>"+accNo+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Account Name</th><td>"+accName+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Account Type</th><td>"+accType+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Account Branch</th><td>"+accBranch+"<td>");
		out.println("</tr>");
		out.println("</form>");
		out.println("</center>");
		out.close();
		
	}

}
