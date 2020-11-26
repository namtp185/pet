package app.dto;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
public class PetTypeDTO {

	private Long petTypeID = null;
	private String typeName = null;



	public void finalize() throws Throwable {

	}

	public PetTypeDTO(){

	}

	public Long getPetTypeID(){
		return petTypeID;
	
	}

	public String getTypeName(){
		return typeName;
	
	}

	/**
	 * 
	 * @param petTypeID    redseeds_uid9021302497076156798--8227235193244477992--
	 * 3591411002809046415-7100120273510691844redseeds_uid
	 */
	public void setPetTypeID(Long petTypeID){
		this.petTypeID = petTypeID;
	
	}

	/**
	 * 
	 * @param typeName    redseeds_uid-8801676314423100975-3575590499251440286-
	 * 8243444912648898835-356215631634168481redseeds_uid
	 */
	public void setTypeName(String typeName){
		this.typeName = typeName;
	
	}

}