package co.edu.uptc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uptc.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}

