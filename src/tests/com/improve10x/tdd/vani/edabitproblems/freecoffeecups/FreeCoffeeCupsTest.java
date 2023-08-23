package com.improve10x.tdd.vani.edabitproblems.freecoffeecups;

import com.improve10x.tdd.vani.edabitproblems.freecoffeecups.FreeCoffeeCups;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreeCoffeeCupsTest {
    @Test
    public void nothing(){}

    @Test
    public void givenSix_returnsSeven(){
        FreeCoffeeCups freeCoffeeCups = new FreeCoffeeCups();
        int cups = freeCoffeeCups.totalCups(6);
        assertEquals(7, cups);
    }

    @Test
    public void givenTwelve_returnsFourteen(){
        FreeCoffeeCups freeCoffeeCups = new FreeCoffeeCups();
        int cups = freeCoffeeCups.totalCups(12);
        assertEquals(14, cups);
    }

    @Test
    public void givenValue_returnsValue(){
        FreeCoffeeCups freeCoffeeCups = new FreeCoffeeCups();
        int cups = freeCoffeeCups.totalCups(213);
        assertEquals(248, cups);
    }
}
