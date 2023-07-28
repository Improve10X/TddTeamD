package com.improve10x.tdd.vani.palindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTestOne {
    PalindromeOne palindromeOne;
    @BeforeEach
    public void setUp(){
        palindromeOne = new PalindromeOne();
    }
    @Test
    public void nothing(){}
    @Test
    public void givenNull_returnsFalse(){
       boolean statement = palindromeOne.isPalindromeTest(null);
       assertEquals(false, statement);
    }
    @Test
    public void givenEmpty_returnsTrue(){
        boolean statement = palindromeOne.isPalindromeTest("");
        assertEquals(true,statement);
    }
    @Test
    public void givenS_returnsTrue(){
        boolean statement = palindromeOne.isPalindromeTest("s");
        assertEquals(true,statement);
    }
    @Test
    public void givenSk_returnsFalse(){
        boolean statement = palindromeOne.isPalindromeTest("sk");
        assertEquals(false,statement);
    }
    @Test
    public void givenAa_returnsTrue(){
        boolean statement = palindromeOne.isPalindromeTest("aa");
        assertEquals(true,statement);
    }
    @Test
    public void givenLevel_returnsTrue(){
        boolean statement = palindromeOne.isPalindromeTest("level");
        assertEquals(true,statement);
    }
    @Test
    public void givenMadam_returnsTrue(){
        boolean statement = palindromeOne.isPalindromeTest("madam");
        assertEquals(true,statement);
    }
    @Test
    public void givenNotAPalindrome_returnsFalse(){
        boolean statement = palindromeOne.isPalindromeTest("not a palindrome");
        assertEquals(false,statement);
    }

}
