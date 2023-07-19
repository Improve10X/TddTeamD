package com.improve10x.tdd.krishna.addupnumbersfromasinglenumbertest;

import com.improve10x.tdd.krishna.addupnumbersfromasinglenumber.AddUpNumbersFromASingleNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddUpNumbersFromASingleNumberTest {

    AddUpNumbersFromASingleNumber addUpNumbersFromASingleNumber;

    @BeforeEach
    public void setup(){
        addUpNumbersFromASingleNumber = new AddUpNumbersFromASingleNumber();

    }

    @Test
    public void nothing(){

    }
//Add up the Numbers from a Single Number
//Create a method that takes an integer as an argument. Add up all the numbers from 1 to the number you passed to the function. For example, if the input is 4 then your function should return 10 because 1 + 2 + 3 + 4 = 10.
//Examples
//addUp(4) ➞ 10
//addUp(13) ➞ 91
//addUp(600) ➞ 180300

    @Test
    public void givenFour_returnTen(){
        int result = addUpNumbersFromASingleNumber.addUpNumbersToNumber(4);
        assertEquals(10, result);
    }

    @Test
    public void givenOneThree_returnNineOne(){
        int result = addUpNumbersFromASingleNumber.addUpNumbersToNumber(13);
        assertEquals(91, result);
    }

    @Test
    public void givenSixZeroZero_returnOneEightZeroThreeZeroZero(){
        int result = addUpNumbersFromASingleNumber.addUpNumbersToNumber(600);
        assertEquals(180300, result);
    }
}
