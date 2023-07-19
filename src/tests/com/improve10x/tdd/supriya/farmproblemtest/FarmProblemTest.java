package com.improve10x.tdd.supriya.farmproblemtest;

import com.improve10x.tdd.supriya.farmproblem.FarmProblem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FarmProblemTest {
    @Test
    public void givenTwoThreeFive_returnsThirtySix(){
        FarmProblem farmProblem = new FarmProblem();
        int farms = farmProblem.findCalculates(2,3,5);
        Assertions.assertEquals(36,farms);
    }

    @Test
    public void givenOneTwoThree_returnsTwentyTwo(){
        FarmProblem farmProblem = new FarmProblem();
        int farms = farmProblem.findCalculates(1,2,3);
        Assertions.assertEquals(22,farms);
    }

    @Test
    public void givenFiveTwoEight_returnsFifty(){
        FarmProblem farmProblem = new FarmProblem();
        int farms = farmProblem.findCalculates(5,2,8);
        Assertions.assertEquals(50,farms);
    }
}
