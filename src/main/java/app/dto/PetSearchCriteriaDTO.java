package app.dto;
import java.util.Date;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
public class PetSearchCriteriaDTO {

	private Date birthDate = null;
	private String name = null;
	private Long ownerID = null;
	private String ownerLastName = null;
	private Long petID = null;
	private Long petTypeID = null;
	private String typeName = null;



	public void finalize() throws Throwable {

	}

	public PetSearchCriteriaDTO(){

	}

	public Date getBirthDate(){
		return birthDate;
	
	}

	public String getName(){
		return name;
	
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
	 * @param birthDate    redseeds_uid-1036811859330229331--6145683065338369188--
	 * 7615786739273436875-963984473922399014redseeds_uid
	 */
	public void setBirthDate(Date birthDate){
		this.birthDate = birthDate;
	
	}

	/**
	 * 
	 * @param name    redseeds_uid-5300240255006843371-5341100884143793678--
	 * 4934168576524818244-7501557856210300974redseeds_uid
	 */
	public void setName(String name){
		this.name = name;
	
	}

	/**
	 * 
	 * @param ownerID    redseeds_uid-3587661253666950208--3971840536260156324-
	 * 8688356612726113848-1324589730062184763redseeds_uid
	 */
	public void setOwnerID(Long ownerID){
		this.ownerID = ownerID;
	
	}

	/**
	 * 
	 * @param ownerLastName    redseeds_uid6593175766759699523--5631972511124035109-
	 * 3854170787553108178-6101768329258999921redseeds_uid
	 */
	public void setOwnerLastName(String ownerLastName){
		this.ownerLastName = ownerLastName;
	
	}

	/**
	 * 
	 * @param petID    redseeds_uid7404240020780250218-1271347392091197223--
	 * 6272653520020937337--1038117646045616930redseeds_uid
	 */
	public void setPetID(Long petID){
		this.petID = petID;
	
	}

	/**
	 * 
	 * @param petTypeID    redseeds_uid-7871060017727384358--2264316036628045370-
	 * 4783960807917730487--3668015018500512586redseeds_uid
	 */
	public void setPetTypeID(Long petTypeID){
		this.petTypeID = petTypeID;
	
	}

	/**
	 * 
	 * @param typeName    redseeds_uid-5296207156988531517-5765441256294883696-
	 * 3485064728261630961-457621462897530504redseeds_uid
	 */
	public void setTypeName(String typeName){
		this.typeName = typeName;
	
	}

}