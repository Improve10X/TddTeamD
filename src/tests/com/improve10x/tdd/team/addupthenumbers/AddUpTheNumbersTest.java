package com.improve10x.tdd.team.addupthenumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Add up the Numbers from a Single Number
//        Create a method that takes an integer as an argument. Add up all the numbers from 1 to the number you passed to the function. For example, if the input is 4 then your function should return 10 because 1 + 2 + 3 + 4 = 10.
//        Examples
//        addUp(4) ➞ 10
//        addUp(13) ➞ 91
//        addUp(600) ➞ 180300
public class AddUpTheNumbersTest {

    @Test
    public void nothing(){}

    @Test
    public void givenFour_returnsTen(){
        AddUpTheNumbers addUpTheNumbers = new AddUpTheNumbers();
        int ten = addUpTheNumbers.addUp(4);
        assertEquals(10, ten);
    }
}
