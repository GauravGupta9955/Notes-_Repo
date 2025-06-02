package in.ineuron.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//collect request Parameter
		String productQuantity =request.getParameter("pquantity");
		String productCost=request.getParameter("pcost");
		
		//create a cookie as per the requirement(inputs)
		
		Cookie c3 = new Cookie("pquantity", productQuantity);
		Cookie c4 = new Cookie("pcost", productCost);
		
		//send the cookie object through response
		
		response.addCookie(c3);
		response.addCookie(c4);
		
		//forward the response to form3.html
		RequestDispatcher rd =request.getRequestDispatcher("/form3.html");
		rd.forward(request, response);
		
	}

}
