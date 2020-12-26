package app.presenter.petsAndOwners;
import app.presenter.AbstractUseCasePresenter;
import app.presenter.visits.CreateNewVisitPresenter;
import app.presenter.visits.ShowVisitsForPetPresenter;
import app.dto.PetListItemDTO;
import java.util.List;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
public class ShowPetsPresenter extends AbstractUseCasePresenter {

	private Long inputOwnerID = null;
	private Long invokePetID = null;
	private List<PetListItemDTO> petListDTO = null;
	private CreateNewVisitPresenter createNewVisitPresenter;
	private DeletePetPresenter deletePetPresenter;
	private ShowVisitsForPetPresenter showVisitsForPetPresenter;

	public ShowPetsPresenter(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public Long getInputOwnerID(){
		return this.inputOwnerID;
	}

	public Long getInvokePetID(){
		return this.invokePetID;
	}

	public List<PetListItemDTO> getPetListDTO(){
		return this.petListDTO;
	}

	/**
	 * 
	 * @param invokingPresenter    redseeds_uid-4681410643488844292-
	 * 8003054256741461793--2943606110131800269--3425017452421967894redseeds_uid
	 */
	public void invoke(AbstractUseCasePresenter invokingPresenter){
		super.invoke(invokingPresenter);
		showPetsTriggered();
	}

	/**
	 * 
	 * @param resumeId    redseeds_uid1688166635658677352--6905244979459636714-
	 * 1985542323383591906-4142213455425322489redseeds_uid
	 */
	public void invokeCreateNewVisit(int resumeId){
		createNewVisitPresenter = (CreateNewVisitPresenter) beanFactory.getBean("createNewVisitPresenter");
		createNewVisitPresenter.setInputPetID(invokePetID);
		this.setResumeId(resumeId);
		createNewVisitPresenter.invoke(this);
	}

	public void invokeCreateNewVisit(){
		invokeCreateNewVisit(-1);
	}

	/**
	 * 
	 * @param resumeId    redseeds_uid-4984917031620621443-3557077271047758874--
	 * 3403358796870790532-1268417009282850503redseeds_uid
	 */
	public void invokeDeletePet(int resumeId){
		deletePetPresenter = (DeletePetPresenter) beanFactory.getBean("deletePetPresenter");
		deletePetPresenter.setInputPetID(invokePetID);
		this.setResumeId(resumeId);
		deletePetPresenter.invoke(this);
	}

	public void invokeDeletePet(){
		invokeDeletePet(-1);
	}

	/**
	 * 
	 * @param resumeId    redseeds_uid6016336419615066923--2398748159812609941-
	 * 6470675182505472574-3279922570804080773redseeds_uid
	 */
	public void invokeShowVisitsForPet(int resumeId){
		showVisitsForPetPresenter = (ShowVisitsForPetPresenter) beanFactory.getBean("showVisitsForPetPresenter");
		showVisitsForPetPresenter.setInputPetID(invokePetID);
		this.setResumeId(resumeId);
		showVisitsForPetPresenter.invoke(this);
	}

	public void invokeShowVisitsForPet(){
		invokeShowVisitsForPet(-1);
	}

	/**
	 * 
	 * @param invocationResult    redseeds_uid283613783429447018--1203507738843937779--
	 * 5139178327385383594-5332962979212000732redseeds_uid
	 */
	public void resumeUseCase(int invocationResult){

	}

	/**
	 * 
	 * @param inputOwnerID    redseeds_uid4151331025607855493--9172664815581122744-
	 * 1370473308446836245-571028256179839454redseeds_uid
	 */
	public void setInputOwnerID(Long inputOwnerID){
		this.inputOwnerID = inputOwnerID;
	}

	/**
	 * 
	 * @param invokePetID    redseeds_uid-2524597872646191333--1659850066863752542--
	 * 2538759779962163767--7887051031339471454redseeds_uid
	 */
	public void setInvokePetID(Long invokePetID){
		this.invokePetID = invokePetID;
	}

	/**
	 * 
	 * @param petListDTO    redseeds_uid-2825980931970383761--720870621381939336--
	 * 163612901724703288-2096252151704159662redseeds_uid
	 */
	public void setPetListDTO(List<PetListItemDTO> petListDTO){
		this.petListDTO = petListDTO;
	}

	public void showPetsTriggered(){
		petListDTO = service.readPetList(inputOwnerID);
		view.showOwnersPetsScreen(this);
		pageOpened();
		setUseCaseResult(1);
		finalizeUseCase();
	
	}

}