package in.neuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(urlPatterns={"/test1"})
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out =response.getWriter();
		//default response type is "text/html" only
		out.println("<h1 style ='color:red; text-align:center;'>This is First Servlet</h1>");
	    out.close();
		RequestDispatcher rd =request.getRequestDispatcher("/test2");
		rd.forward(request,response);
	}

}
