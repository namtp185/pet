package app.dto;
import java.util.Date;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:36
 */
public class VisitListItemDTO {

	private Date date = null;
	private String firstName = null;
	private Boolean isFirstVisit = null;
	private String lastName = null;
	private Long veterinarianID = null;
	private Long visitID = null;



	public void finalize() throws Throwable {

	}

	public VisitListItemDTO(){

	}

	public Date getDate(){
		return date;
	
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
	 * @param date    redseeds_uid2455315594313378909-4409577359769934136--
	 * 660582808753034069--8619213440750950071redseeds_uid
	 */
	public void setDate(Date date){
		this.date = date;
	
	}

	/**
	 * 
	 * @param firstName    redseeds_uid8043603172777933224--6644425906309767936-
	 * 8254597114378434575-1113501652898559646redseeds_uid
	 */
	public void setFirstName(String firstName){
		this.firstName = firstName;
	
	}

	/**
	 * 
	 * @param isFirstVisit    redseeds_uid1052534380428521811-5645358700402905200-
	 * 4427368193214815024-1498757959915926784redseeds_uid
	 */
	public void setIsFirstVisit(Boolean isFirstVisit){
		this.isFirstVisit = isFirstVisit;
	
	}

	/**
	 * 
	 * @param lastName    redseeds_uid1181355427121436669-3934583921316261275-
	 * 6841734272951146338--1142294821648014574redseeds_uid
	 */
	public void setLastName(String lastName){
		this.lastName = lastName;
	
	}

	/**
	 * 
	 * @param veterinarianID    redseeds_uid3946480799686990726--768881445031909192--
	 * 6979249426518940615--7132567105868341053redseeds_uid
	 */
	public void setVeterinarianID(Long veterinarianID){
		this.veterinarianID = veterinarianID;
	
	}

	/**
	 * 
	 * @param visitID    redseeds_uid-3028734514701446261--7358365301617245912-
	 * 5493892808300664794--484477221625472407redseeds_uid
	 */
	public void setVisitID(Long visitID){
		this.visitID = visitID;
	
	}

}