package com.improve10x.tdd.krishna.test2problems.largestnumbertest;

import com.improve10x.tdd.krishna.test2problems.largestnumber.LargestNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {

    LargestNumber largestNumber;

    @BeforeEach
    public void setup(){
        largestNumber = new LargestNumber();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsZero(){
        int largestNum = largestNumber.findLargestNumber(null);
        assertEquals(0, largestNum);
    }

    @Test
    public void givenEmpty_returnsZero(){
        int largestNum = largestNumber.findLargestNumber(new int[]{});
        assertEquals(0, largestNum);
    }

    @Test
    public void givenZero_returnsZero(){
        int largestNum = largestNumber.findLargestNumber(new int[]{0});
        assertEquals(0, largestNum);
    }
}
