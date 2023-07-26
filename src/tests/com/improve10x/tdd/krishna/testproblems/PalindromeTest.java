package com.improve10x.tdd.krishna.testproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsTrue(){
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome(null);
        assertEquals(true, result);
    }

    @Test
    public void givenString_returnsTrue(){
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("");
        assertEquals(true, result);
    }
}
