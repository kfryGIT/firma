package com.example.demoAnimal.animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//interface do łączenia z bazą zawiera metody np. zapisujące obiekty w bazie
@Repository
public interface AnimalRepository
        extends JpaRepository<Animal, Long> {



}
