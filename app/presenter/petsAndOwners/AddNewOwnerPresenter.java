package app.presenter.petsAndOwners;
import app.presenter.AbstractUseCasePresenter;
import app.dto.OwnerDataDTO;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:30
 */
public class AddNewOwnerPresenter extends AbstractUseCasePresenter {

	private OwnerDataDTO ownerDataDTO = null;

	public AddNewOwnerPresenter(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void addNewOwnerTriggered(){
		view.showNewOwnerForm(this);
		pageOpened();
	
	}

	public OwnerDataDTO getOwnerDataDTO(){
		return this.ownerDataDTO;
	}

	public void invalidOwnerDataMessageOKTriggered(){

	}

	/**
	 * 
	 * @param invokingPresenter    redseeds_uid6392979235699001402-5004067725608380714-
	 * 2866562646171929938-6256119342800173932redseeds_uid
	 */
	public void invoke(AbstractUseCasePresenter invokingPresenter){
		super.invoke(invokingPresenter);
		addNewOwnerTriggered();
	}

	public void ownerAddedMessageOKTriggered(){
		view.closeNewOwnerForm();
		pageClosed();
		setUseCaseResult(1);
		finalizeUseCase();
	
	}

	/**
	 * 
	 * @param invocationResult    redseeds_uid5795753142500911166-7704621843595486465-
	 * 3274873297107495981-1011481397268497155redseeds_uid
	 */
	public void resumeUseCase(int invocationResult){

	}

	public void saveOwnerTriggered(){
		int result5;
		result5 = service.validateOwnerData(ownerDataDTO);
		if (result5 == 1) { /* owner data valid [1] */
		    service.createOwnerData(ownerDataDTO);
		    view.showOwnerAddedMessage(this);
		}
		else if (result5 == 0) { /* owner data invalid [0] */
		    view.showInvalidOwnerDataMessage(this);
		}
	
	}

	/**
	 * 
	 * @param ownerDataDTO    redseeds_uid-4487485950819593311--6026075625850958819-
	 * 8583628797340593910-5270826486861570452redseeds_uid
	 */
	public void setOwnerDataDTO(OwnerDataDTO ownerDataDTO){
		this.ownerDataDTO = ownerDataDTO;
	}

}