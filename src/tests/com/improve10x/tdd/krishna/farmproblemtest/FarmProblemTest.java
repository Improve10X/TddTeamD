package com.improve10x.tdd.krishna.farmproblemtest;

import com.improve10x.tdd.krishna.farmproblem.FarmProblem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmProblemTest {

    FarmProblem farmProblem;

    @BeforeEach
    public void setup(){
        farmProblem = new FarmProblem();
    }

    @Test
    public void nothing(){

    }

//The Farm Problem
//In this challenge, a farmer is asking you to tell him how many legs can be counted among all his animals. The farmer breeds three species:
//chickens = 2 legs
//cows = 4 legs
//pigs = 4 legs
//The farmer has counted his animals and he gives you a subtotal for each species. You have to implement a function that returns the total number of legs of all the animals.
//Examples
//animals(2, 3, 5) ➞ 36
//animals(1, 2, 3) ➞ 22
//animals(5, 2, 8) ➞ 50


    @Test
    public void givenTwoThreeFive_returnsThreeSix(){
        int result = farmProblem.findFarmProblem(2, 3, 5);
        assertEquals(36, result);
    }

    @Test
    public void givenOneTwoThree_returnsTwoTwo(){
        int result = farmProblem.findFarmProblem(1, 2, 3);
        assertEquals(22, result);
    }

    @Test
    public void givenFiveTwoEight_returnsFiveZer0(){
        int result = farmProblem.findFarmProblem(5, 2, 8);
        assertEquals(50, result);
    }
}
