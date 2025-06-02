package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//collect request Parameter
		String productId =request.getParameter("pid");
		String productName=request.getParameter("pname");
		
		//create a cookie as per the requirement(inputs)
		
		Cookie c1 = new Cookie("pid", productId);
		Cookie c2 = new Cookie("pname", productName);
		
		//send the cookie object through response
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		RequestDispatcher rd =request.getRequestDispatcher("/form2.html");
		rd.forward(request, response);
		
	}
}
