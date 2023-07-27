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
}
