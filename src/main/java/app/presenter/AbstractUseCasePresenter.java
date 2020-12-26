package app.presenter;
import org.springframework.beans.factory.BeanFactory;
import app.model.IService;
import app.model.ServiceFactory;
import app.view.IView;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.BeansException;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:30
 */
public abstract class AbstractUseCasePresenter implements BeanFactoryAware {

	private AbstractUseCasePresenter invokingPresenter = null;
	private int numberOfOpenedPages = 0;
	private int resumeId = -1;
	private int useCaseResult = -1;
	protected BeanFactory beanFactory;
	protected IService service;
	protected IView view;



	public void finalize() throws Throwable {

	}

	public AbstractUseCasePresenter(){
		service = ServiceFactory.getService();
	}

	public void closeCurrentPageAndFinalizeUseCase(){
		if (getNumberOfOpenedPages() > 0) {
		    view.closeCurrentPage();
		    pageClosed();
		}
	
		finalizeUseCase();
	
	}

	public int getNumberOfOpenedPages(){
		return this.numberOfOpenedPages;
	}

	public int getResumeId(){
		return this.resumeId;
	}

	public int getUseCaseResult(){
		return this.useCaseResult;
	}

	/**
	 * 
	 * @param invokingPresenter    redseeds_uid3075317199343790153-190546857355227614--
	 * 4139925196989976799--6805900858174602366redseeds_uid
	 */
	public void invoke(AbstractUseCasePresenter invokingPresenter){
		this.invokingPresenter = invokingPresenter;
	}

	/**
	 * 
	 * @param result    redseeds_uid2048582772134461946-1289743436647186381-
	 * 3013756635465306153-2305261315990473945redseeds_uid
	 */
	public void resumeUseCase(int result){

	}

	/**
	 * 
	 * @param beanFactory    redseeds_uid-5240429345261120970--450624547603941156-
	 * 318704706062147394-7431831203349960619redseeds_uid
	 */
	public void setBeanFactory(BeanFactory beanFactory){
		this.beanFactory = beanFactory;
	}

	/**
	 * 
	 * @param resumeId    redseeds_uid-5502985345713294387--8541340369063783997-
	 * 5889742814049489916-7221408389290429009redseeds_uid
	 */
	public void setResumeId(int resumeId){
		this.resumeId = resumeId;
	}

	/**
	 * 
	 * @param useCaseResult    redseeds_uid3652926343489998677-4418518251557452442--
	 * 425263448635679785--3196102746865329065redseeds_uid
	 */
	public void setUseCaseResult(int useCaseResult){
		this.useCaseResult = useCaseResult;
	}

	/**
	 * 
	 * @param view    redseeds_uid-8103031315277190834-5026035978479352671-
	 * 3363223808662446161-1379188607571210487redseeds_uid
	 */
	public void setView(IView view){
		this.view = view;
	}

	protected void finalizeUseCase(){
		if (getNumberOfOpenedPages() == 0) {
		    notifyInvokingUseCase();
		}
	}

	protected void notifyInvokingUseCase(){
		if (invokingPresenter != null) {
		    invokingPresenter.resumeUseCase(useCaseResult);
		}
	}

	protected void pageClosed(){
		if (numberOfOpenedPages > 0)
		    numberOfOpenedPages--;
	}

	protected void pageOpened(){
		numberOfOpenedPages++;
	}

}