package app.dto;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:33
 */
public class OwnerListItemDTO {

	private String email = null;
	private String ownerFirstName = null;
	private Long ownerID = null;
	private String ownerLastName = null;
	private String phoneNumber = null;



	public void finalize() throws Throwable {

	}

	public OwnerListItemDTO(){

	}

	public String getEmail(){
		return email;
	
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

	public String getPhoneNumber(){
		return phoneNumber;
	
	}

	/**
	 * 
	 * @param email    redseeds_uid-2367552791677778198-1995487824454968347-
	 * 1418876338126818856--3468633834351599277redseeds_uid
	 */
	public void setEmail(String email){
		this.email = email;
	
	}

	/**
	 * 
	 * @param ownerFirstName    redseeds_uid-7110982749334858203--8050343382110035535--
	 * 2581682948805281374-8974200185584966279redseeds_uid
	 */
	public void setOwnerFirstName(String ownerFirstName){
		this.ownerFirstName = ownerFirstName;
	
	}

	/**
	 * 
	 * @param ownerID    redseeds_uid-1884073399742158432-9013166308356913611--
	 * 5672266937643674371--7364077226345889584redseeds_uid
	 */
	public void setOwnerID(Long ownerID){
		this.ownerID = ownerID;
	
	}

	/**
	 * 
	 * @param ownerLastName    redseeds_uid-3914022029127719146-4501505489977641646-
	 * 5103628229170854946--3537338774763839038redseeds_uid
	 */
	public void setOwnerLastName(String ownerLastName){
		this.ownerLastName = ownerLastName;
	
	}

	/**
	 * 
	 * @param phoneNumber    redseeds_uid7924806875763909698-6492881126468007188-
	 * 1600532623472548127-5586066336229139967redseeds_uid
	 */
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	
	}

}