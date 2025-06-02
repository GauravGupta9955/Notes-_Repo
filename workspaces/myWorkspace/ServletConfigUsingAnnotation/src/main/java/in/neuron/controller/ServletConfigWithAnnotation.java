package in.neuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigWithAnnotation
 */
@WebServlet(
		urlPatterns = { "/ServletConfigWithAnnotation" }, 
		initParams = { 
				@WebInitParam(name = "jdbcUrl", value = "jdbc:mysql:///ineuron"), 
				@WebInitParam(name = "user", value = "root"), 
				@WebInitParam(name = "password", value = "Gaurav45")
		})
public class ServletConfigWithAnnotation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static {
		System.out.println("servlet loading");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("servlet Instatantiation");
	}

	public ServletConfigWithAnnotation() {
		System.out.println("servlet Initialization");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request processing for GET request type......");
		
		response.setContentType("text/html");
		 
		 PrintWriter out =response.getWriter();
		 
		 out.println("<html><head><title>Output</title></head>");
		 out.println("<body>");
		 out.println("<body align ='center'>");
		 out.println("<table border ='1'>");
		 out.println("<tr><th>ParameterName</th><th>ParameterValue<th></tr>");
		 
		 ServletConfig config=getServletConfig();
		 
		 Enumeration<String>initParameterNames =config.getInitParameterNames();
		 while(initParameterNames.hasMoreElements()) {
			 
		     String parmeterName =(String) initParameterNames.nextElement();
		     String parameterValue =config.getInitParameter(parmeterName);
			 out.println("<tr>");
			 out.print("<td>"+parmeterName+"</td><td>"+parameterValue+"</td>");
		     out.println("</tr>");
		 }
	     out.println("</table>");
		 out.println("</body>");
		 out.println("</html>");
	}
}
