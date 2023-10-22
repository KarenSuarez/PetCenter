package co.edu.uptc.services;

import co.edu.uptc.controller.PetController;
import co.edu.uptc.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PetService {
    private final PetController petController;

    public PetService(PetController petController) {
        this.petController = petController;
    }

    public ResponseEntity<String> updatePet(Long id, Pet updatedPet) {
        return petController.updatePet(id, updatedPet);
    }
}
