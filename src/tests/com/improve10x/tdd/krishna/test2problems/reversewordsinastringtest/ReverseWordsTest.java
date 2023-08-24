package com.improve10x.tdd.krishna.test2problems.reversewordsinastringtest;

import com.improve10x.tdd.krishna.test2problems.reversewordsinastring.ReverseWords;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsTest {

    private  ReverseWords reverseWords;

    @BeforeEach
    public void setup(){
        reverseWords = new ReverseWords();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenNull_returnsEmpty(){
        String reversed = reverseWords.findReverse(null);
        assertEquals("", reversed);
    }

    @Test
    public void givenEmpty_returnsEmpty(){
        String reversed = reverseWords.findReverse("");
        assertEquals("", reversed);
    }

    @Test
    public void givenA_returnsA(){
        String reversed = reverseWords.findReverse("A");
        assertEquals("A", reversed);
    }

    @Test
    public void givenIs_returnsIs(){
        String reversed = reverseWords.findReverse("Is");
        assertEquals("Is", reversed);
    }

    @Test
    public void givenAndOr_returnsOrAnd(){
        String reversed = reverseWords.findReverse("And Or");
        assertEquals("Or And", reversed);
    }

    @Test
    public void givenAndOrNot_returnsNotOrAnd(){
        String reversed = reverseWords.findReverse("And Or Not");
        assertEquals("Not Or And", reversed);
    }

    @Test
    public void givenComedianVillainHeroineHero_returnsHeroHeroineVillainComedian(){
        String reversed = reverseWords.findReverse("Comedian Villain Heroine Hero");
        assertEquals("Hero Heroine Villain Comedian", reversed);
    }

    @Test
    public void givenHeIsInHome_returnsHomeInIsHe(){
        String reversed = reverseWords.findReverse("He Is In Home");
        assertEquals("Home In Is He", reversed);
    }
}
