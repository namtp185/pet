package app.presenter;
import nextapp.echo.app.ApplicationInstance;
import nextapp.echo.webcontainer.WebContainerServlet;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import app.view.ViewImpl;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:32
 */
public class MainApplicationServlet extends WebContainerServlet {

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

}