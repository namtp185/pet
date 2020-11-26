package app.dto;
import java.util.Date;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:33
 */
public class PetListItemDTO {

	private Date birthDate = null;
	private String name = null;
	private String ownerFirstName = null;
	private Long ownerID = null;
	private String ownerLastName = null;
	private Long petID = null;
	private Long petTypeID = null;
	private String phoneNumber = null;
	private String typeName = null;



	public void finalize() throws Throwable {

	}

	public PetListItemDTO(){

	}

	public Date getBirthDate(){
		return birthDate;
	
	}

	public String getName(){
		return name;
	
	}

	public String getOwnerFirstName(){
		return ownerFirstName;
	
	}

	public Long getOwnerID(){
		return ownerID;
	
	}

	public String getOwnerLastName(){
		return ownerLastName;
	
	}

	public Long getPetID(){
		return petID;
	
	}

	public Long getPetTypeID(){
		return petTypeID;
	
	}

	public String getPhoneNumber(){
		return phoneNumber;
	
	}

	public String getTypeName(){
		return typeName;
	
	}

	/**
	 * 
	 * @param birthDate    redseeds_uid8288555910212988693-8546015053622218965-
	 * 6285269931188512053-1265961067312555684redseeds_uid
	 */
	public void setBirthDate(Date birthDate){
		this.birthDate = birthDate;
	
	}

	/**
	 * 
	 * @param name    redseeds_uid8121584045355104871--2637428713957243788--
	 * 5763767587874318549--7418701520291863518redseeds_uid
	 */
	public void setName(String name){
		this.name = name;
	
	}

	/**
	 * 
	 * @param ownerFirstName    redseeds_uid5715427563062048305-8062810401626531908-
	 * 8362917828640653371-1833353749652903564redseeds_uid
	 */
	public void setOwnerFirstName(String ownerFirstName){
		this.ownerFirstName = ownerFirstName;
	
	}

	/**
	 * 
	 * @param ownerID    redseeds_uid7355159519919341498--8152815934262860077-
	 * 3086972139636882389--4686808419419654656redseeds_uid
	 */
	public void setOwnerID(Long ownerID){
		this.ownerID = ownerID;
	
	}

	/**
	 * 
	 * @param ownerLastName    redseeds_uid6182143756331987981-7217589374083102018-
	 * 305100140413007137--7140843529362408636redseeds_uid
	 */
	public void setOwnerLastName(String ownerLastName){
		this.ownerLastName = ownerLastName;
	
	}

	/**
	 * 
	 * @param petID    redseeds_uid-5270247981188492283-3214546528728515147--
	 * 8647444324899908413--8625383987396048595redseeds_uid
	 */
	public void setPetID(Long petID){
		this.petID = petID;
	
	}

	/**
	 * 
	 * @param petTypeID    redseeds_uid7694700230891520247--782683263870859321--
	 * 9217071633356756251--1494802772309064597redseeds_uid
	 */
	public void setPetTypeID(Long petTypeID){
		this.petTypeID = petTypeID;
	
	}

	/**
	 * 
	 * @param phoneNumber    redseeds_uid-2432009060227592359--7568397740531546525-
	 * 6552732293846896476--1041229524287344995redseeds_uid
	 */
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	
	}

	/**
	 * 
	 * @param typeName    redseeds_uid-5834722490409638474-5120784084348584172-
	 * 2553307450272638555--7979582631207716331redseeds_uid
	 */
	public void setTypeName(String typeName){
		this.typeName = typeName;
	
	}

}