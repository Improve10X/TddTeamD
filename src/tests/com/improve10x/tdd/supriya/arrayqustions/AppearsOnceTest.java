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

    @Test
    public void givenEmpty_returnMinusOne(){
        AppearsOnce appearsOnce = new AppearsOnce();
        int singleElement = appearsOnce.find(new int[]{});
        Assertions.assertEquals(-1, singleElement);
    }

    @Test
    public void given0_return0(){
        AppearsOnce appearsOnce = new AppearsOnce();
        int singleElement = appearsOnce.find(new int[]{0});
        Assertions.assertEquals(0, singleElement);
    }

    @Test
    public void given1_return1(){
        AppearsOnce appearsOnce = new AppearsOnce();
        int singleElement = appearsOnce.find(new int[]{1});
        Assertions.assertEquals(1, singleElement);
    }

    @Test
    public void given001_return1(){
        AppearsOnce appearsOnce = new AppearsOnce();
        int singleElement = appearsOnce.find(new int[]{0,0,1});
        Assertions.assertEquals(1, singleElement);
    }
}
