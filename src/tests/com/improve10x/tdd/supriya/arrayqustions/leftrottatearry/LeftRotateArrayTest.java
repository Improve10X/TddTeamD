package com.improve10x.tdd.supriya.arrayqustions.leftrottatearry;

import com.improve10x.tdd.supriya.arrayquestions.leftrotatearray.LeftRotateArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
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

    @Test
    public void given12_return21(){
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] array = leftRotateArray.find(new int[]{1, 2});
        assertArrayEquals(new int[]{2, 1}, array);
    }

    @Test
    public void given32_return23(){
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] array = leftRotateArray.find(new int[]{3,2});
        assertArrayEquals(new int[]{2,3}, array);
    }

    @Test
    public void given123_return231(){
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] array = leftRotateArray.find(new int[]{1,2,3});
        assertArrayEquals(new int[]{2,3,1}, array);
    }

    @Test
    public void given321_return213(){
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] array = leftRotateArray.find(new int[]{3,2,1});
        assertArrayEquals(new int[]{2,1,3}, array);
    }

    @Test
    public void given542_return425(){
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] array = leftRotateArray.find(new int[]{5,4,2});
        assertArrayEquals(new int[]{4,2,5}, array);
    }
    
    @Test
    public void given1234_return2341(){
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] array = leftRotateArray.find(new int[]{1,2,3,4});
        assertArrayEquals(new int[]{2,3,4,1}, array);
    }
}
