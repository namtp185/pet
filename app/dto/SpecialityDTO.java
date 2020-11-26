package app.dto;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
public class SpecialityDTO {

	private Integer specialityCode = null;
	private Long specialityID = null;
	private String specialityName = null;



	public void finalize() throws Throwable {

	}

	public SpecialityDTO(){

	}

	public Integer getSpecialityCode(){
		return specialityCode;
	
	}

	public Long getSpecialityID(){
		return specialityID;
	
	}

	public String getSpecialityName(){
		return specialityName;
	
	}

	/**
	 * 
	 * @param specialityCode    redseeds_uid-4604372256608460897-885182181593009540--
	 * 830109767919215583-5122796450952089145redseeds_uid
	 */
	public void setSpecialityCode(Integer specialityCode){
		this.specialityCode = specialityCode;
	
	}

	/**
	 * 
	 * @param specialityID    redseeds_uid-7673376192857538146-5715248923857970876-
	 * 2828639174531013870-8561601262088426122redseeds_uid
	 */
	public void setSpecialityID(Long specialityID){
		this.specialityID = specialityID;
	
	}

	/**
	 * 
	 * @param specialityName    redseeds_uid-7668290808984252786--2297157916593434356-
	 * 5569636956676718137-600772425591917569redseeds_uid
	 */
	public void setSpecialityName(String specialityName){
		this.specialityName = specialityName;
	
	}

}