package app.model;
import java.util.List;

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

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
public class ServiceImpl implements IService {

	public ServiceImpl(){

	}

	public void finalize() throws Throwable {

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
	public List<OwnerListItemDTO> readOwnerList() {
		// TODO Auto-generated method stub
		return null;
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