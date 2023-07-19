package com.improve10x.tdd.supriya.convertagetodays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertAgeToDaysTest {
//
@Test
public void nothing(){}

    @Test
    public void givenSixtyFive_returnTwoThreeSevenTwoFive(){
        AgeToDays ageToDays = new AgeToDays();
        int days = AgeToDays.calculate(65);
        Assertions.assertEquals(23725,days);
    }

    @Test
    public void givenTwenty_returnSevenThreeZeroZero(){
        AgeToDays ageToDays = new AgeToDays();
        int days = AgeToDays.calculate(20);
        Assertions.assertEquals(7300,days);
    }

    @Test
    public void givenTwentyThree_returnEightThreeNineFive(){
        AgeToDays ageToDays = new AgeToDays();
        int days = AgeToDays.calculate(23);
        Assertions.assertEquals(8395,days);
    }
}
