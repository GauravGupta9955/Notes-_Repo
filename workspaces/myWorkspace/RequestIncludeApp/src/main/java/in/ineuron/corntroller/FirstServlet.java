package in.ineuron.corntroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		
		out.println("<h1> Hello this is First Servlet</h1>");
		RequestDispatcher rd =request.getRequestDispatcher("/test2");
		rd.include(request, response);
		out.println("<h1>Hi, This is First Servlet Again....</h1>");
		
		out.close();
	}

	

}
