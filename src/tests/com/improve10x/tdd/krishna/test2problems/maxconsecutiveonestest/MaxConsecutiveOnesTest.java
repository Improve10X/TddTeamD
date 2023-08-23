package com.improve10x.tdd.krishna.test2problems.maxconsecutiveonestest;

import com.improve10x.tdd.krishna.test2problems.maxconsecutiveones.MaxConsecutiveOnes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsecutiveOnesTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_return0(){
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int max = maxConsecutiveOnes.findMaxOnes(null);
        assertEquals(0, max);
    }
}
