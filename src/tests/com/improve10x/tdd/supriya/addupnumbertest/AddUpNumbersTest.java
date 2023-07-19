package com.improve10x.tdd.supriya.addupnumbertest;

import com.improve10x.tdd.supriya.addupnumbers.AddUpNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddUpNumbersTest {
    AddUpNumber addUpNumber;
    @BeforeEach
    public void setUp(){
        addUpNumber = new AddUpNumber();
    }
    @Test
    public void givenFour_returnTen(){
        int number = addUpNumber.sum(4);
        assertEquals(10, number);
    }

    @Test
    public void givenThirteen_returnNintyOne(){
        int number = addUpNumber.sum(4);
        assertEquals(10, number);
    }

    @Test
    public void given10_returnsFiftyFive(){
        int number = addUpNumber.sum(10);
        assertEquals(55, number);
    }
}
