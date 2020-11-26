package app.model;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
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