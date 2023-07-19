package com.improve10x.tdd.vani.howmanydsarethere;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowManyDsAreThereTest {
    HowManyDsAreThere howManyDsAreThere;

    @BeforeEach
    public void setUp(){
        howManyDsAreThere = new HowManyDsAreThere();
    }
    @Test
    public void nothing(){}

    @Test
    public void givenString_returnsValue(){
        int dsThere = howManyDsAreThere.countDs("My friend Dylan got distracted in school.");
        assertEquals(4,dsThere);
    }

    @Test
    public void givenStrings_returnsValue(){
        int dsThere = howManyDsAreThere.countDs("Debris was scattered all over the yard.");
        assertEquals(3,dsThere);
    }

    @Test
    public void givenString_returnsValues(){
        int dsThere = howManyDsAreThere.countDs("The rodents hibernated in their den.");
        assertEquals(3,dsThere);
    }
}
