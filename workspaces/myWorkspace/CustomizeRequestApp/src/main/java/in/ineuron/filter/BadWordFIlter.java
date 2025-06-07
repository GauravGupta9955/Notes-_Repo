package in.ineuron.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

import in.ineuron.customization.CustomizedRequest;


@WebFilter("/test")
public class BadWordFIlter extends HttpFilter implements Filter {
       
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	    System.out.println("Preprocessing logic of filter");
		// pass the request along the filter chain
	    
	    CustomizedRequest req = new CustomizedRequest((HttpServletRequest)request);
	    
	    chain.doFilter(req, response);
		
		System.out.println("post processing logic of filter");
	}

}
