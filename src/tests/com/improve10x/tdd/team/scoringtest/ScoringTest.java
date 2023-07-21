package com.improve10x.tdd.team.scoringtest;

import com.improve10x.tdd.team.scoring.Scoring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ScoringTest {

    @Test
    public void nothing(){

    }
    @Test
    public void givenNull_returnsAllZeros(){
        Scoring scoring = new Scoring();
        int[] allZeros = scoring.calculateScores(null);
        assertArrayEquals(new int[3], allZeros);
    }
    @Test
    public void givenEmpty_returnsAllZeros(){
        Scoring scoring = new Scoring();
        int[] allZeros = scoring.calculateScores("");
        assertArrayEquals(new int[3], allZeros);
    }
    @Test
    public void givenA_returnsOneZeroZero(){
        Scoring scoring = new Scoring();
        int[] onlyAScores = scoring.calculateScores("A");
        assertArrayEquals(new int[]{1, 0, 0}, onlyAScores);
    }
    @Test
    public void givenB_returnsZeroOneZero(){
        Scoring scoring = new Scoring();
        int[] onlyBScores = scoring.calculateScores("B");
        assertArrayEquals(new int[]{0, 1, 0}, onlyBScores);
    }
    @Test
    public void givenC_returnsZeroZeroOne(){
        Scoring scoring = new Scoring();
        int[] onlyCScores = scoring.calculateScores("C");
        assertArrayEquals(new int[]{0, 0, 1}, onlyCScores);
    }
    @Test
    public void givenAB_returnsOneOneZero(){
        Scoring scoring = new Scoring();
        int[] onlyABScores = scoring.calculateScores("AB");
        assertArrayEquals(new int[]{1, 1, 0}, onlyABScores);
    }
    @Test
    public void givenABC_returnsOneOneOne(){
        Scoring scoring = new Scoring();
        int[] abcScores = scoring.calculateScores("ABC");
        assertArrayEquals(new int[]{1, 1, 1}, abcScores);
    }
    @Test
    public void givenAABC_returnsTwoOneOne(){
        Scoring scoring = new Scoring();
        int[] twoOneOne = scoring.calculateScores("AABC");
        assertArrayEquals(new int[]{2, 1, 1}, twoOneOne);
    }
    @Test
    public void givenABBC_returnsOneTwoOne(){
        Scoring scoring = new Scoring();
        int[] oneTwoOne = scoring.calculateScores("ABBC");
        assertArrayEquals(new int[]{1, 2, 1}, oneTwoOne);
    }
    @Test
    public void givenABCC_returnsOneOneTwo(){
        Scoring scoring = new Scoring();
        int[] abccScores = scoring.calculateScores("ABCC");
        assertArrayEquals(new int[]{1, 1, 2}, abccScores);
    }
    @Test
    public void givenABBACCCCAC_returnsThreeTwoFive(){
        Scoring scoring = new Scoring();
        int[] abbaccccacScores = scoring.calculateScores("ABBACCCCAC");
        assertArrayEquals(new int[]{3, 2, 5}, abbaccccacScores);
    }
}
