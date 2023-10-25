package co.edu.uptc.petcenter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.uptc.petcenter.model.Pet;
import co.edu.uptc.petcenter.service.PetService;

@RestController
@RequestMapping("/pets")
public class PetController {
	@Autowired
    private PetService petService;

    @PostMapping
    public ResponseEntity<?> savePet(@RequestBody Pet pet) {
        return 	ResponseEntity.status(HttpStatus.CREATED).body(petService.save(pet));
    }

   
}
