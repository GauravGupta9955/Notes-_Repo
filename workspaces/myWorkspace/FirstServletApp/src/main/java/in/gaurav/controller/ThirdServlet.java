package in.gaurav.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns=("/second"),loadOnStartup =1)
public class ThirdServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse response) throws ServletException, IOException {
	System.out.println("genric servlet loading");
	
	response.setContentType("Text/html"); 
	PrintWriter out =response.getWriter();
	out.println("<html><head><title> Output</title></head>");
    out.println("<body>");
    out.println("<h1 style ='color:red; text-align:center;'> GenricServlet Coding </h1>");
	out.println("</body>");
	out.println("</html>");
	out.close(); 
		
	}

}
