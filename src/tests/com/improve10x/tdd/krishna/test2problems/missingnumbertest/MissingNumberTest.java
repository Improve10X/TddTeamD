package com.improve10x.tdd.krishna.test2problems.missingnumbertest;

import com.improve10x.tdd.krishna.test2problems.missingnumber.MissingNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {

    private final int invalid = -1;
    private MissingNumber missingNumber;
    @BeforeEach
    public void setup(){
        missingNumber = new MissingNumber();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsMinusOne(){
        int missingNum = missingNumber.findMissingNumber(null);
        assertEquals(invalid, missingNum);
    }

    @Test
    public void givenEmpty_returnsMinusOne(){
        int missingNum = missingNumber.findMissingNumber(new int[]{});
        assertEquals(invalid, missingNum);
    }

    @Test
    public void given0_returnsMinusOne(){
        int missingNum = missingNumber.findMissingNumber(new int[]{0});
        assertEquals(invalid, missingNum);
    }

    @Test
    public void given1_returnsTwo(){
        int missingNum = missingNumber.findMissingNumber(new int[]{1});
        assertEquals(2, missingNum);
    }

    @Test
    public void given2_returnsOne(){
        int missingNum = missingNumber.findMissingNumber(new int[]{2});
        assertEquals(1, missingNum);
    }

    @Test
    public void given12_returnsThree(){
        int missingNum = missingNumber.findMissingNumber(new int[]{1, 2});
        assertEquals(3, missingNum);
    }

    @Test
    public void given13_returnsTwo(){
        int missingNum = missingNumber.findMissingNumber(new int[]{1, 3});
        assertEquals(2, missingNum);
    }

    @Test
    public void given124_returnsTwo(){
        int missingNum = missingNumber.findMissingNumber(new int[]{1, 2, 4});
        assertEquals(3, missingNum);
    }

    @Test
    public void given123_returnsFour(){
        int missingNum = missingNumber.findMissingNumber(new int[]{1, 2, 3});
        assertEquals(4, missingNum);
    }
}
