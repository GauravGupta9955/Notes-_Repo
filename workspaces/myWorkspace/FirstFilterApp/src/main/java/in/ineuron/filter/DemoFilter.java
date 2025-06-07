package in.ineuron.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/test1")
public class DemoFilter extends HttpFilter implements Filter {
	static {
		System.out.println("Filter is loading");
	}

	public DemoFilter() {
		System.out.println("Filter object is instantiated");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter Initialization");
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//Filter preprocessing logic is coded
		
		PrintWriter out =response.getWriter();
		out.println("<h1>This line is added by demo filter before processing the request....</h1>");
		
	
		
		//pass the request alont the filter chain
		chain.doFilter(request, response);
		//filter post processing is coded here.
		out.println("<h1>This line is added by demo filter after post processing the request....</h1>");
		out.close();
	
	}
	public void destroy() {
		System.out.println("filter object is deinstantiated");
	}

}
