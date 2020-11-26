package app.presenter.petsAndOwners;
import app.presenter.AbstractUseCasePresenter;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:31
 */
public class DeletePetPresenter extends AbstractUseCasePresenter {

	private Long inputPetID = null;

	public DeletePetPresenter(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void deletePetConfirmationDialogCancelTriggered(){
		setUseCaseResult(0);
		finalizeUseCase();
	
	}

	public void deletePetConfirmationDialogDeleteTriggered(){
		service.deletePet(inputPetID);
		setUseCaseResult(1);
		finalizeUseCase();
	
	}

	public void deletePetTriggered(){
		view.showDeletePetConfirmationDialog(this);
	
	}

	public Long getInputPetID(){
		return this.inputPetID;
	}

	/**
	 * 
	 * @param invokingPresenter    redseeds_uid7656356422985637444--
	 * 7542779843013015705--4894305117121808652--4119430596098296370redseeds_uid
	 */
	public void invoke(AbstractUseCasePresenter invokingPresenter){
		super.invoke(invokingPresenter);
		deletePetTriggered();
	}

	/**
	 * 
	 * @param invocationResult    redseeds_uid5072923461773454412--2890617150890743020-
	 * -8338052091203467748-4918385534513272905redseeds_uid
	 */
	public void resumeUseCase(int invocationResult){

	}

	/**
	 * 
	 * @param inputPetID    redseeds_uid-5732348591288279631-7320274568760257335-
	 * 8381163492360531770-404134506097600908redseeds_uid
	 */
	public void setInputPetID(Long inputPetID){
		this.inputPetID = inputPetID;
	}

}