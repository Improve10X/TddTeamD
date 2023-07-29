package com.improve10x.tdd.vani.howmanyds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//How Many D's Are There?
//        Create a function that counts how many D's are in a sentence.
//        Examples
//        countDs("My friend Dylan got distracted in school.") ➞ 4
//        countDs("Debris was scattered all over the yard.") ➞ 3
//        countDs("The rodents hibernated in their den.") ➞ 3


public class HowManyDsTest {
    HowManyDs howManyDs;
    @BeforeEach
    public void setUp(){
        howManyDs = new HowManyDs();
    }
    @Test
    public void nothing(){}
    @Test
    public void givenNull_returns0(){
        int zero = howManyDs.countDs(null);
        assertEquals(0,zero);
    }
    @Test
    public void givenEmpty_returns0(){
        int zero = howManyDs.countDs("");
        assertEquals(0,zero);
    }
    @Test
    public void givenD_returns1(){
        int one = howManyDs.countDs("D");
        assertEquals(1,one);
    }
    @Test
    public void givend_returns1(){
        int one = howManyDs.countDs("d");
        assertEquals(1,one);
    }
    @Test
    public void givenDd_returns2(){
        int two = howManyDs.countDs("Dd");
        assertEquals(2,two);
    }
    @Test
    public void givenDdd_returns3(){
        int three = howManyDs.countDs("Ddd");
        assertEquals(3,three);
    }




}
