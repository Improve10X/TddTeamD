package com.improve10x.tdd.krishna.test2problems.missingnumbertest;

import com.improve10x.tdd.krishna.test2problems.missingnumber.MissingNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsMinusOne(){
        MissingNumber missingNumber = new MissingNumber();
        int missingNum = missingNumber.findMissingNumber(null);
        assertEquals(-1, missingNum);
    }

    @Test
    public void givenEmpty_returnsMinusOne(){
        MissingNumber missingNumber = new MissingNumber();
        int missingNum = missingNumber.findMissingNumber(new int[]{});
        assertEquals(-1, missingNum);
    }
}
