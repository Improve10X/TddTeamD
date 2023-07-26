package com.improve10x.tdd.vani.countspaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSpacesTest {
    CountSpaces countSpaces;

    @BeforeEach
    public void setUp() {
        countSpaces = new CountSpaces();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returns0() {
        int zero = countSpaces.findSpaces(null);
        assertEquals(0, zero);
    }
    @Test
    public void givenEmpty_returns0(){
        int zero = countSpaces.findSpaces("");
        assertEquals(0, zero);
    }
    @Test
    public void givena_returns0(){
        int zero = countSpaces.findSpaces("a");
        assertEquals(0, zero);
    }
    @Test
    public void givenA_returns0(){
        int zero = countSpaces.findSpaces("A");
        assertEquals(0, zero);
    }
    @Test
    public void givenab_returns0(){
        int zero = countSpaces.findSpaces("ab");
        assertEquals(0,zero);
    }
}
