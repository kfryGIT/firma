package com.example.demoAnimal.animal;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

//klasa tworzy tabele w bazie danych
@Entity
@Table
public class Animal {
    @Id
    @SequenceGenerator(
            name = "animal_sequence",
            sequenceName = "animal_sequence",
            allocationSize = 1
    )

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "animal_sequence")
    private long id;
    private String name;
    private String ownerMail;
    private LocalDate dateOfBorn;

    @Transient//-oblicza wiek z daty +getAge() zmiana;
    //uwaga gdy dodasz transient usuń tabele z Bazy danych
    private int age;

    public Animal() {}

    public Animal(long id,
                  String name,
                  String ownerMail,
                  LocalDate dateOfBorn) {
        this.id = id;
        this.name = name;
        this.ownerMail = ownerMail;
        this.dateOfBorn = dateOfBorn;

    }

    public Animal(String name,
                  String ownerMail,
                  LocalDate dateOfBorn
                  ) {
        this.name = name;
        this.ownerMail = ownerMail;
        this.dateOfBorn = dateOfBorn;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerMail() {
        return ownerMail;
    }

    public void setOwnerMail(String ownerMail) {
        this.ownerMail = ownerMail;
    }

    public LocalDate getDateOfBorn() {
        return dateOfBorn;
    }

    public void setDateOfBorn(LocalDate dateOfBorn) {
        this.dateOfBorn = dateOfBorn;
    }

    public int getAge() {
        return Period.between(dateOfBorn, //metoda oblicza wiek!!!!!!!!!!!!
                LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AnimalEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ownerMail='" + ownerMail + '\'' +
                ", dateOfBorn=" + dateOfBorn +
                ", age=" + age +
                '}';
    }
}
