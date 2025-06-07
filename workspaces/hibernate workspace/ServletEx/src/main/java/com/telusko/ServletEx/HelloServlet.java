package com.telusko.ServletEx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req ,HttpServletResponse resp) throws IOException {
		System.out.println("in service");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<h2><b>Hello World</b></h2>");
	}

}
