package com.improve10x.tdd.krishna.practice.vowelorconsonanttest;

import com.improve10x.tdd.krishna.practice.vowelorconsonant.VowelOrConsonant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelOrConsonantTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givennull_returnsnull(){
        VowelOrConsonant vowelOrConsonant = new VowelOrConsonant();
        String result = vowelOrConsonant.isVowelOrConsonant(null);
        assertEquals(null, result);
    }
}
