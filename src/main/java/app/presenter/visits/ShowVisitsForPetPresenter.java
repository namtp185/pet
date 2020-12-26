package app.presenter.visits;
import app.presenter.AbstractUseCasePresenter;
import app.dto.PetDataDTO;
import java.util.List;
import app.dto.VisitListItemDTO;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
public class ShowVisitsForPetPresenter extends AbstractUseCasePresenter {

	private Long inputPetID = null;
	private Long invokeVisitID = null;
	private PetDataDTO petDataDTO = null;
	private List<VisitListItemDTO> visitListDTO = null;
	private ShowVisitDetailsPresenter showVisitDetailsPresenter;
	private EditVisitPresenter editVisitPresenter;

	public ShowVisitsForPetPresenter(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public Long getInputPetID(){
		return this.inputPetID;
	}

	public Long getInvokeVisitID(){
		return this.invokeVisitID;
	}

	public PetDataDTO getPetDataDTO(){
		return this.petDataDTO;
	}

	public List<VisitListItemDTO> getVisitListDTO(){
		return this.visitListDTO;
	}

	/**
	 * 
	 * @param invokingPresenter    redseeds_uid-4428316006447698357--
	 * 8768089750129773245--6705450485746208394-960147311940367053redseeds_uid
	 */
	public void invoke(AbstractUseCasePresenter invokingPresenter){
		super.invoke(invokingPresenter);
		showVisitsTriggered();
	}

	public void invokeEditVisit(){
		invokeEditVisit(-1);
	}

	/**
	 * 
	 * @param resumeId    redseeds_uid-3971393783529105539--3743065136402233353-
	 * 5308141128602270896-8598578126727272787redseeds_uid
	 */
	public void invokeEditVisit(int resumeId){
		editVisitPresenter = (EditVisitPresenter) beanFactory.getBean("editVisitPresenter");
		editVisitPresenter.setInputVisitID(invokeVisitID);
		this.setResumeId(resumeId);
		editVisitPresenter.invoke(this);
	}

	/**
	 * 
	 * @param resumeId    redseeds_uid-1163345898400102352--516956907018333244--
	 * 3817862423614490920--6158977447060552712redseeds_uid
	 */
	public void invokeShowVisitDetails(int resumeId){
		showVisitDetailsPresenter = (ShowVisitDetailsPresenter) beanFactory.getBean("showVisitDetailsPresenter");
		showVisitDetailsPresenter.setInputVisitID(invokeVisitID);
		this.setResumeId(resumeId);
		showVisitDetailsPresenter.invoke(this);
	}

	public void invokeShowVisitDetails(){
		invokeShowVisitDetails(-1);
	}

	public void noVisitsFoundMessageOKTriggered(){
		setUseCaseResult(0);
		finalizeUseCase();
	
	}

	/**
	 * 
	 * @param invocationResult    redseeds_uid-4991307146436903833-427284512103202716-
	 * 1195105411333187447--1734259496158834136redseeds_uid
	 */
	public void resumeUseCase(int invocationResult){

	}

	/**
	 * 
	 * @param inputPetID    redseeds_uid4184669273296025169--7557689974703317764-
	 * 8739582232129901484--7479035447620459768redseeds_uid
	 */
	public void setInputPetID(Long inputPetID){
		this.inputPetID = inputPetID;
	}

	/**
	 * 
	 * @param invokeVisitID    redseeds_uid6343284576408528885--1263689725522944127--
	 * 8845668417634705130-5320891762310610553redseeds_uid
	 */
	public void setInvokeVisitID(Long invokeVisitID){
		this.invokeVisitID = invokeVisitID;
	}

	/**
	 * 
	 * @param petDataDTO    redseeds_uid4494950417920198732-7618836664709988620-
	 * 3330553096886418198-2274660762089068125redseeds_uid
	 */
	public void setPetDataDTO(PetDataDTO petDataDTO){
		this.petDataDTO = petDataDTO;
	}

	/**
	 * 
	 * @param visitListDTO    redseeds_uid6583224599060192049--8548711472098893309-
	 * 2929167013475984452--5343183356835788256redseeds_uid
	 */
	public void setVisitListDTO(List<VisitListItemDTO> visitListDTO){
		this.visitListDTO = visitListDTO;
	}

	public void showVisitsTriggered(){
		petDataDTO = service.readPetData(inputPetID);
		visitListDTO = service.readVisitList(inputPetID);
		if (!visitListDTO.isEmpty()) { /* list is not empty [1] */
		    view.showVisitListScreen(this);
		    pageOpened();
		    setUseCaseResult(1);
		    finalizeUseCase();
		}
		else if (visitListDTO.isEmpty()) { /* list is empty [0] */
		    view.showNoVisitsFoundMessage(this);
		}
	
	}

}