package app.presenter.veterinarians;
import app.presenter.AbstractUseCasePresenter;
import app.dto.VeterinarianDataDTO;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:31
 */
public class EditVetPresenter extends AbstractUseCasePresenter {

	private Long inputVeterinarianID = null;
	private VeterinarianDataDTO veterinarianDataDTO = null;

	public EditVetPresenter(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void editVetTriggered(){
		veterinarianDataDTO = service.readVeterinarianData(inputVeterinarianID);
		view.showVetForm(this);
		pageOpened();
	
	}

	public Long getInputVeterinarianID(){
		return this.inputVeterinarianID;
	}

	public VeterinarianDataDTO getVeterinarianDataDTO(){
		return this.veterinarianDataDTO;
	}

	public void incorrectVetDataMessageOKTriggered(){

	}

	/**
	 * 
	 * @param invokingPresenter    redseeds_uid-4735221379123308473-
	 * 1876839900821586227-4964558462486721821-6126071019698695603redseeds_uid
	 */
	public void invoke(AbstractUseCasePresenter invokingPresenter){
		super.invoke(invokingPresenter);
		editVetTriggered();
	}

	/**
	 * 
	 * @param invocationResult    redseeds_uid7744616528393507300-17681167464498292-
	 * 668648731176057023--6964027844402286901redseeds_uid
	 */
	public void resumeUseCase(int invocationResult){

	}

	/**
	 * 
	 * @param inputVeterinarianID    redseeds_uid4964086033689961413-
	 * 140043096123640897--279596942926642194--1193058829423849827redseeds_uid
	 */
	public void setInputVeterinarianID(Long inputVeterinarianID){
		this.inputVeterinarianID = inputVeterinarianID;
	}

	/**
	 * 
	 * @param veterinarianDataDTO    redseeds_uid1455372021354475438--
	 * 3699968173054821512-944612674630125893-3290484954706476606redseeds_uid
	 */
	public void setVeterinarianDataDTO(VeterinarianDataDTO veterinarianDataDTO){
		this.veterinarianDataDTO = veterinarianDataDTO;
	}

	public void updateVetTriggered(){
		int result6;
		result6 = service.validateVeterinarianData(veterinarianDataDTO);
		if (result6 == 1) { /* data correct [1] */
		    int result8;
		    result8 = service.updateVeterinarianData(veterinarianDataDTO);
		    if (result8 == 1) { /* vet data updated successfully [1] */
		        view.showVetUpdatedMessage(this);
		    }
		    else if (result8 == 0) { /* update failed [0] */
		        view.showVetUpdateFailureMessage(this);
		    }
		}
		else if (result6 == 0) { /* data incorrect [0] */
		    view.showIncorrectVetDataMessage(this);
		}
	
	}

	public void vetUpdatedMessageOKTriggered(){
		setUseCaseResult(1);
		finalizeUseCase();
	
	}

	public void vetUpdateFailureMessageOKTriggered(){
		view.closeVetForm();
		pageClosed();
		setUseCaseResult(0);
		finalizeUseCase();
	
	}

}