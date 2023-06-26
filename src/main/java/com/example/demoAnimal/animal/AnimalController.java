package com.example.demoAnimal.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

//klasa z metodami http get, post, put, delate

@RestController
@RequestMapping(path = "/api")
public class AnimalController {

    public final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService =  animalService;
    }

    @GetMapping
    public List<Animal> getAnimal(){
        return animalService.getAnimal();}

    @PostMapping//przetestowac w postman
    public void addNewAnimal123(@RequestBody Animal animal){
        animalService.addNewAnimal(animal);}

    @DeleteMapping(path = "{animalId}")
    public void deleteAnimal(@PathVariable("animalId") Long id){
        animalService.deleteAnimal(id);
    }


}
