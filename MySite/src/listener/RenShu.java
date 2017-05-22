package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class RenShu
 *
 */
@WebListener
public class RenShu implements HttpSessionListener {
		
    private int count=0;

	/**
     * Default constructor. 
     */
    public RenShu() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
        count++;
        //存放起来
        arg0.getSession().getServletContext().setAttribute("count", count);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    		count--;
    		 arg0.getSession().getServletContext().setAttribute("count", count);
    }
	
}
