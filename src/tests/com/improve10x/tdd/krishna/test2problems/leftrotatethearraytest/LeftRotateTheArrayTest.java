package com.improve10x.tdd.krishna.test2problems.leftrotatethearraytest;

import com.improve10x.tdd.krishna.test2problems.leftroratethearray.LeftRotateTheArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeftRotateTheArrayTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsEmpty(){
        LeftRotateTheArray leftRotateTheArray = new LeftRotateTheArray();
        int[] result = leftRotateTheArray.findLeftRotateArray(null);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenEmpty_returnsEmpty(){
        LeftRotateTheArray leftRotateTheArray = new LeftRotateTheArray();
        int[] result = leftRotateTheArray.findLeftRotateArray(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }
}
