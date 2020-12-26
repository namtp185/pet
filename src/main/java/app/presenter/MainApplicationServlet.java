package app.presenter;
import nextapp.echo.app.ApplicationInstance;
import nextapp.echo.webcontainer.WebContainerServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import app.view.ViewImpl;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:32
 */
public class MainApplicationServlet extends WebContainerServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2656431877105729960L;

	public MainApplicationServlet(){
		
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public ApplicationInstance newApplicationInstance(){
		System.out.println("hi");
		WebApplicationContext context = (WebApplicationContext) WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		ViewImpl mainApp = (ViewImpl) context.getBean("view");
		return (ApplicationInstance) mainApp;
	}
	
   @Override
   protected void process(HttpServletRequest request, HttpServletResponse response) 
   throws IOException, ServletException {
       ServletOutputStream out = response.getOutputStream();
       
       out.println("<html>");
       out.println("<head><title>Hello Servlet</title></head>");
        
       out.println("<body>");
       out.println("<h3>Hello World</h3>");
       out.println("This is my first Servlet");
       out.println("</body>");
       out.println("<html>");
   }

}