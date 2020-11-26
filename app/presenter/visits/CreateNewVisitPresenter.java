package app.presenter.visits;
import app.presenter.AbstractUseCasePresenter;
import app.dto.PetDataDTO;
import app.dto.VisitDataDTO;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:30
 */
public class CreateNewVisitPresenter extends AbstractUseCasePresenter {

	private Long inputPetID = null;
	private PetDataDTO petDataDTO = null;
	private VisitDataDTO visitDataDTO = null;

	public CreateNewVisitPresenter(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void createNewVisitTriggered(){
		petDataDTO = service.readPetData(inputPetID);
		view.showNewVisitForm(this);
		pageOpened();
	
	}

	public Long getInputPetID(){
		return this.inputPetID;
	}

	public PetDataDTO getPetDataDTO(){
		return this.petDataDTO;
	}

	public VisitDataDTO getVisitDataDTO(){
		return this.visitDataDTO;
	}

	public void invalidVisitDataMessageOKTriggered(){

	}

	/**
	 * 
	 * @param invokingPresenter    redseeds_uid2505333099973747937--
	 * 7648302657239358895--701288155762970066--5625637125159629562redseeds_uid
	 */
	public void invoke(AbstractUseCasePresenter invokingPresenter){
		super.invoke(invokingPresenter);
		createNewVisitTriggered();
	}

	/**
	 * 
	 * @param invocationResult    redseeds_uid552128554660153414--5546257822509328709-
	 * 6490945037603029962--5200603622293908404redseeds_uid
	 */
	public void resumeUseCase(int invocationResult){

	}

	public void saveVisitTriggered(){
		int result6;
		result6 = service.validateVisitData(visitDataDTO);
		if (result6 == 1) { /* data correct [1] */
		    service.createVisitData(visitDataDTO);
		    view.showVisitAddedConfirmation(this);
		}
		else if (result6 == 0) { /* data incorrect [0] */
		    view.showInvalidVisitDataMessage(this);
		}
	
	}

	/**
	 * 
	 * @param inputPetID    redseeds_uid-6970244472399517162--8922128746247163809-
	 * 1195515231953925934-4383381708127275646redseeds_uid
	 */
	public void setInputPetID(Long inputPetID){
		this.inputPetID = inputPetID;
	}

	/**
	 * 
	 * @param petDataDTO    redseeds_uid6004915194284215073--1807089611454715983-
	 * 6489371848587039398--3366254459691312066redseeds_uid
	 */
	public void setPetDataDTO(PetDataDTO petDataDTO){
		this.petDataDTO = petDataDTO;
	}

	/**
	 * 
	 * @param visitDataDTO    redseeds_uid6979673273952399250--4506928508188504632--
	 * 6398561184069105328--2643446020641567926redseeds_uid
	 */
	public void setVisitDataDTO(VisitDataDTO visitDataDTO){
		this.visitDataDTO = visitDataDTO;
	}

	public void visitAddedConfirmationOKTriggered(){
		view.closeNewVisitForm();
		pageClosed();
		setUseCaseResult(1);
		finalizeUseCase();
	
	}

}