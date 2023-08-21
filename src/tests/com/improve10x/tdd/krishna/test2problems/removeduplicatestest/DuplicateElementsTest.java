package com.improve10x.tdd.krishna.test2problems.removeduplicatestest;

import com.improve10x.tdd.krishna.test2problems.removeduplicates.DuplicateElements;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateElementsTest {

   private DuplicateElements duplicateElements;

   @BeforeEach
   public void setup(){
       duplicateElements = new DuplicateElements();
   }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnsEmpty() {
        int[] result = duplicateElements.removeDuplicateElements(null);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenEmpty_returnsEmpty() {
        int[] result = duplicateElements.removeDuplicateElements(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void given0_returns0() {
        int[] result = duplicateElements.removeDuplicateElements(new int[]{0});
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void given1_returns1() {
        int[] result = duplicateElements.removeDuplicateElements(new int[]{1});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void given00_returns0() {
        int[] result = duplicateElements.removeDuplicateElements(new int[]{0, 0});
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void given01_returns01() {
        int[] result = duplicateElements.removeDuplicateElements(new int[]{0, 1});
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void given21_returns12() {
        int[] result = duplicateElements.removeDuplicateElements(new int[]{2, 1});
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void given111_returns1() {
        int[] result = duplicateElements.removeDuplicateElements(new int[]{1, 1, 1});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void given112_returns12() {
        int[] result = duplicateElements.removeDuplicateElements(new int[]{1, 1, 2});
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void given211_returns12() {
        int[] result = duplicateElements.removeDuplicateElements(new int[]{2, 1, 1});
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void given121_returns12() {
        int[] result = duplicateElements.removeDuplicateElements(new int[]{1, 2, 1});
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void given123_returns123() {
        int[] result = duplicateElements.removeDuplicateElements(new int[]{1, 2, 3});
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void given1111_returns1() {
        int[] result = duplicateElements.removeDuplicateElements(new int[]{1, 1, 1, 1});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void given1123_returns1() {
        int[] result = duplicateElements.removeDuplicateElements(new int[]{1, 1, 2, 3});
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }
}
