package in.neuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/test")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static {
		
	}
	public SecondServlet() {
		System.out.println("Servlet Instantiation");
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		ServletConfig config =getServletConfig();
		System.out.println("Config available obj"+ config);
		
	}
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title> Output</title></head>");
        out.println("<body>");
        out.println("<h1>Getting the response for getrequest Type </h1>");
		out.println("</body>");
		out.println("</html>");
		out.close(); 
	}

	
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
