package com.improve10x.tdd.supriya.practise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondLargestNumberTest {
    SecondLargestNumber secondLargestNumber;
    @BeforeEach
    public void setUp(){
        secondLargestNumber = new SecondLargestNumber();

    }

    @Test
    public void nothing(){}


    @Test
    public void givenNumbers_returnSecondLargest(){
        int largestNum = secondLargestNumber.FindSecondLargestNumber(new int[]{0});
        assertEquals(0, largestNum);
    }

    @Test
    public void givenNull_returnSecondLargest(){
        int largestNum = secondLargestNumber.FindSecondLargestNumber(null);
        assertEquals(0, largestNum);
    }

    @Test
    public void givenNumbers_returnNumber(){
        int largestNum = secondLargestNumber.FindSecondLargestNumber(new int[]{1,0});
        assertEquals(0, largestNum);
    }

    @Test
    public void givenNumbers1052_returnSecondLargest(){
        int largestNum = secondLargestNumber.FindSecondLargestNumber(new int[]{1,0,5,2});
        assertEquals(2, largestNum);
    }

    @Test
    public void givenNumbers10403050_returnSecondLargest(){
        int largestNum = secondLargestNumber.FindSecondLargestNumber(new int[]{10,40,30,50});
        assertEquals(40, largestNum);
    }
    @Test
    public void givenIntegration(){
        int secondLargestNumber1 = secondLargestNumber.FindSecondLargestNumber(new int[]{10,40,30,50});
        assertEquals(40, secondLargestNumber1);
        int secondLargestNumber2 = secondLargestNumber.FindSecondLargestNumber(new int[]{25, 143, 89, 13, 105});
        assertEquals(105, secondLargestNumber2);
        int secondLargestNumber3 = secondLargestNumber.FindSecondLargestNumber(new int[]{54, 23, 11, 17, 10});
        assertEquals(23, secondLargestNumber3);
    }

}
