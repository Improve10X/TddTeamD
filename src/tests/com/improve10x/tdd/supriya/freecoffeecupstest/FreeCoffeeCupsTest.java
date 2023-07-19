package com.improve10x.tdd.supriya.freecoffeecupstest;

import com.improve10x.tdd.supriya.freecoffecups.FreeCoffeeCups;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreeCoffeeCupsTest {
    @Test
    public void givenSix_returnSeven(){
        FreeCoffeeCups freeCoffeeCups = new FreeCoffeeCups();
        int cups = freeCoffeeCups.findCups(6);
        Assertions.assertEquals(7, cups);
    }

    @Test
    public void givenTwelve_returnFourteen(){
        FreeCoffeeCups freeCoffeeCups = new FreeCoffeeCups();
        int cups = freeCoffeeCups.findCups(12);
        Assertions.assertEquals(14, cups);
    }
}
