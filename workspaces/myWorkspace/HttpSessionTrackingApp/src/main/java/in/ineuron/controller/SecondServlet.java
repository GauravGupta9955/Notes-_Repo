package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String qualification = request.getParameter("qalification");
		String designation = request.getParameter("design");
		
		//create the session object and store the request data in 
		//session object
		HttpSession session=request.getSession();
		session.setAttribute("qualification", qualification);
		session.setAttribute("designation", designation);
		
		//forward the response to the form3.html
		 
		RequestDispatcher rd = request.getRequestDispatcher("/form3.html");
		rd.forward(request, response);
	}

}
