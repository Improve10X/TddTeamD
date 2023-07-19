package com.improve10x.tdd.krishna.multiplybylengthtest;

import com.improve10x.tdd.krishna.multiplybylength.MultiplyByLength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MultiplyByLengthTest {

    MultiplyByLength multiplyByLength;

    @BeforeEach
    public void setup(){
        multiplyByLength = new MultiplyByLength();
    }

    @Test
    public void nothing(){

    }
    //Multiply by Length
//Create a function to multiply all of the values in an array by the amount of values in the given array.
//Examples
//MultiplyByLength([2, 3, 1, 0]) ➞ [8, 12, 4, 0]
//MultiplyByLength([4, 1, 1]) ➞ ([12, 3, 3])
//MultiplyByLength([1, 0, 3, 3, 7, 2, 1]) ➞  [7, 0, 21, 21, 49, 14, 7]
//MultiplyByLength([0]) ➞ ([0])
    @Test
    public void givenTwoThreeOneZero_returnsEightTwelveFourZero(){
        int[] multiplied = multiplyByLength.findMultiplyByLength(new int[]{2, 3, 1, 0});
        assertArrayEquals(new int[]{8, 12, 4, 0} , multiplied);
    }
}
