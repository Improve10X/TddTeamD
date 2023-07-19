package com.improve10x.tdd.krishna.convertagetodaystest;

import com.improve10x.tdd.krishna.convertagetodays.ConvertAgeToDays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertAgeToDaysTest {

    ConvertAgeToDays convertAgeToDays;

    @BeforeEach
    public void setup(){
        convertAgeToDays = new ConvertAgeToDays();
    }

    @Test
    public void nothing(){

    }
//Convert Age to Days
//Create a function that takes the age in years and returns the age in days.
//Examples
//calcAge(65) ➞ 23725
//calcAge(0) ➞ 0
//calcAge(20) ➞ 7300

    @Test
    public void givenSixFive_returnsTwoThreeSevenTwoFive(){
        int convertedToDays = convertAgeToDays.convertAgeToDays(65);
        assertEquals(23725, convertedToDays);
    }

    @Test
    public void givenZero_returnZero(){
        int convertedToDays = convertAgeToDays.convertAgeToDays(0);
        assertEquals(0, convertedToDays);
    }

    @Test
    public void givenTwoZero_returnsSevenThreeZeroZero(){
        int convertedToDays = convertAgeToDays.convertAgeToDays(20);
        assertEquals(7300, convertedToDays);
    }


}
