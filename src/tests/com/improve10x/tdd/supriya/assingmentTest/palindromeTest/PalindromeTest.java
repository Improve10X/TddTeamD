package com.improve10x.tdd.supriya.assingmentTest.palindromeTest;

import com.improve10x.tdd.supriya.assingment.palidrome.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    Palindrome palindrome;
    @BeforeEach
    public void setUp(){
        palindrome = new Palindrome();

    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnsFalse() {
        boolean status = palindrome.findStatus(null);
        Assertions.assertEquals(false, status);
    }

    @Test
    public void givenEmpty_returnsTrue() {
        boolean status = palindrome.findStatus("");
        Assertions.assertEquals(true, status);
    }

    @Test
    public void givenA_returnsTrue() {
        boolean status = palindrome.findStatus("A");
        Assertions.assertEquals(true, status);
    }

    @Test
    public void givenAA_returnsTrue() {
        boolean status = palindrome.findStatus("AA");
        Assertions.assertEquals(true, status);
    }

    @Test
    public void givenAB_returnsTrue() {
        boolean status = palindrome.findStatus("AB");
        Assertions.assertEquals(false, status);
    }

    @Test
    public void givenPencil_returnsTrue() {
        boolean status = palindrome.findStatus("pencil");
        Assertions.assertEquals(false, status);
    }

    @Test
    public void givenLevel_returnsTrue() {
        boolean status = palindrome.findStatus("level");
        Assertions.assertEquals(true, status);
    }

    @Test
    public void givenMadam_returnsTrue() {
        boolean status = palindrome.findStatus("madam");
        Assertions.assertEquals(true, status);
    }
}
