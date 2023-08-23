package com.improve10x.tdd.krishna.test2problems.maxconsecutiveonestest;

import com.improve10x.tdd.krishna.test2problems.maxconsecutiveones.MaxConsecutiveOnes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsecutiveOnesTest {

    private MaxConsecutiveOnes maxConsecutiveOnes;

    @BeforeEach
    public void setup(){
        maxConsecutiveOnes = new MaxConsecutiveOnes();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_return0(){
        int max = maxConsecutiveOnes.findMaxOnes(null);
        assertEquals(0, max);
    }

    @Test
    public void givenEmpty_return0(){
        int max = maxConsecutiveOnes.findMaxOnes(new int[]{});
        assertEquals(0, max);
    }

    @Test
    public void given0_return0(){
        int max = maxConsecutiveOnes.findMaxOnes(new int[]{0});
        assertEquals(0, max);
    }
}
