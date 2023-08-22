package com.improve10x.tdd.supriya.arrayqustions.countMaximum;

import com.improve10x.tdd.supriya.arrayquestions.countmaximum.CountMaximumConsecutiveOnes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountMaximumConsecutiveOnesTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnsZero(){
        CountMaximumConsecutiveOnes countMaximumConsecutiveOnes = new CountMaximumConsecutiveOnes();
        int count = countMaximumConsecutiveOnes.find(null);
        Assertions.assertEquals(0, count);
    }

    @Test
    public void givenEmpty_returnsZero(){
        CountMaximumConsecutiveOnes countMaximumConsecutiveOnes = new CountMaximumConsecutiveOnes();
        int count = countMaximumConsecutiveOnes.find(new int[]{});
        Assertions.assertEquals(0, count);
    }

    @Test
    public void givenZero_returnsZero(){
        CountMaximumConsecutiveOnes countMaximumConsecutiveOnes = new CountMaximumConsecutiveOnes();
        int count = countMaximumConsecutiveOnes.find(new int[]{0});
        Assertions.assertEquals(0, count);
    }

}
