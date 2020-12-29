package app.model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import app.dto.OwnerDataDTO;
import app.dto.OwnerListItemDTO;
import app.dto.PetDataDTO;
import app.dto.PetListItemDTO;
import app.dto.PetSearchCriteriaDTO;
import app.dto.VeterinarianDataDTO;
import app.dto.VeterinarianListItemDTO;
import app.dto.VisitDataDTO;
import app.dto.VisitDetailsDTO;
import app.dto.VisitListItemDTO;
import app.repository.OwnerListItemRepository;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
@Aspect
public class ServiceImpl implements IService {

	@Autowired
	OwnerListItemRepository ownerListItemRepository;
	
	public ServiceImpl(){

	}

	public void finalize() throws Throwable {

	}
	
	public void setOwnerListItemRepository(OwnerListItemRepository ownerListItemRepository) {
		this.ownerListItemRepository = ownerListItemRepository;
	}

	@Override
	public int validateOwnerData(OwnerDataDTO ownerDataDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void createOwnerData(OwnerDataDTO ownerDataDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int validatePetData(PetDataDTO petDataDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void createPetData(PetDataDTO petDataDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePet(Long inputPetID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PetListItemDTO> readPetList(PetSearchCriteriaDTO petSearchCriteriaDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OwnerListItemDTO> readOwnerList() throws SQLException, ClassNotFoundException {
		// Get Connection
        Connection connection = ConnectionUtils.getMyConnection();
 
        // Create statement
        Statement statement = connection.createStatement();
 
        String sql = "select id, first_name, last_name, email, phone_number from owner";
 
        // Execute SQL statement returns a ResultSet object.
        ResultSet rs = statement.executeQuery(sql);
 
        // Fetch on the ResultSet        
        // Move the cursor to the next record.
        ResultSetMapper<OwnerListItemDTO> resultSetMapper = new ResultSetMapper<OwnerListItemDTO>();
        List<OwnerListItemDTO> pojoList = resultSetMapper.mapRersultSetToObject(rs, OwnerListItemDTO.class);
        if(pojoList != null){
			for(OwnerListItemDTO pojo : pojoList){
				System.out.println(pojo);
			}
		} else {
			System.out.println("ResultSet is empty. Please check if database table is empty");
		}
        connection.close();
		return pojoList;
	}

	@Override
	public List<PetListItemDTO> readPetList(Long inputOwnerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VeterinarianDataDTO readVeterinarianData(Long inputVeterinarianID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int validateVeterinarianData(VeterinarianDataDTO veterinarianDataDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateVeterinarianData(VeterinarianDataDTO veterinarianDataDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<VeterinarianListItemDTO> readVeterinarianList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PetDataDTO readPetData(Long inputPetID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int validateVisitData(VisitDataDTO visitDataDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void createVisitData(VisitDataDTO visitDataDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public VisitDataDTO readVisitData(Long inputVisitID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateVisitData(VisitDataDTO visitDataDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public VisitDetailsDTO readVisitDetails(Long inputVisitID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VisitListItemDTO> readVisitList(Long inputPetID) {
		// TODO Auto-generated method stub
		return null;
	}

}