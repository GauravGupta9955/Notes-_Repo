package in.neuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/Demo123" }, loadOnStartup = 1)
public class DemoServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("DemoServlet Loading....");
	}

	public DemoServletApp() {
		System.out.println("DemoServlet Instantiation......");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("DemoServlet Initialization.....");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("RequestProcessing for GET Request type.....");
		System.out.println("Client IPAddress is :: "+request.getRemoteAddr());
		System.out.println("Client HostDetail is :: "+request.getRemoteHost());
		System.out.println("Client Port is :: "+request.getRemotePort());
		System.out.println("ServerName is :: "+request.getServerName());
		System.out.println("ServerPort is :: "+request.getServerPort());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

	}

}
