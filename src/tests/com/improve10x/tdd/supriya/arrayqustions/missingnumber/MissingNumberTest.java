package com.improve10x.tdd.supriya.arrayqustions.missingnumber;

import com.improve10x.tdd.supriya.arrayquestions.missingnumber.MissingNumber1;
import com.improve10x.tdd.supriya.findthemissingletter.MissingNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnMinusOne(){
        MissingNumber1 missingNumber1 = new MissingNumber1();
        int number = missingNumber1.findMissingNumber(null);
        Assertions.assertEquals(-1, number);
    }
}
