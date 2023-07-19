package com.improve10x.tdd.krishna.countdstest;

import com.improve10x.tdd.krishna.countds.CountDs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDsTest {

    CountDs countDs;

    @BeforeEach
    public void setup(){
        countDs = new CountDs();
    }
//How Many D's Are There?
//Create a function that counts how many D's are in a sentence.
//Examples
//countDs("My friend Dylan got distracted in school.") ➞ 4
//countDs("Debris was scattered all over the yard.") ➞ 3
//countDs("The rodents hibernated in their den.") ➞ 3

    @Test
    public void givenString_returnFour(){
        int numberOfDs = countDs.countDsAreThere("My friend Dylan got distracted in school.");
        assertEquals(4,numberOfDs);
    }


    @Test
    public void givenString_returnThree(){
        int numberOfDs = countDs.countDsAreThere("Debris was scattered all over the yard.");
        assertEquals(3,numberOfDs);
    }


    @Test
    public void givenSentence_returnThree(){
        int numberOfDs = countDs.countDsAreThere("The rodents hibernated in their den.");
        assertEquals(3,numberOfDs);
    }
}
