package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.listener.RequestDemoListener;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/test")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =response.getWriter();
		out.println("<h1>The no. of hit happen in the list" +RequestDemoListener.count+"</h1>");
		
	}

}
