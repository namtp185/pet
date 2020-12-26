package app.dto;
import java.util.Date;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:33
 */
public class PetDTO {

	private Float age = null;
	private Date birthDate = null;
	private String name = null;
	private Long petID = null;



	public void finalize() throws Throwable {

	}

	public PetDTO(){

	}

	public Float getAge(){
		return age;
	
	}

	public Date getBirthDate(){
		return birthDate;
	
	}

	public String getName(){
		return name;
	
	}

	public Long getPetID(){
		return petID;
	
	}

	/**
	 * 
	 * @param age    redseeds_uid-612286553650675205-1165116653197648401-
	 * 3107185428287144104--5319764878919543836redseeds_uid
	 */
	public void setAge(Float age){
		this.age = age;
	
	}

	/**
	 * 
	 * @param birthDate    redseeds_uid-1335648939398245539--3910266788162534507-
	 * 5967354893937948961-693557163404364379redseeds_uid
	 */
	public void setBirthDate(Date birthDate){
		this.birthDate = birthDate;
	
	}

	/**
	 * 
	 * @param name    redseeds_uid8024706319817627749--7697826303976721855-
	 * 107975915869591741-698075053868974200redseeds_uid
	 */
	public void setName(String name){
		this.name = name;
	
	}

	/**
	 * 
	 * @param petID    redseeds_uid456961088231124345--6771891631744903646--
	 * 6423073592731800333--7862880092501676766redseeds_uid
	 */
	public void setPetID(Long petID){
		this.petID = petID;
	
	}

}