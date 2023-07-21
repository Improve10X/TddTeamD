package com.improve10x.tdd.team.convertageTodays;

import com.improve10x.tdd.team.converagetodays.ConvertAgeToDays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertAgeTwoDaysTest {
    @Test
    public void nothing() {
    }
    @Test
    public void givenSixtyFive_returnsTwoThreeSevenTwoFive() {
        ConvertAgeToDays convertAgeToDays = new ConvertAgeToDays();
        int days = convertAgeToDays.find(65);
        Assertions.assertEquals(23725, days);
    }
    @Test
    public void givenTwentyTwo_returnsEightZeroThreeZero(){
        ConvertAgeToDays convertAgeToDays = new ConvertAgeToDays();
        int days = convertAgeToDays.find(22);
        Assertions.assertEquals(8030,days);
    }
    @Test
    public void givenThirtySix_returnsOneThreeOneFourZero() {
        ConvertAgeToDays convertAgeToDays = new ConvertAgeToDays();
        int days = convertAgeToDays.find(36);
        Assertions.assertEquals(13140,days);
    }
}


