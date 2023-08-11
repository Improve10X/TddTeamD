package com.improve10x.tdd.krishna.test2problems.largestnumbertest;

import com.improve10x.tdd.krishna.test2problems.largestnumber.LargestNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsZero(){
        LargestNumber largestNumber = new LargestNumber();
        int largestNum = largestNumber.findLargestNumber(null);
        assertEquals(0, largestNum);
    }
}
