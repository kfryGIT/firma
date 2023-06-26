package com.example.demoAnimal.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

//klasa z metodami return, void
@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

// metoda znajduje wszystke zwierzaki w bazie
    public List<Animal> getAnimal(){
        return animalRepository.findAll();
    }


    public void addNewAnimal(Animal animal){

        animalRepository.save(animal);
    }

    public void deleteAnimal(Long id){
        boolean exists=animalRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException(
                "animal with this id is not exists");
        }
        animalRepository.deleteById(id);

    }
}
