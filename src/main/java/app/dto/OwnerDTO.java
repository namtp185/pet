package app.dto;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:33
 */
public class OwnerDTO {

	private String address = null;
	private String city = null;
	private String email = null;
	private String ownerFirstName = null;
	private Long ownerID = null;
	private String ownerLastName = null;
	private String phoneNumber = null;



	public void finalize() throws Throwable {

	}

	public OwnerDTO(){

	}

	public String getAddress(){
		return address;
	
	}

	public String getCity(){
		return city;
	
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
	 * @param address    redseeds_uid-4563017489057311003--2066628041460435186--
	 * 2998593470919708555-1779899078727187904redseeds_uid
	 */
	public void setAddress(String address){
		this.address = address;
	
	}

	/**
	 * 
	 * @param city    redseeds_uid2260305949656662029-6719608177936934466-
	 * 4149693108140076031-8799537701733659662redseeds_uid
	 */
	public void setCity(String city){
		this.city = city;
	
	}

	/**
	 * 
	 * @param email    redseeds_uid-3721834686841653105--603992482025917545-
	 * 1350734905348953348-5101874830090627254redseeds_uid
	 */
	public void setEmail(String email){
		this.email = email;
	
	}

	/**
	 * 
	 * @param ownerFirstName    redseeds_uid6132257673151575831--5316351259429357488--
	 * 4569618765725729066-5859391272972772850redseeds_uid
	 */
	public void setOwnerFirstName(String ownerFirstName){
		this.ownerFirstName = ownerFirstName;
	
	}

	/**
	 * 
	 * @param ownerID    redseeds_uid-5738712051593792724--6770373275146121321--
	 * 6228330258880634028-3005888806631314506redseeds_uid
	 */
	public void setOwnerID(Long ownerID){
		this.ownerID = ownerID;
	
	}

	/**
	 * 
	 * @param ownerLastName    redseeds_uid-7169747916486150889--795325882976830390-
	 * 2088860843672779040--1461631636033325398redseeds_uid
	 */
	public void setOwnerLastName(String ownerLastName){
		this.ownerLastName = ownerLastName;
	
	}

	/**
	 * 
	 * @param phoneNumber    redseeds_uid-178785943671444695--7130014960238235973--
	 * 4283141460705749632-5299992775370008866redseeds_uid
	 */
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	
	}

}