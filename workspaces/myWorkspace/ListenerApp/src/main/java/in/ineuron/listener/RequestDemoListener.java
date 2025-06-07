package in.ineuron.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class RequestDemoListener
 *
 */
@WebListener
public class RequestDemoListener implements ServletRequestListener {

  
   public static int count=0;

    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    	System.out.println("request object destroyed :: "+new java.util.Date());
    }


    public void requestInitialized(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    	count++;
    	System.out.println("Request object got created at ::"+new java.util.Date());
    	System.out.println("no of hit for request "+ count);
    	
    }
	
}
