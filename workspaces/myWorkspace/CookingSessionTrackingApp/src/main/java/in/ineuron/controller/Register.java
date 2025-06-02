package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test3")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//collect request Parameter
		String manufactureDate =request.getParameter("man_date");
		String expiryDate=request.getParameter("Exp_date");
		
	   //Collect the cookies from the request Object
		Cookie [] cookies  =request.getCookies();
		String pid =cookies[0].getValue();
		String pname =cookies[1].getValue();
		String pcost =cookies[2].getValue();
		String pquantity =cookies[3].getValue();
		
		//sending the response throught html page:-
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<center>");
		out.println("<table bgcolor='lightGreen' border=1>");
		out.println("<form>");
		out.println("<tr>");
		out.println("<th>Product id</th><td>"+pid+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Product Name</th><td>"+pname+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Product Cost</th><td>"+pcost+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Product Quantity</th><td>"+pquantity+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Manufacture Date</th><td>"+manufactureDate+"<td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Expire Date</th><td>"+expiryDate+"<td>");
		out.println("</tr>");
		out.println("</form>");
		out.println("</center>");
		
		out.println("</table>");
		
		
		out.close();
		
		
		
	
		
		
		
		
	}

}
