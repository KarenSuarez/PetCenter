package co.edu.uptc.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.edu.uptc.model.Pet;
import co.edu.uptc.repository.PetRepository;

@Service
public class PetServiceImp implements PetService{

	@Autowired
	private PetRepository petRepository;
	
	@Override
	public Iterable<Pet> findAll() {
		return petRepository.findAll();
	}

	@Override
	public Optional<Pet> findById(Long id) {
		return petRepository.findById(id);
	}

	@Override
	public Page<Pet> findAll(Pageable pageable) {
		return petRepository.findAll(pageable);
	}

	@Override
	public Pet save(Pet user) {
		return petRepository.save(user);
	}

	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
		
	}
	@Override
	public List<Pet> getPets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
public Pet updatePet(Pet request, long id) {
    Optional<Pet> optionalPet = petRepository.findById(id);

    if (optionalPet.isPresent()) {
        Pet existingPet = optionalPet.get();
        existingPet.setName(request.getName());
        existingPet.setCategory(request.getCategory());
        existingPet.setStatus(request.getStatus());
        return petRepository.save(existingPet);
    } else {
        return null;
    }
}

	@Override
	public boolean deletePet(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
