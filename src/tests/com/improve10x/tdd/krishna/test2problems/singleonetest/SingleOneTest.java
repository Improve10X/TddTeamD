package com.improve10x.tdd.krishna.test2problems.singleonetest;

import com.improve10x.tdd.krishna.test2problems.singleone.SingleOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleOneTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsMinusOne(){
        SingleOne singleOne = new SingleOne();
        int result = singleOne.findSingle(null);
        assertEquals(-1, result);
    }
}
