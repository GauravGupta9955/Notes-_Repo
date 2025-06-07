package in.gaurav.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet implements Servlet {

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Servlet is Initialising");
	}
	

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse response) throws ServletException, IOException {
	
		System.out.println("Providing the service for the user ");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title> Output</title></head>");
        out.println("<body>");
        out.println("<h1 style ='color:red; text-align:center;'> coding in Eclipse is easy </h1>");
		out.println("</body>");
		out.println("</html>");
		out.close(); 

	} 
	@Override
	public void destroy() {
		System.out.println("destoying the Servlet");
		
	}
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Developed by Gaurav";
	}

}
