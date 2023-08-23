package com.improve10x.tdd.supriya.arrayqustions.countMaximum;

import com.improve10x.tdd.supriya.arrayquestions.countmaximum.CountMaximumConsecutiveOnes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountMaximumConsecutiveOnesTest {
    CountMaximumConsecutiveOnes countMaximumConsecutiveOnes;
    @BeforeEach
    public void setUp(){
        countMaximumConsecutiveOnes = new CountMaximumConsecutiveOnes();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnsZero(){
        int count = countMaximumConsecutiveOnes.find(null);
        Assertions.assertEquals(0, count);
    }

    @Test
    public void givenEmpty_returnsZero(){
        int count = countMaximumConsecutiveOnes.find(new int[]{});
        Assertions.assertEquals(0, count);
    }

    @Test
    public void givenZero_returnsZero(){
        int count = countMaximumConsecutiveOnes.find(new int[]{0});
        Assertions.assertEquals(0, count);
    }
    @Test
    public void given1_returns1(){
        int count = countMaximumConsecutiveOnes.find(new int[]{1});
        Assertions.assertEquals(1, count);
    }

    @Test
    public void given11_returns2(){
        int count = countMaximumConsecutiveOnes.find(new int[]{1,1});
        Assertions.assertEquals(2, count);
    }

    @Test
    public void given101_returns1(){
        int count = countMaximumConsecutiveOnes.find(new int[]{1,0,1});
        Assertions.assertEquals(1, count);
    }
    @Test
    public void given1011_returns2(){
        int count = countMaximumConsecutiveOnes.find(new int[]{1,0,1,1});
        Assertions.assertEquals(2, count);
    }

    @Test
    public void given10111_returns3(){
        int count = countMaximumConsecutiveOnes.find(new int[]{1,0,1,1,1});
        Assertions.assertEquals(3, count);
    }

    @Test
    public void given110111_returns3(){
        int count = countMaximumConsecutiveOnes.find(new int[]{1,1,0,1,1,1});
        Assertions.assertEquals(3, count);
    }

    @Test
    public void given11101_returns3(){
        int count = countMaximumConsecutiveOnes.find(new int[]{1,1,1,0,1});
        Assertions.assertEquals(3, count);
    }
}
