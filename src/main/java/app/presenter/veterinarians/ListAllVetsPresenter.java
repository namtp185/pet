package app.presenter.veterinarians;
import app.presenter.AbstractUseCasePresenter;
import java.util.List;
import app.dto.VeterinarianListItemDTO;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:32
 */
public class ListAllVetsPresenter extends AbstractUseCasePresenter {

	private Long invokeVeterinarianID = null;
	private List<VeterinarianListItemDTO> veterinarianListDTO = null;
	private EditVetPresenter editVetPresenter;

	public ListAllVetsPresenter(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public Long getInvokeVeterinarianID(){
		return this.invokeVeterinarianID;
	}

	public List<VeterinarianListItemDTO> getVeterinarianListDTO(){
		return this.veterinarianListDTO;
	}

	/**
	 * 
	 * @param invokingPresenter    redseeds_uid5196680213562746344--
	 * 7907085277479639682--8266749862211705851-6265265832054738251redseeds_uid
	 */
	public void invoke(AbstractUseCasePresenter invokingPresenter){
		super.invoke(invokingPresenter);
		listAllVetsTriggered();
	}

	/**
	 * 
	 * @param resumeId    redseeds_uid2773031767403526881--6061551268475941077-
	 * 4479904688045391475-5337094241298769242redseeds_uid
	 */
	public void invokeEditVet(int resumeId){
		editVetPresenter = (EditVetPresenter) beanFactory.getBean("editVetPresenter");
		editVetPresenter.setInputVeterinarianID(invokeVeterinarianID);
		this.setResumeId(resumeId);
		editVetPresenter.invoke(this);
	}

	public void invokeEditVet(){
		invokeEditVet(-1);
	}

	public void listAllVetsTriggered(){
		veterinarianListDTO = service.readVeterinarianList();
		if (!veterinarianListDTO.isEmpty()) { /* vet list not empty [1] */
		    view.showVetListScreen(this);
		    pageOpened();
		    setUseCaseResult(1);
		    finalizeUseCase();
		}
		else if (veterinarianListDTO.isEmpty()) { /* vet list empty [0] */
		    view.showNoVetsFoundMessage(this);
		}
	
	}

	public void noVetsFoundMessageOKTriggered(){
		setUseCaseResult(0);
		finalizeUseCase();
	
	}

	/**
	 * 
	 * @param invocationResult    redseeds_uid7147824360014155375-5484261549455180984--
	 * 2471316063827709723--6852181152552895703redseeds_uid
	 */
	public void resumeUseCase(int invocationResult){

	}

	/**
	 * 
	 * @param invokeVeterinarianID    redseeds_uid-852830487983175529--
	 * 5147630235929478217-8289055985801225140-4347397691259686434redseeds_uid
	 */
	public void setInvokeVeterinarianID(Long invokeVeterinarianID){
		this.invokeVeterinarianID = invokeVeterinarianID;
	}

	/**
	 * 
	 * @param veterinarianListDTO    redseeds_uid-5801416341236143962--
	 * 4507774428627512141-4954934264332549142--6161577412309670553redseeds_uid
	 */
	public void setVeterinarianListDTO(List<VeterinarianListItemDTO> veterinarianListDTO){
		this.veterinarianListDTO = veterinarianListDTO;
	}

}