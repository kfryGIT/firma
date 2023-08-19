package com.example.demo;

import com.example.demo.wniosekUser.CalculatowWniosek;
import org.junit.Assert;
import org.junit.Test;


public class CalculatorWniosekTests {

    @Test
    public void should_multiplies_two_numbers() {
        // given
        CalculatowWniosek cal=new CalculatowWniosek();
        //when
        int result=cal.calculateCenaDayAll(2,15);
        //then
        Assert.assertEquals(result,30);
    }

    @Test
    public void should_add_numbers() {
        // given
        CalculatowWniosek cal=new CalculatowWniosek();
        //when
        int result2=cal.calculateCenaDelegacji(2000,150,300);
        //then
        Assert.assertEquals(result2,2450);
    }
}
