package com.improve10x.tdd.krishna.testproblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        assertTrue(result);
    }

    @Test
    public void givenString_returnsTrue(){
        boolean result = palindrome.isPalindrome("");
        assertTrue(result);
    }

    @Test
    public void givenEmptyString_returnsTrue(){
        boolean result = palindrome.isPalindrome(" ");
        assertTrue(result);
    }

    @Test
    public void givenZero_returnsTrue(){
        boolean result = palindrome.isPalindrome("0");
        assertTrue(result);
    }

    @Test
    public void givena_returnsTrue(){
        boolean result = palindrome.isPalindrome("a");
        assertTrue(result);
    }

    @Test
    public void givenA_returnsTrue(){
        boolean result = palindrome.isPalindrome("A");
        assertTrue(result);
    }

    @Test
    public void givenD_returnsTrue(){
        boolean result = palindrome.isPalindrome("D");
        assertTrue(result);
    }
}
