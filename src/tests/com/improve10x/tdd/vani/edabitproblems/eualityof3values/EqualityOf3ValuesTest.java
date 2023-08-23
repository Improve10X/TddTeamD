package com.improve10x.tdd.vani.edabitproblems.eualityof3values;

import com.improve10x.tdd.vani.edabitproblems.equalityof3values.EqualityOf3Values;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualityOf3ValuesTest {
    @Test
    public void nothing(){}

    @Test
    public void givenValues_returnsCounts(){
        EqualityOf3Values equalityOf3Values = new EqualityOf3Values();
        int values = equalityOf3Values.equal(3,4,3);
        assertEquals(2, values);
    }

    @Test
    public void givenValues_returnsCount(){
        EqualityOf3Values equalityOf3Values = new EqualityOf3Values();
        int values = equalityOf3Values.equal(1,1,1);
        assertEquals(3, values);
    }

    @Test
    public void givenValue_returnsCount(){
        EqualityOf3Values equalityOf3Values = new EqualityOf3Values();
        int values = equalityOf3Values.equal(3,4,1);
        assertEquals(0, values);
    }
}
