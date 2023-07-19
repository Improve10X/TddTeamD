package com.improve10x.tdd.supriya.scoringtest;

import com.improve10x.tdd.supriya.scoringSystem.Scoring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ScoringTest {
   public Scoring scoring;

    @BeforeEach
    public void setUp(){
        scoring = new Scoring();

    }
    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnsAllZeros(){
        int[] allZeros = scoring.calculates(null);
        assertArrayEquals(new int[3],allZeros);
    }

    @Test
    public void givenEmpty_returnsAllZeros(){
        int[] allZeros = scoring.calculates("");
        assertArrayEquals(new int[3],allZeros);
    }


    @Test
    public void givenA_returnsOneZeroZero(){
        int[] onlyAScores = scoring.calculates("A");
        assertArrayEquals(new int[]{1,0,0},onlyAScores);
    }

    @Test
    public void givenB_returnsZeroOneZero(){
        int[] onlyBScores = scoring.calculates("B");
        assertArrayEquals(new int[]{0,1,0},onlyBScores);
    }

    @Test
    public void givenC_returnsZerZeroOne(){
        int[] onlyCScores = scoring.calculates("C");
        assertArrayEquals(new int[]{0,0,1},onlyCScores);
    }

    @Test
    public void givenAB_returnsOneOneZero(){
        int[] abScores = scoring.calculates("AB");
        assertArrayEquals(new int[]{1,1,0},abScores);
    }

    @Test
    public void givenABC_returnsAllOnes(){
        int[] abcScores = scoring.calculates("ABC");
        assertArrayEquals(new int[]{1,1,1},abcScores);
    }

    @Test
    public void givenAABC_returnsTwoOneOne(){
        int[] aabcScores = scoring.calculates("AABC");
        assertArrayEquals(new int[]{2,1,1},aabcScores);
    }

    @Test
    public void givenABBC_returnsOneTwoOne(){
        int[]abbcScores = scoring.calculates("ABBC");
        assertArrayEquals(new int[]{1,2,1}, abbcScores);
    }

    @Test
    public void givenABCC_returnsOneTwoOne(){
        int[]abccScores = scoring.calculates("ABCC");
        assertArrayEquals(new int[]{1,1,2}, abccScores);
    }

    @Test
    public void givenABBACCCCAC_returnsThreeTwoFive(){
        int[]abbaccccacScores = scoring.calculates("ABBACCCCAC");
        assertArrayEquals(new int[]{3,2,5},abbaccccacScores);

    }

}
