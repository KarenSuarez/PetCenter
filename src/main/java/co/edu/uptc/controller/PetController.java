package co.edu.uptc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import co.edu.uptc.model.Pet;
import co.edu.uptc.repository.PetRepository;
import java.util.Optional;

import java.util.Optional;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @PutMapping("/{id}")
    public ResponseEntity<String> updatePet(@PathVariable Long id, @RequestBody Pet updatedPet) {
        Optional<Pet> optionalPet = petRepository.findById(id);

        if (optionalPet.isPresent()) {
            Pet existingPet = optionalPet.get();
            existingPet.setName(updatedPet.getName());
            existingPet.setCategory(updatedPet.getCategory());
            existingPet.setStatus(updatedPet.getStatus());
            petRepository.save(existingPet);

            return ResponseEntity.ok("Mascota actualizada exitosamente");
        } else {
            return ResponseEntity.status(404).body("Mascota no encontrada");
        }
    }
}

