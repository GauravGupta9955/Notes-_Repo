package in.ineuron.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImageResponseApp
 */
@WebServlet(urlPatterns={"/Image"})
public class ImageResponseApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       static {
    	   System.out.println("servlet loading");
       }
       @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	System.out.println("Servlet initialisation");
    }
   
    public ImageResponseApp() {
        super();
       System.out.println("Server Instantilization");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("image/jpg");
		
		ServletOutputStream os = response.getOutputStream();
		String path =getServletContext().getRealPath("IMG20230422124757.jpg");
		File f = new File(path);
		FileInputStream fis =new FileInputStream(f);
		byte[] b = new byte[(int)f.length()];
		fis.read(b);//reading and placing the image data into byte array.
		
		os.write(b);
		os.flush();
		os.close();
		os.write(null);
		os.close();
	}

	
	
}
