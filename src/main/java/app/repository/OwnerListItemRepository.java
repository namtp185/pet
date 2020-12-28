package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.dto.OwnerListItemDTO;

@Repository
public interface OwnerListItemRepository extends JpaRepository<OwnerListItemDTO, Long>  {

}
