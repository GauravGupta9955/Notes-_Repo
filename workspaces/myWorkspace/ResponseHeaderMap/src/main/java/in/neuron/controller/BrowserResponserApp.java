package in.neuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BrowserResponserApp
 */
@WebServlet(urlPatterns ={"/test"}, loadOnStartup = 10)
public class BrowserResponserApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("Servlet Loading......");
	}
   
    public BrowserResponserApp() {
        super();
        System.out.println("Server Instatntiation");
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("Servlet Inititialisation");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("RequestProcessing for GET Request type.....");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Request Header information.....</h1>");
		Enumeration<String> headerNames=request.getHeaderNames();
		out.println("<table border ='1' align ='center'>");
		out.println("<tr><th>HeaderName</th><th>HeaderValue</th></tr>");
		while(headerNames.hasMoreElements()) {
			out.println("<tr>");
			String headerName =headerNames.nextElement();
			String headerValue =request.getHeader(headerName);
			out.println("<td>"+headerName+"</td>");
			out.print("<td>"+headerValue+"</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("Servlet desinstantiation");
	}

	

}
