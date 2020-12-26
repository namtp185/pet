package app.presenter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import app.presenter.veterinarians.ListAllVetsPresenter;
import app.view.ViewImpl;
import app.presenter.petsAndOwners.FindPetPresenter;
import app.presenter.petsAndOwners.ListAllOwnersPresenter;
import app.presenter.petsAndOwners.AddNewPetPresenter;
import org.springframework.beans.BeansException;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:32
 */
public class MainPresenter implements BeanFactoryAware {

	private BeanFactory beanFactory;
	private ListAllVetsPresenter listAllVetsPresenter;
	private FindPetPresenter findPetPresenter;
	private ListAllOwnersPresenter listAllOwnersPresenter;
	private AddNewPetPresenter addNewPetPresenter;

	public MainPresenter(){

	}

	public void finalize() throws Throwable {

	}

	public void invokeAddNewPet(){
		addNewPetPresenter = (AddNewPetPresenter) beanFactory.getBean("addNewPetPresenter");
		addNewPetPresenter.invoke(null);
	}

	public void invokeFindPet(){
		findPetPresenter = (FindPetPresenter) beanFactory.getBean("findPetPresenter");
		findPetPresenter.invoke(null);
	}

	public void invokeListAllOwners(){
		listAllOwnersPresenter = (ListAllOwnersPresenter) beanFactory.getBean("listAllOwnersPresenter");
		listAllOwnersPresenter.setView(ViewImpl.getInstance());
		listAllOwnersPresenter.invoke(null);
	}

	public void invokeListAllVets(){
		listAllVetsPresenter = (ListAllVetsPresenter) beanFactory.getBean("listAllVetsPresenter");
		listAllVetsPresenter.invoke(null);
	}

	/**
	 * 
	 * @param beanFactory    redseeds_uid-2100878068035309026-942098441760157225-
	 * 555157654514199961-4200298142951967808redseeds_uid
	 */
	public void setBeanFactory(BeanFactory beanFactory){
		this.beanFactory = beanFactory;
	}

}