package com.improve10x.tdd.krishna.practice.vowelorconsonanttest;

import com.improve10x.tdd.krishna.practice.vowelorconsonant.VowelOrConsonant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class VowelOrConsonantTest {
    VowelOrConsonant vowelOrConsonant;
    @BeforeEach
    public void setup(){
       vowelOrConsonant = new VowelOrConsonant();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givennull_returnsnull(){
        String result = vowelOrConsonant.isVowelOrConsonant(null);
        assertNull(result);
    }

    @Test
    public void givenString_returnsString(){
        String result = vowelOrConsonant.isVowelOrConsonant("");
        assertEquals("", result);
    }

    @Test
    public void givenEmpty_returnsEmpty(){
        String result = vowelOrConsonant.isVowelOrConsonant(" ");
        assertEquals( " ", result);
    }
    
    @Test
    public void givenb_returnsconsonant(){
        String result = vowelOrConsonant.isVowelOrConsonant("b");
        assertEquals( "consonant", result);
    }

    @Test
    public void givena_returnsvowel(){
        String result = vowelOrConsonant.isVowelOrConsonant("a");
        assertEquals( "vowel", result);
    }

    @Test
    public void givene_returnsvowel(){
        String result = vowelOrConsonant.isVowelOrConsonant("e");
        assertEquals( "vowel", result);
    }

    @Test
    public void giveni_returnsvowel(){
        String result = vowelOrConsonant.isVowelOrConsonant("i");
        assertEquals( "vowel", result);
    }

    @Test
    public void giveno_returnsvowel(){
        String result = vowelOrConsonant.isVowelOrConsonant("o");
        assertEquals( "vowel", result);
    }

    @Test
    public void givenu_returnsvowel(){
        String result = vowelOrConsonant.isVowelOrConsonant("u");
        assertEquals( "vowel", result);
    }

    @Test
    public void givenf_returnsconsonant(){
        String result = vowelOrConsonant.isVowelOrConsonant("f");
        assertEquals( "consonant", result);
    }

    @Test
    public void giveng_returnsconsonant(){
        String result = vowelOrConsonant.isVowelOrConsonant("g");
        assertEquals( "consonant", result);
    }
}
