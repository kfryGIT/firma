package com.example.demo.wniosekUser;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WniosekService {


    private final WniosekRepository wniosekRepository;

    @Autowired
    public WniosekService(WniosekRepository wniosekRepository) {
        this.wniosekRepository = wniosekRepository;
    }

    // metoda znajduje wszystke wnioski w bazie
    public List<Wniosek> getWniosek(){
        return wniosekRepository.findAll();
    }


    public void addNewWniosek(Wniosek wniosek){

        wniosekRepository.save(wniosek);
    }

 //!!!!!!
    //PATCH	aktualizacja części danych tj.stawkiDiety

    public void patchFormAdm(String name, int newDietaStawka) {
        Optional<Wniosek> formAdmOptional = wniosekRepository.findByName(name);

        if (formAdmOptional.isEmpty()) {
            throw new IllegalStateException("Wniosek with this id does not exist");
        }

        Wniosek wniosek = formAdmOptional.get();
        wniosek.setCenaDay(newDietaStawka); // Ustawienie nowej wartości
        wniosekRepository.save(wniosek); // Zapisanie zmian w bazie danych
    }
}
