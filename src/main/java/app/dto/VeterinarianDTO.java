package app.dto;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:35
 */
public class VeterinarianDTO {

	private String firstName = null;
	private String lastName = null;
	private String mobileNumber = null;
	private Long veterinarianID = null;



	public void finalize() throws Throwable {

	}

	public VeterinarianDTO(){

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

	public Long getVeterinarianID(){
		return veterinarianID;
	
	}

	/**
	 * 
	 * @param firstName    redseeds_uid8228632230842718175-8340587615508466693-
	 * 2614552806216376818-4284865735134636752redseeds_uid
	 */
	public void setFirstName(String firstName){
		this.firstName = firstName;
	
	}

	/**
	 * 
	 * @param lastName    redseeds_uid-3292743502744217418--262120594553467468-
	 * 1033830764752589860-7838008145179568036redseeds_uid
	 */
	public void setLastName(String lastName){
		this.lastName = lastName;
	
	}

	/**
	 * 
	 * @param mobileNumber    redseeds_uid6817180194924788955--6905796926548610240--
	 * 5536436821875276482-8685455474597631640redseeds_uid
	 */
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber = mobileNumber;
	
	}

	/**
	 * 
	 * @param veterinarianID    redseeds_uid-8723470955313040555--7246612771948540613-
	 * 3349671303839556690-8395574665896067156redseeds_uid
	 */
	public void setVeterinarianID(Long veterinarianID){
		this.veterinarianID = veterinarianID;
	
	}

}