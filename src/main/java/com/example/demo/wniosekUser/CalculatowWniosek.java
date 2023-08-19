package com.example.demo.wniosekUser;

public class CalculatowWniosek {

    public int calculateCenaDayAll(int dni, int cenaDay) {
        return dni * cenaDay;
    }

    public int calculateCenaDelegacji(int calculateCenaAll, int calculateCenaDayAll, int calculateAutoAll) {
        return calculateCenaAll + calculateCenaDayAll + calculateAutoAll;
    }
}
