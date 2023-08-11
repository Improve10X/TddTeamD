package com.improve10x.tdd.supriya.arrayqustions;

import com.improve10x.tdd.supriya.arrayquestions.smallestNumber.SmallestNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallestNumberTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_return0(){
        SmallestNumber smallestNumber = new SmallestNumber();
        int number = smallestNumber.findSmallestNumber(null);
        Assertions.assertEquals(0, number);
    }
}
