package com.improve10x.tdd.vani.alphabets;

import com.improve10x.tdd.vani.edabitproblems.alphabets.Alphabets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlphabetsTest {
    Alphabets alphabets;
    @BeforeEach
    public void setUp(){
        alphabets = new Alphabets();
    }
    @Test
    public void nothing(){}
    @Test
    public void givenEmpty_returnsEmpty(){
        String empty = alphabets.findVowelsOrConsonents("");
        assertEquals("", empty);
    }
    @Test
    public void givenA_returnsVowels(){
        String vowel = alphabets.findVowelsOrConsonents("a");
        assertEquals("vowels",vowel);
    }
    @Test
    public void givenE_returnsVowels(){
        String vowel = alphabets.findVowelsOrConsonents("e");
        assertEquals("vowels",vowel);
    }
    @Test
    public void givenI_returnsVowels(){
        String vowel = alphabets.findVowelsOrConsonents("i");
        assertEquals("vowels",vowel);
    }
    @Test
    public void givenO_returnsVowels(){
        String vowel = alphabets.findVowelsOrConsonents("o");
        assertEquals("vowels",vowel);
    }
    @Test
    public void givenU_returnsVowels(){
        String vowel = alphabets.findVowelsOrConsonents("u");
        assertEquals("vowels",vowel);
    }
    @Test
    public void givenB_returnsConsonents(){
        String vowel = alphabets.findVowelsOrConsonents("b");
        assertEquals("consonents",vowel);
    }
    @Test
    public void givenZ_returnsConsonents(){
        String vowel = alphabets.findVowelsOrConsonents("z");
        assertEquals("consonents",vowel);
    }
    @Test
    public void givenY_returnsConsonents(){
        String vowel = alphabets.findVowelsOrConsonents("y");
        assertEquals("consonents",vowel);
    }
}
