package app.model;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AspectJConfig.class)
public class ServiceFactory {

	private static ServiceImpl service = new ServiceImpl();



	public void finalize() throws Throwable {

	}

	private ServiceFactory(){

	}

	public static IService getService(){
		return service;
	}

}