import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import app.presenter.MainPresenter;
import app.view.ViewImpl;
import app.view.screens.MainPage;
import nextapp.echo.app.ApplicationInstance;
import nextapp.echo.webcontainer.WebContainerServlet;

//public class HelloServlet extends HttpServlet {
//    
//   private static final long serialVersionUID = 1L;
// 
//    
//   public HelloServlet() {
//   }
// 
//   @Override
//   protected void doGet(HttpServletRequest request,
//           HttpServletResponse response) throws ServletException, IOException {
//        
//       ServletOutputStream out = response.getOutputStream();
//        
//       out.println("<html>");
//       out.println("<head><title>Hello Servlet</title></head>");
//        
//       out.println("<body>");
//       out.println("<h3>Hello World</h3>");
//       out.println("This is my first Servlet");
//       out.println("</body>");
//       out.println("<html>");
//   }
// 
//   @Override
//   protected void doPost(HttpServletRequest request,
//           HttpServletResponse response) throws ServletException, IOException {
//       this.doGet(request, response);
//   }
// 
//}

public class HelloServlet extends WebContainerServlet {

	@Override
	public ApplicationInstance newApplicationInstance() {
//		WebApplicationContext context = (WebApplicationContext) WebApplicationContextUtils.getWebApplicationContext(getServletContext());
//		ViewImpl mainApp = (ViewImpl) context.getBean("view");
//		System.out.println(context);
//		System.out.println(mainApp);
//		return (ApplicationInstance) mainApp;
		
		ViewImpl view = new ViewImpl();
		
		MainPresenter mainPresenter = new MainPresenter();
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("/WEB-INF/Beans.xml"));
		mainPresenter.setBeanFactory(factory);
//		ResourceBundle labels = ResourceBundle.getBundle("messages.en", Locale.US);
//		MainPage mainPage = new MainPage(mainPresenter, labels);
		
		view.setMainPresenter(mainPresenter);
		
		return view;
	}
	
}