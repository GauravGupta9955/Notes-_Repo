package in.neuron.filter;

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
		System.out.println("DemoFilter Loading.....");
	}
      
    public DemoFilter() {
     System.out.println("DemoFilter instantiation.....");
    }

	public void init(FilterConfig fConfig) throws ServletException {
	     System.out.println("DemoFilter instialisation....");
	     }
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	    
		PrintWriter out=response.getWriter();
        out.println("<h1>This line is added by Demofilter before processing the request</h1>");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		out.println("<h1>This line is added aby demofilter after processing</h1>");
	}
	public void destroy() {
	System.out.println("DemoFilter Destroy");
	}

}
