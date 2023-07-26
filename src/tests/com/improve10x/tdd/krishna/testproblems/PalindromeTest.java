package com.improve10x.tdd.krishna.testproblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void givenab_returnsFalse(){
        boolean result = palindrome.isPalindrome("ab");
        assertFalse(result);
    }

    @Test
    public void givenaa_returnsTrue(){
        boolean result = palindrome.isPalindrome("aa");
        assertTrue(result);
    }

    @Test
    public void givenCC_returnsTrue(){
        boolean result = palindrome.isPalindrome("CC");
        assertTrue(result);
    }

    @Test
    public void givencd_returnsFalse(){
        boolean result = palindrome.isPalindrome("cd");
        assertFalse(result);
    }

    @Test
    public void given12_returnsFalse(){
        boolean result = palindrome.isPalindrome("12");
        assertFalse(result);
    }

    @Test
    public void given11_returnsTrue(){
        boolean result = palindrome.isPalindrome("11");
        assertTrue(result);
    }

    @Test
    public void givenabc_returnsFalse(){
        boolean result = palindrome.isPalindrome("abc");
        assertFalse(result);
    }

    @Test
    public void givencac_returnsTrue(){
        boolean result = palindrome.isPalindrome("cac");
        assertTrue(result);
    }

    @Test
    public void givendid_returnsTrue(){
        boolean result = palindrome.isPalindrome("did");
        assertTrue(result);
    }

    @Test
    public void givenACA_returnsTrue(){
        boolean result = palindrome.isPalindrome("ACA");
        assertTrue(result);
    }

    @Test
    public void givenfour_returnsFalse(){
        boolean result = palindrome.isPalindrome("four");
        assertFalse(result);
    }
}
