package com.example.demo.wniosekUser;


import javax.persistence.*;

@Entity
@Table
public class Wniosek {

    @Id
    @SequenceGenerator(
            name = "wniosek_sequence",
            sequenceName = "wniosek_sequence",
            allocationSize = 1
    )

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "wniosek_sequence")
    private long id;
    private String name;
    private int cena;
    private int cenaL;
    private int dni;
    private int cenaDay;
    private int autoKM;
    private int autoC;
    @Transient
    private int cenaAll;//cena z paragonu po uwzglednieniu limitu
    @Transient
    private int autoAll;
    @Transient
    private int cenaDayAll; //suma diety ze wszystkie dni
    @Transient
    private int cenaDelegacji;//suma wszystkich stawek



    public Wniosek(){}


    public Wniosek(long id, String name, int cena, int cenaL, int dni, int cenaDay,
                   int autoKM, int autoC
    ) {
        this.id = id;
        this.name = name;
        this.cena = cena;
        this.cenaL = cenaL;
        this.dni = dni;
        this.cenaDay = cenaDay;
        this.autoKM = autoKM;
        this.autoC = autoC;
    }

    public Wniosek(String name, int cena, int cenaL, int dni, int cenaDay, int autoKM, int autoC) {
        this.name = name;
        this.cena = cena;
        this.cenaL = cenaL;
        this.dni = dni;
        this.cenaDay = cenaDay;
        this.autoKM = autoKM;
        this.autoC = autoC;
        this.cenaAll = calculateCenaAll();
        this.autoAll = calculateAutoAll();
        this.cenaDayAll = calculateCenaDayAll();
        this.cenaDelegacji = calculateCenaDelegacji();
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

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getCenaL() {
        return cenaL;
    }

    public void setCenaL(int cenaL) {
        this.cenaL = cenaL;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCenaDay() {
        return cenaDay;
    }

    public void setCenaDay(int cenaDay) {
        this.cenaDay = cenaDay;
    }

    public int getAutoKM() {
        return autoKM;
    }

    public void setAutoKM(int autoKM) {
        this.autoKM = autoKM;
    }

    public int getAutoC() {
        return autoC;
    }

    public void setAutoC(int autoC) {
        this.autoC = autoC;
    }


    //______________________________
    // ... pozostałe gettery i obiczenia
    private int calculateCenaAll() {
//        int c1=0;
//        if(cena > cenaL){c1=cenaL;}else{c1=cena;}
//        return c1;
        return cena;
    }

    private int calculateCenaDayAll() {
        return dni * cenaDay;
    }

    private int calculateAutoAll() {
        return autoKM * autoC;
    }

    private int calculateCenaDelegacji() {
        return calculateCenaAll() + calculateCenaDayAll() + calculateAutoAll();
    }

    public int getCenaAll() {
        return cena;
    }

    public int getCenaDayAll() {
        return dni * cenaDay;
    }

    public int getAutoAll() {
        return autoKM * autoC;
    }

    public int getCenaDelegacji() {
        return getCenaAll() + getCenaDayAll() + getAutoAll();
//                +getSumaCenParagonow();
    }
    //_________________________________


    @Override
    public String toString() {
        return "Wniosek{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cena=" + cena +
                ", cenaL=" + cenaL +
                ", dni=" + dni +
                ", cenaDay=" + cenaDay +
                ", autoKM=" + autoKM +
                ", autoC=" + autoC +
                '}';
    }
}
