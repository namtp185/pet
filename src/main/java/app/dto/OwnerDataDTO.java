package app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:33
 */

@Entity
@Table(name = "owner")
public class OwnerDataDTO {

	@Column(name = "address")
	private String address = null;
	
	@Column(name = "city")
	private String city = null;
	
	@Column(name = "email")
	private String email = null;
	
	@Column(name = "owner_first_name")
	private String ownerFirstName = null;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
	private Long ownerID = null;
    
    @Column(name = "owner_last_name")
	private String ownerLastName = null;
    
    @Column(name = "phone_number")
	private String phoneNumber = null;



	public void finalize() throws Throwable {

	}

	public OwnerDataDTO(){

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
	 * @param address    redseeds_uid692381491769619093--2380579434108130062--
	 * 2544654272662445040-224102797262157076redseeds_uid
	 */
	public void setAddress(String address){
		this.address = address;
	
	}

	/**
	 * 
	 * @param city    redseeds_uid6544452641792428968-4666806267137084283-
	 * 2419876907710115885-3226713508982964800redseeds_uid
	 */
	public void setCity(String city){
		this.city = city;
	
	}

	/**
	 * 
	 * @param email    redseeds_uid-927795746305352636--81214651904079883-
	 * 6376511732346731540-8059191861175141081redseeds_uid
	 */
	public void setEmail(String email){
		this.email = email;
	
	}

	/**
	 * 
	 * @param ownerFirstName    redseeds_uid3746889410019048119-4480724111575932709--
	 * 1308444266279775003-7588258340594277742redseeds_uid
	 */
	public void setOwnerFirstName(String ownerFirstName){
		this.ownerFirstName = ownerFirstName;
	
	}

	/**
	 * 
	 * @param ownerID    redseeds_uid6859638005596304461--1983134659254571361-
	 * 2698349068605523851--4689373571140623815redseeds_uid
	 */
	public void setOwnerID(Long ownerID){
		this.ownerID = ownerID;
	
	}

	/**
	 * 
	 * @param ownerLastName    redseeds_uid-1642378407392423062-4528550669262839150-
	 * 851708813076191272-856350507210312100redseeds_uid
	 */
	public void setOwnerLastName(String ownerLastName){
		this.ownerLastName = ownerLastName;
	
	}

	/**
	 * 
	 * @param phoneNumber    redseeds_uid6621360082727181244-7119135885001291753--
	 * 4930921087326290282-873443572598366678redseeds_uid
	 */
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	
	}

}