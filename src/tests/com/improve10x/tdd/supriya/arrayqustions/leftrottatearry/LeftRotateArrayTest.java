package com.improve10x.tdd.supriya.arrayqustions.leftrottatearry;

import com.improve10x.tdd.supriya.arrayquestions.leftrotatearray.LeftRotateArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftRotateArrayTest {
    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] array = leftRotateArray.find(null);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] array = leftRotateArray.find(new int[]{});
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void givenO_return0(){
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] array = leftRotateArray.find(new int[]{0});
        assertArrayEquals(new int[]{0}, array);
    }
}
