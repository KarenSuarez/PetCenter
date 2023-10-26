package co.edu.uptc.services;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import co.edu.uptc.model.*;

public interface PetService {
	public Iterable<Pet> findAll();
	public Optional<Pet> findById(Long id);
	public Page<Pet>findAll(Pageable pageable);
	public Pet save(Pet pet);
	public void deleteById(Long id);
	public List<Pet> getPets();
	public Pet updatePet(Pet request, long id);
	boolean deletePet(long id);
}
