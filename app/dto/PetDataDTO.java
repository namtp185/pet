package app.dto;
import java.util.Date;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:33
 */
public class PetDataDTO {

	private Float age = null;
	private Date birthDate = null;
	private String city = null;
	private String name = null;
	private String ownerFirstName = null;
	private Long ownerID = null;
	private String ownerLastName = null;
	private Long petID = null;
	private Long petTypeID = null;
	private String typeName = null;



	public void finalize() throws Throwable {

	}

	public PetDataDTO(){

	}

	public Float getAge(){
		return age;
	
	}

	public Date getBirthDate(){
		return birthDate;
	
	}

	public String getCity(){
		return city;
	
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

	public String getTypeName(){
		return typeName;
	
	}

	/**
	 * 
	 * @param age    redseeds_uid-6473839362518358560--8841441049453513198-
	 * 1067562868987011703-3246117009212593610redseeds_uid
	 */
	public void setAge(Float age){
		this.age = age;
	
	}

	/**
	 * 
	 * @param birthDate    redseeds_uid8816765609300460273--2106263504946284316--
	 * 7067483304109637025-8071358638124086179redseeds_uid
	 */
	public void setBirthDate(Date birthDate){
		this.birthDate = birthDate;
	
	}

	/**
	 * 
	 * @param city    redseeds_uid-6926580831438110655--2111069565919686426--
	 * 6776310069280054169-5907992275129210640redseeds_uid
	 */
	public void setCity(String city){
		this.city = city;
	
	}

	/**
	 * 
	 * @param name    redseeds_uid-4401391041045262916--5372312033125468029-
	 * 8802254615428709456--2919643210798623497redseeds_uid
	 */
	public void setName(String name){
		this.name = name;
	
	}

	/**
	 * 
	 * @param ownerFirstName    redseeds_uid1608758443116750391--8960974679129692205-
	 * 220130838969976670-5145372361983526421redseeds_uid
	 */
	public void setOwnerFirstName(String ownerFirstName){
		this.ownerFirstName = ownerFirstName;
	
	}

	/**
	 * 
	 * @param ownerID    redseeds_uid1467494430232959355--8937579482425702524--
	 * 7005266375656841871--5317063581051829007redseeds_uid
	 */
	public void setOwnerID(Long ownerID){
		this.ownerID = ownerID;
	
	}

	/**
	 * 
	 * @param ownerLastName    redseeds_uid-7762289706227449264-4104785378153587898--
	 * 184945215656372355--2395599636040501069redseeds_uid
	 */
	public void setOwnerLastName(String ownerLastName){
		this.ownerLastName = ownerLastName;
	
	}

	/**
	 * 
	 * @param petID    redseeds_uid-3360004185352256815-5975691124914257165-
	 * 3653696738127332451--729852404059916540redseeds_uid
	 */
	public void setPetID(Long petID){
		this.petID = petID;
	
	}

	/**
	 * 
	 * @param petTypeID    redseeds_uid-4090459458554936778--1348842943221902495-
	 * 3595031228675128067-159799307783929655redseeds_uid
	 */
	public void setPetTypeID(Long petTypeID){
		this.petTypeID = petTypeID;
	
	}

	/**
	 * 
	 * @param typeName    redseeds_uid3668364863339271604-7305022266358642695-
	 * 7179833660709797655-1746307707635633120redseeds_uid
	 */
	public void setTypeName(String typeName){
		this.typeName = typeName;
	
	}

}