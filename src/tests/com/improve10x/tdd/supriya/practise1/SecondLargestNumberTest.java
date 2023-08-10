package com.improve10x.tdd.supriya.practise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SecondLargestNumberTest {

    @Test
    public void nothing(){}


    @Test
    public void givenNumbers_returnSecondLargest(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int largestNum = secondLargestNumber.FindSecondLargestNumber(new int[]{0});
        Assertions.assertEquals(0, largestNum);
    }

    @Test
    public void givenNull_returnSecondLargest(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int largestNum = secondLargestNumber.FindSecondLargestNumber(null);
        Assertions.assertEquals(0, largestNum);
    }

    @Test
    public void givenNumbers_returnNumber(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int largestNum = secondLargestNumber.FindSecondLargestNumber(new int[]{1,0});
        Assertions.assertEquals(0, largestNum);
    }

    @Test
    public void givenNumbers1052_returnSecondLargest(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int largestNum = secondLargestNumber.FindSecondLargestNumber(new int[]{1,0,5,2});
        Assertions.assertEquals(2, largestNum);
    }
}
