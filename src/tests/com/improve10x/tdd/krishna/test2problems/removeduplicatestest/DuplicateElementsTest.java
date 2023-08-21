package com.improve10x.tdd.krishna.test2problems.removeduplicatestest;

import com.improve10x.tdd.krishna.test2problems.removeduplicates.DuplicateElements;
import com.improve10x.tdd.supriya.arrayquestions.duplicateelement.DuplicateElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateElementsTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnsEmpty() {
        DuplicateElements duplicateElements = new DuplicateElements();
        int[] result = duplicateElements.removeDuplicateElements(null);
        assertArrayEquals(new int[]{}, result);
    }
}
