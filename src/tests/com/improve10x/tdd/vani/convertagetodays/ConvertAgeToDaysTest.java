package com.improve10x.tdd.vani.convertagetodays;

import com.improve10x.tdd.vani.convertAgeToDays.ConvertAgeToDays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertAgeToDaysTest {
    ConvertAgeToDays convertAgeToDays;

    @BeforeEach
    public void setUp(){
        convertAgeToDays = new ConvertAgeToDays();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenAge_returnsDays(){
        int ageToDays = convertAgeToDays.calcAge(65);
        assertEquals(23725, ageToDays);
    }

    @Test
    public void givenZero_returnsZero(){
        int ageToDays = convertAgeToDays.calcAge(0);
        assertEquals(0,ageToDays);
    }

    @Test
    public void givenTwenty_returnsSevenThreeZeroZero(){
        int ageToDays = convertAgeToDays.calcAge(20);
        assertEquals(7300, ageToDays);
    }
}
