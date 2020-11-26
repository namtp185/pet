package app.dto;
import java.util.Date;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:36
 */
public class VisitDataDTO {

	private Date date = null;
	private String description = null;
	private String firstName = null;
	private Boolean isFirstVisit = null;
	private String lastName = null;
	private Long veterinarianID = null;
	private Long visitID = null;



	public void finalize() throws Throwable {

	}

	public VisitDataDTO(){

	}

	public Date getDate(){
		return date;
	
	}

	public String getDescription(){
		return description;
	
	}

	public String getFirstName(){
		return firstName;
	
	}

	public Boolean getIsFirstVisit(){
		return isFirstVisit;
	
	}

	public String getLastName(){
		return lastName;
	
	}

	public Long getVeterinarianID(){
		return veterinarianID;
	
	}

	public Long getVisitID(){
		return visitID;
	
	}

	/**
	 * 
	 * @param date    redseeds_uid-3900208955492908031--5415879033631669868--
	 * 2633366988640034846--6217361444943587redseeds_uid
	 */
	public void setDate(Date date){
		this.date = date;
	
	}

	/**
	 * 
	 * @param description    redseeds_uid9097744016870965662-4378148484447025821--
	 * 7055267751184471528-1437138572654608293redseeds_uid
	 */
	public void setDescription(String description){
		this.description = description;
	
	}

	/**
	 * 
	 * @param firstName    redseeds_uid-6014174647680319423--7762476672750784851--
	 * 6640459444152250403-5673896290598590317redseeds_uid
	 */
	public void setFirstName(String firstName){
		this.firstName = firstName;
	
	}

	/**
	 * 
	 * @param isFirstVisit    redseeds_uid1805281084808221056-4451460932256592964--
	 * 8382150256135636828--8569959944762622140redseeds_uid
	 */
	public void setIsFirstVisit(Boolean isFirstVisit){
		this.isFirstVisit = isFirstVisit;
	
	}

	/**
	 * 
	 * @param lastName    redseeds_uid4357687406721185901--5826675541318090328--
	 * 7917368918666161377-5506729716678871856redseeds_uid
	 */
	public void setLastName(String lastName){
		this.lastName = lastName;
	
	}

	/**
	 * 
	 * @param veterinarianID    redseeds_uid-8419398740760513298-1846748608895330125-
	 * 1718239616581364507-3773682564805022476redseeds_uid
	 */
	public void setVeterinarianID(Long veterinarianID){
		this.veterinarianID = veterinarianID;
	
	}

	/**
	 * 
	 * @param visitID    redseeds_uid4752599869782022128--5243940993173344116-
	 * 5261534010287013436--559218501896175073redseeds_uid
	 */
	public void setVisitID(Long visitID){
		this.visitID = visitID;
	
	}

}