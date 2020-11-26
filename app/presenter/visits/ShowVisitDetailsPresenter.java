package app.presenter.visits;
import app.presenter.AbstractUseCasePresenter;
import app.dto.VisitDetailsDTO;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
public class ShowVisitDetailsPresenter extends AbstractUseCasePresenter {

	private Long inputVisitID = null;
	private VisitDetailsDTO visitDetailsDTO = null;

	public ShowVisitDetailsPresenter(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public Long getInputVisitID(){
		return this.inputVisitID;
	}

	public VisitDetailsDTO getVisitDetailsDTO(){
		return this.visitDetailsDTO;
	}

	/**
	 * 
	 * @param invokingPresenter    redseeds_uid95967032996053266--6655785595564625124-
	 * 433362450183358341--6003721352783688508redseeds_uid
	 */
	public void invoke(AbstractUseCasePresenter invokingPresenter){
		super.invoke(invokingPresenter);
		showVisitDetailsTriggered();
	}

	/**
	 * 
	 * @param invocationResult    redseeds_uid-6183652245198751106--
	 * 1300910728760585775-5669299666373150417-6194870937250688822redseeds_uid
	 */
	public void resumeUseCase(int invocationResult){

	}

	/**
	 * 
	 * @param inputVisitID    redseeds_uid2766358280198575869-5809524465086799167-
	 * 9035650921902891757--107749339239749268redseeds_uid
	 */
	public void setInputVisitID(Long inputVisitID){
		this.inputVisitID = inputVisitID;
	}

	/**
	 * 
	 * @param visitDetailsDTO    redseeds_uid-2935025425243438608-2489928512764179898--
	 * 2064918847888228805-9103085735211779038redseeds_uid
	 */
	public void setVisitDetailsDTO(VisitDetailsDTO visitDetailsDTO){
		this.visitDetailsDTO = visitDetailsDTO;
	}

	public void showVisitDetailsTriggered(){
		visitDetailsDTO = service.readVisitDetails(inputVisitID);
		view.showVisitDetailsScreen(this);
		pageOpened();
		setUseCaseResult(1);
		finalizeUseCase();
	
	}

}