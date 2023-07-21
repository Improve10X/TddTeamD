package com.improve10x.tdd.team.scoringtest;

import com.improve10x.tdd.team.scoring.Scoring;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
        int[] oneZeroZero = scoring.calculateScores("A");
        assertArrayEquals(new int[]{1, 0, 0}, oneZeroZero);
    }
    @Test
    public void givenB_returnsZeroOneZero(){
        Scoring scoring = new Scoring();
        int[] zeroOneZero = scoring.calculateScores("B");
        assertArrayEquals(new int[]{0, 1, 0}, zeroOneZero);
    }
    @Test
    public void givenC_returnsZeroZeroOne(){
        Scoring scoring = new Scoring();
        int[] zeroZeroOne = scoring.calculateScores("C");
        assertArrayEquals(new int[]{0, 0, 1}, zeroZeroOne);
    }
    @Test
    public void givenAB_returnsOneOneZero(){
        Scoring scoring = new Scoring();
        int[] oneOneZero = scoring.calculateScores("AB");
        assertArrayEquals(new int[]{1, 1, 0}, oneOneZero);
    }
    @Test
    public void givenABC_returnsOneOneOne(){
        Scoring scoring = new Scoring();
        int[] oneOneOne = scoring.calculateScores("ABC");
        assertArrayEquals(new int[]{1, 1, 1}, oneOneOne);
    }
    @Test
    public void givenAABC_returnsTwoOneOne(){
        Scoring scoring = new Scoring();
        int[] twoOneOne = scoring.calculateScores("AABC");
        assertArrayEquals(new int[]{2, 1, 1}, twoOneOne);
    }
}
