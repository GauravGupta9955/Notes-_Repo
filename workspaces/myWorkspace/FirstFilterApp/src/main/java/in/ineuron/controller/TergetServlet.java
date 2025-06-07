package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test1")
public class TergetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("servlet loading");
	}
	
	public void TargetServlet() {
		System.out.println("servlet instntiation.....");
	}
    @Override
    public void init() throws ServletException {
    	System.out.println("servlet initialisation.....");
    	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Request Processing Phase.....");
		
		PrintWriter out =response.getWriter();
		out.println("<h1>This is the response from the Target Servlet</h1>");
		}
	
	@Override
	public void destroy() {
		System.out.println("Servlet De-instntiation");
	}

}
