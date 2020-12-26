package app.dto;
import java.util.List;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:35
 */
public class VeterinarianDataDTO {

	private String firstName = null;
	private String lastName = null;
	private String mobileNumber = null;
	private List<Integer> specialityCodeList = null;
	private List<Long> specialityIDList = null;
	private List<String> specialityNameList = null;
	private Long veterinarianID = null;



	public void finalize() throws Throwable {

	}

	public VeterinarianDataDTO(){

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

	public List<Integer> getSpecialityCodeList(){
		return specialityCodeList;
	
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
	 * @param firstName    redseeds_uid244515066785544212-3666142749657074851-
	 * 3419237208891360748--3163528198194142917redseeds_uid
	 */
	public void setFirstName(String firstName){
		this.firstName = firstName;
	
	}

	/**
	 * 
	 * @param lastName    redseeds_uid-488392106842525088-499997130946265942--
	 * 5207340354085391442-3583297363458870147redseeds_uid
	 */
	public void setLastName(String lastName){
		this.lastName = lastName;
	
	}

	/**
	 * 
	 * @param mobileNumber    redseeds_uid8024558381765331550--8367235366615380361-
	 * 4016771795124770325--4174857415755319425redseeds_uid
	 */
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber = mobileNumber;
	
	}

	/**
	 * 
	 * @param specialityCodeList    redseeds_uid6193332463973643509--
	 * 5993724413238784640--2653102586535139846--9102241511047384810redseeds_uid
	 */
	public void setSpecialityCodeList(List<Integer> specialityCodeList){
		this.specialityCodeList = specialityCodeList;
	
	}

	/**
	 * 
	 * @param specialityIDList    redseeds_uid-5764178589629483390-1761903485135505560-
	 * -8596395224712393617-5568722263173706072redseeds_uid
	 */
	public void setSpecialityIDList(List<Long> specialityIDList){
		this.specialityIDList = specialityIDList;
	
	}

	/**
	 * 
	 * @param specialityNameList    redseeds_uid4347835740899989034--
	 * 4416975696502336526-3981439773872650307-4530801043664587852redseeds_uid
	 */
	public void setSpecialityNameList(List<String> specialityNameList){
		this.specialityNameList = specialityNameList;
	
	}

	/**
	 * 
	 * @param veterinarianID    redseeds_uid171548445000766622--7259190508985480305-
	 * 9029241555487595786-1452583373900195869redseeds_uid
	 */
	public void setVeterinarianID(Long veterinarianID){
		this.veterinarianID = veterinarianID;
	
	}

}