package com.improve10x.tdd.krishna.test2problems.leftrotatethearraytest;

import com.improve10x.tdd.krishna.test2problems.leftroratethearray.LeftRotateTheArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeftRotateTheArrayTest {

    private LeftRotateTheArray leftRotateTheArray;

    @BeforeEach
    public void setup(){
        leftRotateTheArray = new LeftRotateTheArray();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsEmpty(){
        int[] result = leftRotateTheArray.findLeftRotateArray(null);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenEmpty_returnsEmpty(){
        int[] result = leftRotateTheArray.findLeftRotateArray(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenZero_returnsZero(){
        int[] result = leftRotateTheArray.findLeftRotateArray(new int[]{0});
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void givenOne_returnsOne(){
        int[] result = leftRotateTheArray.findLeftRotateArray(new int[]{1});
        assertArrayEquals(new int[]{1}, result);
    }
}
