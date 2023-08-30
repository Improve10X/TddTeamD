package com.improve10x.tdd.supriya.arrayqustions;

import com.improve10x.tdd.supriya.arrayquestions.moveszerostoend.MovesZerosToEnd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovesZerosToEndTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        MovesZerosToEnd movesZerosToEnd = new MovesZerosToEnd();
        int[] zeros = movesZerosToEnd.find(null);
        Assertions.assertArrayEquals(new int[]{}, zeros);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        MovesZerosToEnd movesZerosToEnd = new MovesZerosToEnd();
        int[] zeros = movesZerosToEnd.find(new int[]{});
        Assertions.assertArrayEquals(new int[]{}, zeros);
    }
    @Test
    public void given0_return0(){
        MovesZerosToEnd movesZerosToEnd = new MovesZerosToEnd();
        int[] zeros = movesZerosToEnd.find(new int[]{0});
        Assertions.assertArrayEquals(new int[]{0}, zeros);
    }

    @Test
    public void given01_return10(){
        MovesZerosToEnd movesZerosToEnd = new MovesZerosToEnd();
        int[] zeros = movesZerosToEnd.find(new int[]{0,1});
        Assertions.assertArrayEquals(new int[]{1,0}, zeros);
    }

    @Test
    public void given02_return20(){
        MovesZerosToEnd movesZerosToEnd = new MovesZerosToEnd();
        int[] zeros = movesZerosToEnd.find(new int[]{0,2});
        Assertions.assertArrayEquals(new int[]{2,0}, zeros);
    }

}
