package in.neuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	static {
		System.out.println("servlet Loading.....");
	}
    
    public DemoServlet() {
    	System.out.println("servlet instantiation.....");
    }
    
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub

		System.out.println("servlet initialization.......");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context =getServletContext();
		 response.setContentType("text/html");
		 
		 PrintWriter out =response.getWriter();
		 
		 out.println("<html><head><title>Output</title></head>");
		 out.println("<body>");
		 out.println("<body align ='center'>");
		 out.println("<table border ='1'>");
		 out.println("<tr><th>ParameterName</th><th>ParameterValue<th></tr>");
		 Enumeration<String>initParameterNames =context.getInitParameterNames();
		 while(initParameterNames.hasMoreElements()) {
			 
		     String parmeterName =(String) initParameterNames.nextElement();
		     String parameterValue =context.getInitParameter(parmeterName);
			 out.println("<tr>");
			 out.print("<td>"+parmeterName+"</td><td>"+parameterValue+"</td>");
		     out.println("</tr>");
		 }
	     out.println("</table>");
		 out.println("</body>");
		 out.println("</html>");

	}
}
