package com.improve10x.tdd.supriya.arrayqustions;

import com.improve10x.tdd.supriya.arrayquestions.AppearsOnce;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppearsOnceTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnMinusOne(){
        AppearsOnce appearsOnce = new AppearsOnce();
        int singleElement = appearsOnce.find(null);
        Assertions.assertEquals(-1, singleElement);
    }
}
