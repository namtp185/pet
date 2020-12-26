package app.presenter.petsAndOwners;
import app.presenter.AbstractUseCasePresenter;
import app.dto.PetDataDTO;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:30
 */
public class AddNewPetPresenter extends AbstractUseCasePresenter {

	private PetDataDTO petDataDTO = null;
	private AddNewOwnerPresenter addNewOwnerPresenter;

	public AddNewPetPresenter(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void addNewPetTriggered(){
		view.showNewPetForm(this);
		pageOpened();
	
	}

	public PetDataDTO getPetDataDTO(){
		return this.petDataDTO;
	}

	public void invalidPetDataMessageOKTriggered(){

	}

	/**
	 * 
	 * @param invokingPresenter    redseeds_uid1004931545036456652--
	 * 2380848142938390842-5222775342213347594--8230110672286789823redseeds_uid
	 */
	public void invoke(AbstractUseCasePresenter invokingPresenter){
		super.invoke(invokingPresenter);
		addNewPetTriggered();
	}

	/**
	 * 
	 * @param resumeId    redseeds_uid-8315688954777776062--7001620892326406720--
	 * 1924985323611806008-7564844746621206612redseeds_uid
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

	public void petAddedMessageOKTriggered(){
		view.closeNewPetForm();
		pageClosed();
		setUseCaseResult(1);
		finalizeUseCase();
	
	}

	/**
	 * 
	 * @param invocationResult    redseeds_uid-5868152744862100035--566829840381549020-
	 * 3646770666218883726--5340156212903507728redseeds_uid
	 */
	public void resumeUseCase(int invocationResult){

	}

	public void savePetTriggered(){
		int result6;
		result6 = service.validatePetData(petDataDTO);
		if (result6 == 1) { /* pet data correct [1] */
		    service.createPetData(petDataDTO);
		    view.showPetAddedMessage(this);
		}
		else if (result6 == 0) { /* incorrect pet data [0] */
		    view.showInvalidPetDataMessage(this);
		}
	
	}

	/**
	 * 
	 * @param petDataDTO    redseeds_uid9210910625987579915-5161087477878052692--
	 * 6422669177597906920-7098265422190393881redseeds_uid
	 */
	public void setPetDataDTO(PetDataDTO petDataDTO){
		this.petDataDTO = petDataDTO;
	}

}