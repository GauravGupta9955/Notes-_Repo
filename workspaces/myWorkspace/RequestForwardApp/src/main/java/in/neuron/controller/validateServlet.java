package in.neuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class validateServlet
 */
@WebServlet(urlPatterns={"/test1"})
public class validateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname =req.getParameter("username");
		String upwd =req.getParameter("password");
		
		if(uname.equals("sachin") && upwd.equals("tendulkar")) {
			//valid page redirect to inbox.jsp
			ServletContext context =getServletContext();
			RequestDispatcher rd =context.getRequestDispatcher("/inbox.jsp");
			rd.forward(req, resp);
		}
		else {
			//invalid page redirect to erro.jsp
			RequestDispatcher rd =req.getRequestDispatcher("/error.jsp");
			rd.forward(req, resp);
		}
		} 

}
