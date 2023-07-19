package com.improve10x.tdd.supriya.multiplybylengthtest;

import com.improve10x.tdd.supriya.multiplybylength.MultiplyByLength;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyByLengthTest {
    @Test
    public void givenTwoThreeOneZero_returnsEightTwelveFourZero(){
        MultiplyByLength multiplyByLength = new MultiplyByLength();
        int[] length = multiplyByLength.findStatus(new int[]{2,3,1,0});
        Assertions.assertArrayEquals(new int[]{8,12,4,0}, length);
    }

    @Test
    public void givenFourOneOne_returnsTwelveThreeThree(){
        MultiplyByLength multiplyByLength = new MultiplyByLength();
        int[] length = multiplyByLength.findStatus(new int[]{4,1,1});
        Assertions.assertArrayEquals(new int[]{12,3,3}, length);
    }
}
