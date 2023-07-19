package com.improve10x.tdd.supriya.equalityofthreetest;

import com.improve10x.tdd.supriya.equalityofthree.EqualityOfThree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualityOfThreeTest {
    @Test
    public void givenThreeFourThree_returnTwo(){
        EqualityOfThree equalityOfThree = new EqualityOfThree();
        int values = equalityOfThree.findValue(3, 4, 3);
        Assertions.assertEquals(2, values);
    }
}
