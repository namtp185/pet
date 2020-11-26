package app.dto;
import java.util.Date;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:36
 */
public class VisitDetailsDTO {

	private Date birthDate = null;
	private Date date = null;
	private String description = null;
	private String firstName = null;
	private Boolean isFirstVisit = null;
	private String lastName = null;
	private String name = null;
	private Long petID = null;
	private Long veterinarianID = null;
	private Long visitID = null;



	public void finalize() throws Throwable {

	}

	public VisitDetailsDTO(){

	}

	public Date getBirthDate(){
		return birthDate;
	
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

	public String getName(){
		return name;
	
	}

	public Long getPetID(){
		return petID;
	
	}

	public Long getVeterinarianID(){
		return veterinarianID;
	
	}

	public Long getVisitID(){
		return visitID;
	
	}

	/**
	 * 
	 * @param birthDate    redseeds_uid-8095251459543705440--176646429404794116--
	 * 5460063136785743106--329528642387347170redseeds_uid
	 */
	public void setBirthDate(Date birthDate){
		this.birthDate = birthDate;
	
	}

	/**
	 * 
	 * @param date    redseeds_uid-7998940081430231246--4449133296779544001-
	 * 5429134110696336059-1596558482291099444redseeds_uid
	 */
	public void setDate(Date date){
		this.date = date;
	
	}

	/**
	 * 
	 * @param description    redseeds_uid389526782615639678-7479561371582399072-
	 * 4160345732856196713-960660627207514373redseeds_uid
	 */
	public void setDescription(String description){
		this.description = description;
	
	}

	/**
	 * 
	 * @param firstName    redseeds_uid2669398092210169779--4132410320912361700--
	 * 1902655124545577748--925908762639005361redseeds_uid
	 */
	public void setFirstName(String firstName){
		this.firstName = firstName;
	
	}

	/**
	 * 
	 * @param isFirstVisit    redseeds_uid-3178712911329487863-2173318175548778014--
	 * 4653970716553189976--7744556200109545660redseeds_uid
	 */
	public void setIsFirstVisit(Boolean isFirstVisit){
		this.isFirstVisit = isFirstVisit;
	
	}

	/**
	 * 
	 * @param lastName    redseeds_uid3794121391074968834-571100778530400928--
	 * 6756979781753881629--4040293368261077512redseeds_uid
	 */
	public void setLastName(String lastName){
		this.lastName = lastName;
	
	}

	/**
	 * 
	 * @param name    redseeds_uid55390496221917201-4382532727875979088-
	 * 4284386805553367582--8535594969403226373redseeds_uid
	 */
	public void setName(String name){
		this.name = name;
	
	}

	/**
	 * 
	 * @param petID    redseeds_uid-3875268011229272201-6081181018934027716-
	 * 6806575012923044201-2708484233298998819redseeds_uid
	 */
	public void setPetID(Long petID){
		this.petID = petID;
	
	}

	/**
	 * 
	 * @param veterinarianID    redseeds_uid1904036302937254218-5494920626039724072--
	 * 8408019116831520010-203502965585032098redseeds_uid
	 */
	public void setVeterinarianID(Long veterinarianID){
		this.veterinarianID = veterinarianID;
	
	}

	/**
	 * 
	 * @param visitID    redseeds_uid3865354917857765099--8228845947169559444-
	 * 4365359570024173341--1846888237317738484redseeds_uid
	 */
	public void setVisitID(Long visitID){
		this.visitID = visitID;
	
	}

}