package app.dto;
import java.util.List;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:35
 */
public class VeterinarianListItemDTO {

	private String firstName = null;
	private String lastName = null;
	private String mobileNumber = null;
	private List<Long> specialityIDList = null;
	private List<String> specialityNameList = null;
	private Long veterinarianID = null;



	public void finalize() throws Throwable {

	}

	public VeterinarianListItemDTO(){

	}

	public String getFirstName(){
		return firstName;
	
	}

	public String getLastName(){
		return lastName;
	
	}

	public String getMobileNumber(){
		return mobileNumber;
	
	}

	public List<Long> getSpecialityIDList(){
		return specialityIDList;
	
	}

	public List<String> getSpecialityNameList(){
		return specialityNameList;
	
	}

	public Long getVeterinarianID(){
		return veterinarianID;
	
	}

	/**
	 * 
	 * @param firstName    redseeds_uid3910087426771898012-8334198032841459519-
	 * 5465444499016543115--3907236189357841327redseeds_uid
	 */
	public void setFirstName(String firstName){
		this.firstName = firstName;
	
	}

	/**
	 * 
	 * @param lastName    redseeds_uid2785637567704575019--3456070880271987281-
	 * 7095012461922688117-9199278660312602220redseeds_uid
	 */
	public void setLastName(String lastName){
		this.lastName = lastName;
	
	}

	/**
	 * 
	 * @param mobileNumber    redseeds_uid848083891336644952-3584266797595786705-
	 * 709848457158905433--7511085616543218145redseeds_uid
	 */
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber = mobileNumber;
	
	}

	/**
	 * 
	 * @param specialityIDList    redseeds_uid-2921210874193578662-7901679937271342373-
	 * -2236433755720833311-8047451428391163733redseeds_uid
	 */
	public void setSpecialityIDList(List<Long> specialityIDList){
		this.specialityIDList = specialityIDList;
	
	}

	/**
	 * 
	 * @param specialityNameList    redseeds_uid488219414898108297--
	 * 4550166423860074682-1790032936645196484-604999208140485680redseeds_uid
	 */
	public void setSpecialityNameList(List<String> specialityNameList){
		this.specialityNameList = specialityNameList;
	
	}

	/**
	 * 
	 * @param veterinarianID    redseeds_uid-5339626406019520905--4244649350050847829-
	 * 6566162182420514285--869401614034685900redseeds_uid
	 */
	public void setVeterinarianID(Long veterinarianID){
		this.veterinarianID = veterinarianID;
	
	}

}