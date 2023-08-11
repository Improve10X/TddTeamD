package com.improve10x.tdd.supriya.nextpermutationtest;

import com.improve10x.tdd.supriya.NextPermutation.NextPermutation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NextPermutationTest {
    @Test
    public void nothing(){}

    @Test
    public void given0_returns0(){
        NextPermutation nextPermutation = new NextPermutation();
        int[] permutation = nextPermutation.FindNextPermutation(new int[]{0});
        Assertions.assertArrayEquals(new int[]{0}, permutation);
    }

    @Test
    public void given1_returns0(){
        NextPermutation nextPermutation = new NextPermutation();
        int[] permutation = nextPermutation.FindNextPermutation(new int[]{0});
        Assertions.assertArrayEquals(new int[]{0}, permutation);
    }
}
