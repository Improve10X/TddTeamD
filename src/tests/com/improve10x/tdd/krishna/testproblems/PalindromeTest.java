package com.improve10x.tdd.krishna.testproblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {

    Palindrome palindrome;

    @BeforeEach
    public void setup(){
        palindrome = new Palindrome();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsTrue(){
        boolean result = palindrome.isPalindrome(null);
        assertEquals(true, result);
    }

    @Test
    public void givenString_returnsTrue(){
        boolean result = palindrome.isPalindrome("");
        assertEquals(true, result);
    }

    @Test
    public void givenEmptyString_returnsTrue(){
        boolean result = palindrome.isPalindrome(" ");
        assertEquals(true, result);
    }
}
