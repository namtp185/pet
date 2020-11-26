package app.presenter.visits;
import app.presenter.AbstractUseCasePresenter;
import app.dto.VisitDataDTO;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:31
 */
public class EditVisitPresenter extends AbstractUseCasePresenter {

	private Long inputVisitID = null;
	private VisitDataDTO visitDataDTO = null;

	public EditVisitPresenter(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void editVisitTriggered(){
		visitDataDTO = service.readVisitData(inputVisitID);
		view.showVisitForm(this);
		pageOpened();
	
	}

	public Long getInputVisitID(){
		return this.inputVisitID;
	}

	public VisitDataDTO getVisitDataDTO(){
		return this.visitDataDTO;
	}

	/**
	 * 
	 * @param invokingPresenter    redseeds_uid-108424891026110136-5282019316508196814-
	 * -2213741797686734760-2969450454443077346redseeds_uid
	 */
	public void invoke(AbstractUseCasePresenter invokingPresenter){
		super.invoke(invokingPresenter);
		editVisitTriggered();
	}

	/**
	 * 
	 * @param invocationResult    redseeds_uid-4133362910558557636--418920412011557958-
	 * -373323830938104231--3567174970419938580redseeds_uid
	 */
	public void resumeUseCase(int invocationResult){

	}

	/**
	 * 
	 * @param inputVisitID    redseeds_uid4356589354252954998-2331506602192454195-
	 * 6289809340859840907-2870843190515945602redseeds_uid
	 */
	public void setInputVisitID(Long inputVisitID){
		this.inputVisitID = inputVisitID;
	}

	/**
	 * 
	 * @param visitDataDTO    redseeds_uid3711224717007587167-362130094767136595--
	 * 7772558999844595546--2860867744332558243redseeds_uid
	 */
	public void setVisitDataDTO(VisitDataDTO visitDataDTO){
		this.visitDataDTO = visitDataDTO;
	}

	public void updateVisitTriggered(){
		int result6;
		result6 = service.validateVisitData(visitDataDTO);
		if (result6 == 1) { /* data valid [1] */
		    service.updateVisitData(visitDataDTO);
		    view.showVisitUpdatedMessage(this);
		}
		else if (result6 == 0) { /* data invalid [0] */
		    view.showWrongVisitDataMessage(this);
		}
	
	}

	public void visitUpdatedMessageOKTriggered(){
		setUseCaseResult(1);
		finalizeUseCase();
	
	}

	public void wrongVisitDataMessageOKTriggered(){
		view.closeVisitForm();
		pageClosed();
		setUseCaseResult(0);
		finalizeUseCase();
	
	}

}