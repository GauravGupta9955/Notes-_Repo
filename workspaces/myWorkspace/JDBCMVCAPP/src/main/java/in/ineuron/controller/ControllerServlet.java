package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.ineuron.dto.Student;
import in.ineuron.factory.StudentServiceFactory;



@WebServlet("/controller/*")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
 
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request,response);
	}


	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String requestURI=request.getRequestURI();
		System.out.println(requestURI);
		
		String status=null;
		in.ineuron.services.IStudentService studentService;
		studentService=StudentServiceFactory.getStudentService();
		Student student = new Student();
		
		
		
		RequestDispatcher rd =null;
		if(requestURI.endsWith("layout")) {
			rd=request.getRequestDispatcher("../layout.html");
			rd.forward(request,response);
		}
		
		if(requestURI.endsWith("addform")) {
			
			String sname =request.getParameter("sname");
			String sage = request.getParameter("sage");
			String saddress =request.getParameter("saddr");
			student.setAge(Integer.parseInt(sage));
			student.setSaddress(saddress);
			student.setName(sname);
			
			status=studentService.save(student);	  
			System.out.println(status);
			
			if(status.equals("success")) {
				rd=request.getRequestDispatcher("../success.html");
				rd.forward(request, response);
			}
			else {
				rd=request.getRequestDispatcher("../failure.html");
				rd.forward(request, response);
			}
	}
	else if (requestURI.endsWith("updateform")) {

		String sid = request.getParameter("sid");
		HttpSession session = request.getSession();
		session.setAttribute("sid", sid);

		student = studentService.findById(Integer.parseInt(sid));

		if (student != null) {

			rd = request.getRequestDispatcher("../editform.html");
			rd.forward(request, response);
		}
		
		else {
			rd=request.getRequestDispatcher("../notfound.html");
			rd.forward(request, response);
		}
	}
		else if(requestURI.endsWith("editform")) {
			
			HttpSession session=request.getSession();
			String sid=session.getAttribute("sid").toString();
			String sname =request.getParameter("sname");
			String sage = request.getParameter("sage");
			String saddress =request.getParameter("saddr");
			student.setAge(Integer.parseInt(sage));
			student.setSaddress(saddress);
			student.setName(sname);
			student.setSid(Integer.parseInt(sid));
			
			status=studentService.updateById(student);	  
			if(status.equals("success")) {
				rd=request.getRequestDispatcher("../updateSuccessful.html");
				rd.forward(request, response);
			}
			else {
				rd=request.getRequestDispatcher("../failureUpdated.html");
				rd.forward(request, response);
			}
		}
		
		else if(requestURI.endsWith("searchform")) {
			
			String sid =request.getParameter("sid");
			student=studentService.findById(Integer.parseInt(sid));	
			
			if(student!=null) {

				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				
				out.println("<html><head><title> Student Data</title></head>");
				out.println("<body bgcolor='lightblue'>");

				out.println("<table border ='1'align ='center'>");
				out.print("<tr><th>SID<th><td>" + student.getSid() + "</td> </tr>");
				out.print("<tr><th>Name<th><td>" + student.getName() + "</td> </tr>");
				out.print("<tr><th>Age<th><td>" + student.getAge() + "</td> </tr>");
				out.print("<tr><th>Address<th><td>" + student.getSaddress() + "</td> </tr>");
				out.println("</table>");
				out.println("<body>");
				out.println("</html>");
				
		
				
			}
			else {
				rd=request.getRequestDispatcher("../notfound.html");
				rd.forward(request, response);
			}
			
			
		}
		else if(requestURI.endsWith("deleteform")) {
			
			String sid =request.getParameter("sid");
			student.setSid(Integer.parseInt(sid));
			status=studentService.deleteById(Integer.parseInt(sid));
			if(status.equals("success")) {
				rd=request.getRequestDispatcher("../deleted.html");
				rd.forward(request, response);
			}
			else {
				rd=request.getRequestDispatcher("../failure.html");
				rd.forward(request, response);
			}
			
				
			
		}

}
}

