package com.improve10x.tdd.supriya.arrayqustions;

import com.improve10x.tdd.supriya.arrayquestions.moveszerostoend.MovesZerosToEnd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovesZerosToEndTest {
    MovesZerosToEnd movesZerosToEnd;
    @BeforeEach
    public void setUp(){
        movesZerosToEnd = new MovesZerosToEnd();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        int[] zeros = movesZerosToEnd.find(null);
        Assertions.assertArrayEquals(new int[]{}, zeros);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        int[] zeros = movesZerosToEnd.find(new int[]{});
        Assertions.assertArrayEquals(new int[]{}, zeros);
    }
    @Test
    public void given0_return0(){
        int[] zeros = movesZerosToEnd.find(new int[]{0});
        Assertions.assertArrayEquals(new int[]{0}, zeros);
    }

    @Test
    public void given01_return10(){
        int[] zeros = movesZerosToEnd.find(new int[]{0,1});
        Assertions.assertArrayEquals(new int[]{1,0}, zeros);
    }

    @Test
    public void given02_return20(){
        int[] zeros = movesZerosToEnd.find(new int[]{0,2});
        Assertions.assertArrayEquals(new int[]{2,0}, zeros);
    }
    @Test
    public void given012_return120(){
        int[] zeros = movesZerosToEnd.find(new int[]{0,1,2});
        Assertions.assertArrayEquals(new int[]{1,2,0}, zeros);
    }

    @Test
    public void given102_return120(){
        int[] zeros = movesZerosToEnd.find(new int[]{1,0,2});
        Assertions.assertArrayEquals(new int[]{1,2,0}, zeros);
    }
    @Test
    public void given120_return120(){
        int[] zeros = movesZerosToEnd.find(new int[]{1,2,0});
        Assertions.assertArrayEquals(new int[]{1,2,0}, zeros);
    }

    @Test
    public void given0123_return1230(){
        int[] zeros = movesZerosToEnd.find(new int[]{0,1,2,3});
        Assertions.assertArrayEquals(new int[]{1,2,3,0}, zeros);
    }

    @Test
    public void given1023_return1230(){
        int[] zeros = movesZerosToEnd.find(new int[]{1,0,2,3});
        Assertions.assertArrayEquals(new int[]{1,2,3,0}, zeros);
    }

    @Test
    public void given1203_return1230(){
        int[] zeros = movesZerosToEnd.find(new int[]{1,2,0,3});
        Assertions.assertArrayEquals(new int[]{1,2,3,0}, zeros);
    }
}
