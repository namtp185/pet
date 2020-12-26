package app.repository;

import org.springframework.data.repository.CrudRepository;

import app.dto.OwnerDataDTO;

public interface OwnerRepository extends CrudRepository<OwnerDataDTO, Long> {

}
