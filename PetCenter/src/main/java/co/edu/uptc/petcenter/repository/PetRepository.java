package co.edu.uptc.petcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.uptc.petcenter.model.*;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
