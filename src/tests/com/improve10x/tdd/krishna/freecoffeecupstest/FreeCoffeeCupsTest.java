package com.improve10x.tdd.krishna.freecoffeecupstest;

import com.improve10x.tdd.krishna.freecoffeecups.FreeCoffeeCups;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreeCoffeeCupsTest {

    FreeCoffeeCups freeCoffeeCups;

    @BeforeEach
    public void setup(){
        freeCoffeeCups = new FreeCoffeeCups();
    }
    @Test
    public void nothing(){

    }
//Free Coffee Cups
//For each of the 6 coffee cups I buy, I get a 7th cup free. In total, I get 7 cups. Create a function that takes n cups bought and return as an integer the total number of cups I would get.
//Examples
//totalCups(6) ➞ 7
//totalCups(12) ➞ 14
//totalCups(213) ➞ 248

    @Test
    public void givenSix_returnSeven(){
        int totalCups = freeCoffeeCups.findTotalFreeCups(213);
        assertEquals(248, totalCups);
    }
}
