package com.example.demoAnimal.animal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

//klasa zawiera metodę która dodaje studentów do bazy danych
@Configuration
public class AnimalComponent {

    @Bean
    CommandLineRunner commandLineRunner(AnimalRepository repository){
        return args -> {
            Animal box=new Animal("Box",
                    "maria@wp.pl",
                    LocalDate.of(2022,11,24)
                    );
            repository.save(box);

            Animal ars=new Animal("Ars",
                    "maria2@wp.pl",
                    LocalDate.of(2021,12,26)
                    );
            repository.save(ars);

            Animal azor=new Animal("Azor",
                    "kkk@wp.pl",
                    LocalDate.of(2020,12,11)
            );
            repository.save(azor);
        };
    }
}
