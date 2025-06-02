package in.ineuron.customization;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class CustomizedRequest extends HttpServletRequestWrapper {

	public CustomizedRequest(HttpServletRequest request) {
		super(request);

	}
	@Override
	public String getParameter(String name) {
		// TODO Auto-generated method stub
		String ineuron = "ineuron";
		String word = super.getParameter(name);
		if (word.equalsIgnoreCase("spring") || word.equalsIgnoreCase("java") || word.equalsIgnoreCase("jee")) {
			return ineuron;
		} else
			return word;
	}
}
