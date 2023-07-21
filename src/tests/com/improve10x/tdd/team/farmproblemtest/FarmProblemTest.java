package com.improve10x.tdd.team.farmproblemtest;

import com.improve10x.tdd.team.farmproblem.FarmProblem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//The Farm Problem
//        In this challenge, a farmer is asking you to tell him how many legs can be counted among all his animals. The farmer breeds three species:
//
//        chickens = 2 legs
//        cows = 4 legs
//        pigs = 4 legs
//        The farmer has counted his animals and he gives you a subtotal for each species. You have to implement a function that returns the total number of legs of all the animals.
//
//        Examples
//        animals(2, 3, 5) ➞ 36
//
//        animals(1, 2, 3) ➞ 22
//
//        animals(5, 2, 8) ➞ 50

public class FarmProblemTest {
    @Test
    public void nothing(){
    }
    @Test
    public void givensTwoThreeFive_returnsThirtySix(){
        FarmProblem farmProblem = new FarmProblem();
        int animals = farmProblem.findCalculate(2,3,5);
        Assertions.assertEquals(36,animals);
    }
    @Test
    public void givensOneTwoThree_returnsTwentyTwo(){
        FarmProblem farmProblem = new FarmProblem();
        int animals = farmProblem.findCalculate(1,2,3);
        Assertions.assertEquals(22, animals);
    }
    @Test
    public void givenFiveTwoEight_returnsFifty(){
        FarmProblem farmProblem = new FarmProblem();
        int animals = farmProblem.findCalculate(5,2,8);
        Assertions.assertEquals(50,animals);
    }
}
