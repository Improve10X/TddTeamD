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

    @Test
    public void givenEmpty_return0(){
        SmallestNumber smallestNumber = new SmallestNumber();
        int number = smallestNumber.findSmallestNumber(new int[]{});
        Assertions.assertEquals(0, number);
    }

    @Test
    public void given0_return0(){
        SmallestNumber smallestNumber = new SmallestNumber();
        int number = smallestNumber.findSmallestNumber(new int[]{0});
        Assertions.assertEquals(0, number);
    }

    @Test
    public void given10_return0(){
        SmallestNumber smallestNumber = new SmallestNumber();
        int number = smallestNumber.findSmallestNumber(new int[]{0});
        Assertions.assertEquals(0, number);
    }

    @Test
    public void given21_return1(){
        SmallestNumber smallestNumber = new SmallestNumber();
        int number = smallestNumber.findSmallestNumber(new int[]{2,1});
        Assertions.assertEquals(1, number);
    }


}
