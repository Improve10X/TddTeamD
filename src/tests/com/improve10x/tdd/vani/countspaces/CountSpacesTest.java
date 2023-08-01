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
    public void nothing() {}

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
    @Test
    public void givenAB_returns0(){
        int zero = countSpaces.findSpaces("AB");
        assertEquals(0,zero);
    }
    @Test
    public void givenAb_returns0(){
        int zero = countSpaces.findSpaces("Ab");
        assertEquals(0, zero);
    }
    @Test
    public void givenName_returns0(){
        int zero = countSpaces.findSpaces("vani");
        assertEquals(0,zero);
    }
    @Test
    public void givenName_returns1(){
        int one = countSpaces.findSpaces("improve 10x");
        assertEquals(1,one);
    }
    @Test
    public void givenname_returns1(){
        int one = countSpaces.findSpaces("Ammulu ");
        assertEquals(1,one);
    }
    @Test
    public void givenWord_returns1(){
        int one = countSpaces.findSpaces(" Ammulu");
        assertEquals(1,one);
    }
    @Test
    public void givenWord_returns2(){
        int two = countSpaces.findSpaces("mummy  ");
        assertEquals(2,two);
    }
    @Test
    public void givenNames_returns2(){
        int two = countSpaces.findSpaces("  mummy");
        assertEquals(2,two);
    }
    @Test
    public void givenFamily_returns2(){
        int two = countSpaces.findSpaces("mom daughter dad");
        assertEquals(2,two);
    }
    @Test
    public void givenSentence_returns3(){
        int three = countSpaces.findSpaces("my mom is cooking");
        assertEquals(3,three);
    }
    @Test
    public void givenLine_returns3(){
        int three = countSpaces.findSpaces("this is my laptop");
        assertEquals(3,three);
    }
}
