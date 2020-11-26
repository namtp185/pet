package app.dto;
import java.util.Date;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:36
 */
public class VisitDTO {

	private Date date = null;
	private String description = null;
	private Boolean isFirstVisit = null;
	private Long visitID = null;



	public void finalize() throws Throwable {

	}

	public VisitDTO(){

	}

	public Date getDate(){
		return date;
	
	}

	public String getDescription(){
		return description;
	
	}

	public Boolean getIsFirstVisit(){
		return isFirstVisit;
	
	}

	public Long getVisitID(){
		return visitID;
	
	}

	/**
	 * 
	 * @param date    redseeds_uid-7391389600829713216-795989749988118373--
	 * 4071387158806084516--916682047095793903redseeds_uid
	 */
	public void setDate(Date date){
		this.date = date;
	
	}

	/**
	 * 
	 * @param description    redseeds_uid-8253676389211080587--3632975505150961609--
	 * 310075883366546480--8352360841783618155redseeds_uid
	 */
	public void setDescription(String description){
		this.description = description;
	
	}

	/**
	 * 
	 * @param isFirstVisit    redseeds_uid423330267329377495-4381505942255254484-
	 * 1471618492465068477-5216017906934677766redseeds_uid
	 */
	public void setIsFirstVisit(Boolean isFirstVisit){
		this.isFirstVisit = isFirstVisit;
	
	}

	/**
	 * 
	 * @param visitID    redseeds_uid-7779285240981384986-7752258084637310804--
	 * 754656782312643387--4013704763991836340redseeds_uid
	 */
	public void setVisitID(Long visitID){
		this.visitID = visitID;
	
	}

}