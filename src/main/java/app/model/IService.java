package app.model;
import java.sql.SQLException;
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
 * @created 25-maj-2015 23:50:31
 */
public interface IService {

	int validateOwnerData(OwnerDataDTO ownerDataDTO);

	void createOwnerData(OwnerDataDTO ownerDataDTO);

	int validatePetData(PetDataDTO petDataDTO);

	void createPetData(PetDataDTO petDataDTO);

	void deletePet(Long inputPetID);

	List<PetListItemDTO> readPetList(PetSearchCriteriaDTO petSearchCriteriaDTO);

	List<OwnerListItemDTO> readOwnerList() throws SQLException, ClassNotFoundException;

	List<PetListItemDTO> readPetList(Long inputOwnerID);

	VeterinarianDataDTO readVeterinarianData(Long inputVeterinarianID);

	int validateVeterinarianData(VeterinarianDataDTO veterinarianDataDTO);

	int updateVeterinarianData(VeterinarianDataDTO veterinarianDataDTO);

	List<VeterinarianListItemDTO> readVeterinarianList();

	PetDataDTO readPetData(Long inputPetID);

	int validateVisitData(VisitDataDTO visitDataDTO);

	void createVisitData(VisitDataDTO visitDataDTO);

	VisitDataDTO readVisitData(Long inputVisitID);

	void updateVisitData(VisitDataDTO visitDataDTO);

	VisitDetailsDTO readVisitDetails(Long inputVisitID);

	List<VisitListItemDTO> readVisitList(Long inputPetID);

}