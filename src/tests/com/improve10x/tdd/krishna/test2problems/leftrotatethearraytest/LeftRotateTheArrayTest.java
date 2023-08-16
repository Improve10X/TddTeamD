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

    @Test
    public void givenZeroOne_returnsOneZero(){
        int[] result = leftRotateTheArray.findLeftRotateArray(new int[]{0, 1});
        assertArrayEquals(new int[]{1, 0}, result);
    }

    @Test
    public void givenTwoOne_returnsOneTwo(){
        int[] result = leftRotateTheArray.findLeftRotateArray(new int[]{2, 1});
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void given123_returns231(){
        int[] result = leftRotateTheArray.findLeftRotateArray(new int[]{1, 2, 3});
        assertArrayEquals(new int[]{2, 3, 1}, result);
    }

    @Test
    public void given312_returns123(){
        int[] result = leftRotateTheArray.findLeftRotateArray(new int[]{3, 1, 2});
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void given1234_returns2341(){
        int[] result = leftRotateTheArray.findLeftRotateArray(new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{2, 3, 4, 1}, result);
    }
}
