package com.improve10x.tdd.vani.howmanyds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//How Many D's Are There?
//        Create a function that counts how many D's are in a sentence.
//        Examples
//        countDs("My friend Dylan got distracted in school.") ➞ 4
//        countDs("Debris was scattered all over the yard.") ➞ 3
//        countDs("The rodents hibernated in their den.") ➞ 3


public class HowManyDsTest {

    @Test
    public void nothing(){}
    @Test
    public void givenNull_returns0(){
        HowManyDs howManyDs = new HowManyDs();
        int zero = howManyDs.countDs(null);
        assertEquals(0,zero);
    }
}
