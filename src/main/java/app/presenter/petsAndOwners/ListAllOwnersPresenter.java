package app.presenter.petsAndOwners;
import app.presenter.AbstractUseCasePresenter;
import java.util.List;
import app.dto.OwnerListItemDTO;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:32
 */
public class ListAllOwnersPresenter extends AbstractUseCasePresenter {

	private Long invokeOwnerID = null;
	private List<OwnerListItemDTO> ownerListDTO = null;
	private ShowPetsPresenter showPetsPresenter;
	private AddNewOwnerPresenter addNewOwnerPresenter;

	public ListAllOwnersPresenter(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void addNewOwnerDialogNoTriggered(){
		setUseCaseResult(0);
		finalizeUseCase();
	
	}

	public void addNewOwnerDialogYesTriggered(){
		this.invokeAddNewOwner(6);
	
	}

	public Long getInvokeOwnerID(){
		return this.invokeOwnerID;
	}

	public List<OwnerListItemDTO> getOwnerListDTO(){
		return this.ownerListDTO;
	}

	/**
	 * 
	 * @param invokingPresenter    redseeds_uid-6196564590103213431--
	 * 3737548749087602736-1849665774315457299--3438856218459652100redseeds_uid
	 */
	public void invoke(AbstractUseCasePresenter invokingPresenter){
		super.invoke(invokingPresenter);
		listAllOwnersTriggered();
	}

	/**
	 * 
	 * @param resumeId    redseeds_uid-1521994449796994286--9214114747052395181--
	 * 502645443911988364-1470681978635620715redseeds_uid
	 */
	public void invokeAddNewOwner(int resumeId){
		addNewOwnerPresenter = (AddNewOwnerPresenter) beanFactory.getBean("addNewOwnerPresenter");
		//TODO: see what is set input
//		addNewOwnerPresenter.setInput();
		this.setResumeId(resumeId);
		addNewOwnerPresenter.invoke(this);
	}

	public void invokeAddNewOwner(){
		invokeAddNewOwner(-1);
	}

	/**
	 * 
	 * @param resumeId    redseeds_uid-6537427236780803238--8255498756394163819-
	 * 1898239439480610534--4163925743750071166redseeds_uid
	 */
	public void invokeShowPets(int resumeId){
		showPetsPresenter = (ShowPetsPresenter) beanFactory.getBean("showPetsPresenter");
		showPetsPresenter.setInputOwnerID(invokeOwnerID);
		this.setResumeId(resumeId);
		showPetsPresenter.invoke(this);
	}

	public void invokeShowPets(){
		invokeShowPets(-1);
	}

	public void listAllOwnersTriggered(){
		ownerListDTO = service.readOwnerList();
		System.out.println("service: " + service.toString());
		System.out.println("ownerlistDTO: " + ownerListDTO.toString());
		System.out.println("view: " + view.toString());
		if (!ownerListDTO.isEmpty()) { /* owners found [1] */
		    view.showOwnerListScreen(this);
		    pageOpened();
		    setUseCaseResult(1);
		    finalizeUseCase();
		}
		else if (ownerListDTO.isEmpty()) { /* no owners found [0] */
		    view.showAddNewOwnerDialog(this);
		}
	
	}

	/**
	 * 
	 * @param invocationResult    redseeds_uid-8885051350355423539-5791205521356934032-
	 * 3740512337080435785-2153845141416661818redseeds_uid
	 */
	public void resumeUseCase(int invocationResult){
	
		if (getResumeId() == 6) {
		    resume6(invocationResult);
		}
	
	}

	/**
	 * 
	 * @param invokeOwnerID    redseeds_uid7248579667054406319--4032112614271140757-
	 * 7062339810249394666-3661990068583542342redseeds_uid
	 */
	public void setInvokeOwnerID(Long invokeOwnerID){
		this.invokeOwnerID = invokeOwnerID;
	}

	/**
	 * 
	 * @param ownerListDTO    redseeds_uid1638486515728026917--1093399025948119698-
	 * 8619832780850597719-1234601463896936101redseeds_uid
	 */
	public void setOwnerListDTO(List<OwnerListItemDTO> ownerListDTO){
		this.ownerListDTO = ownerListDTO;
	}

	/**
	 * 
	 * @param invocationResult    redseeds_uid1884799822774150341--5400080079062303679-
	 * -4614517470496139319-2749557374430834881redseeds_uid
	 */
	private void resume6(int invocationResult){
		if (invocationResult == 1) { /* SUCCESS */
		}
		else if (invocationResult == 0 || invocationResult == -1) { /* FAILURE */
		    setUseCaseResult(0);
		    finalizeUseCase();
		}
	
	}

}