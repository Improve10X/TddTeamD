package com.improve10x.tdd.krishna.practice.euclideanalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EuclideanAlgorithmTest {

    EuclideanAlgorithm euclideanAlgorithm;

    @BeforeEach
    public void setEuclideanAlgorithm(){
        euclideanAlgorithm = new EuclideanAlgorithm();
    }
    @Test
    public void nothing(){
    }
    @Test
    public void givenZeroZero_returnsZero(){
        int euclidean = euclideanAlgorithm.findEuclidean(0, 0);
        assertEquals(0, euclidean);
    }
    @Test
    public void givenOneZero_returnsZero(){
        int euclidean = euclideanAlgorithm.findEuclidean(1, 0);
        assertEquals(0, euclidean);
    }
}
