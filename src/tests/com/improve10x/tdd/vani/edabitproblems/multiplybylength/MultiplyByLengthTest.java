package com.improve10x.tdd.vani.edabitproblems.multiplybylength;

import com.improve10x.tdd.vani.edabitproblems.multiplybylength.MultiplyByLength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MultiplyByLengthTest {
    MultiplyByLength multiplyByLength;

    @BeforeEach
    public void setUp(){
        multiplyByLength = new MultiplyByLength();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenValues_returnsMultiplyByLength() {
        int[] array = multiplyByLength.multiplyLength(new int[]{2, 3, 1, 0});
        assertArrayEquals(new int[]{8, 12, 4, 0}, array);
//        System.out.println(Arrays.toString(array));
    }

    @Test
    public void givenFourOneOne_returnsTwelveThreeThree(){
        int[] array = multiplyByLength.multiplyLength(new int[]{4,1,1});
        assertArrayEquals(new int[]{12,3,3}, array);
    }

    @Test
    public void givenNumbers_returnsMultiplyLength(){
        int[] array = multiplyByLength.multiplyLength(new int[]{1,0,3,3,7,2,1});
        assertArrayEquals(new int[]{7,0,21,21,49,14,7}, array);
    }

    @Test
    public void givenNumber_returnsMultiplyLength(){
        int[] array = multiplyByLength.multiplyLength(new int[]{0});
        assertArrayEquals(new int[]{0}, array);
    }
}
