package app.presenter.petsAndOwners;
import app.presenter.AbstractUseCasePresenter;
import app.presenter.visits.CreateNewVisitPresenter;
import app.presenter.visits.ShowVisitsForPetPresenter;
import app.dto.PetSearchCriteriaDTO;
import java.util.List;
import app.dto.PetListItemDTO;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:31
 */
public class FindPetPresenter extends AbstractUseCasePresenter {

	private Long invokePetID = null;
	private List<PetListItemDTO> petListDTO = null;
	private PetSearchCriteriaDTO petSearchCriteriaDTO = null;
	private CreateNewVisitPresenter createNewVisitPresenter;
	private AddNewPetPresenter addNewPetPresenter;
	private ShowVisitsForPetPresenter showVisitsForPetPresenter;

	public FindPetPresenter(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void findPetTriggered(){
		view.showPetSearchForm(this);
		pageOpened();
	
	}

	public Long getInvokePetID(){
		return this.invokePetID;
	}

	public List<PetListItemDTO> getPetListDTO(){
		return this.petListDTO;
	}

	public PetSearchCriteriaDTO getPetSearchCriteriaDTO(){
		return this.petSearchCriteriaDTO;
	}

	/**
	 * 
	 * @param invokingPresenter    redseeds_uid7111336724771001350-950101019266362129-
	 * 4673627007050821407-4364102210917813129redseeds_uid
	 */
	public void invoke(AbstractUseCasePresenter invokingPresenter){
		super.invoke(invokingPresenter);
		findPetTriggered();
	}

	/**
	 * 
	 * @param resumeId    redseeds_uid8835238535932769710-6440241867283394174--
	 * 9142367283609584797--2563259629038558242redseeds_uid
	 */
	public void invokeAddNewPet(int resumeId){
		addNewPetPresenter = (AddNewPetPresenter) beanFactory.getBean("addNewPetPresenter");
		//TODO: see what is set input
//		addNewPetPresenter.setInput();
		this.setResumeId(resumeId);
		addNewPetPresenter.invoke(this);
	}

	public void invokeAddNewPet(){
		invokeAddNewPet(-1);
	}

	/**
	 * 
	 * @param resumeId    redseeds_uid5901907848848375286--2907747473513928337-
	 * 5976501245900660293-1086628649803840890redseeds_uid
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

	public void invokeShowVisitsForPet(){
		invokeShowVisitsForPet(-1);
	}

	/**
	 * 
	 * @param resumeId    redseeds_uid1503428428882460950-2883401972758397954-
	 * 1104215106906659253-6521451897788997472redseeds_uid
	 */
	public void invokeShowVisitsForPet(int resumeId){
		showVisitsForPetPresenter = (ShowVisitsForPetPresenter) beanFactory.getBean("showVisitsForPetPresenter");
		showVisitsForPetPresenter.setInputPetID(invokePetID);
		this.setResumeId(resumeId);
		showVisitsForPetPresenter.invoke(this);
	}

	public void noPetsFoundMessageNoTriggered(){
		view.closePetSearchForm();
		pageClosed();
		setUseCaseResult(0);
		finalizeUseCase();
	
	}

	public void noPetsFoundMessageYesTriggered(){

	}

	/**
	 * 
	 * @param invocationResult    redseeds_uid-8522965254137197497-9199261989797667727-
	 * -5826311938638308378--1210081130394989080redseeds_uid
	 */
	public void resumeUseCase(int invocationResult){

	}

	public void seekPetTriggered(){
		petListDTO = service.readPetList(petSearchCriteriaDTO);
		if (!petListDTO.isEmpty()) { /* pets found [1] */
		    view.closePetSearchForm();
		    pageClosed();
		    view.showPetListScreen(this);
		    pageOpened();
		    setUseCaseResult(1);
		    finalizeUseCase();
		}
		else if (petListDTO.isEmpty()) { /* no pets found [0] */
		    view.showNoPetsFoundMessage(this);
		}
	
	}

	/**
	 * 
	 * @param invokePetID    redseeds_uid-2475115276326751196-7083512391688937295-
	 * 7029591908183867532-221101388695338785redseeds_uid
	 */
	public void setInvokePetID(Long invokePetID){
		this.invokePetID = invokePetID;
	}

	/**
	 * 
	 * @param petListDTO    redseeds_uid-3806520497911401405-6622219748268127984-
	 * 5007996038195228465--3281126726198947458redseeds_uid
	 */
	public void setPetListDTO(List<PetListItemDTO> petListDTO){
		this.petListDTO = petListDTO;
	}

	/**
	 * 
	 * @param petSearchCriteriaDTO    redseeds_uid-6382702736412361368-
	 * 3855550140138795643--5308141647864380060--8442065605611140050redseeds_uid
	 */
	public void setPetSearchCriteriaDTO(PetSearchCriteriaDTO petSearchCriteriaDTO){
		this.petSearchCriteriaDTO = petSearchCriteriaDTO;
	}

}