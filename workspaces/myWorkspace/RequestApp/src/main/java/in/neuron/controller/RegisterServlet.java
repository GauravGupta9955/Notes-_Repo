package in.neuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(urlPatterns = "/Reg", loadOnStartup = 1)
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("Servlet Loading");
	}

	public RegisterServlet() {
		super();
		System.out.println("Servlet Instantiation");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("servlet Initialization");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("request processing for GetTypr Metod....");
		System.out.println("request object Implementation class" +request.getClass().getName());
		System.out.println("Response object Implementation class" +response.getClass().getName());

		//getting the parameter from the client using html pages
		String username = request.getParameter("username");
		String contaceNumber =request.getParameter("contacNumber");
		String mailId =request.getParameter("emailId");
		
		//getting multipleparameters from the client using html pages
		String[] courses =request.getParameterValues("course");
		
		response.setContentType("text/html");
		
		PrintWriter out =response.getWriter();
		
		out.println("<html><head><title> Output</title></head>");
        out.println("<body>");
        out.println("<table border ='1'align ='center'>");
        out.println("<tr><th>Name:- </th><td>"+username+"</td></tr>");
        out.println("<tr><th>Number:- </th><td>"+contaceNumber+"</td></tr>");
        out.println("<tr><th>e-Mailid:- </th><td>"+mailId+"</td></tr>");
        out.println("<tr><th>course Selected </th>");
        for(String course:courses) {
        	 out.print("<td>"+course);
        	
        }
        out.println("</td>");
        out.println("</tr>");
        
        
        out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.close(); 
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		
		System.out.println("Servlet DeInstantiation");
	}

}
