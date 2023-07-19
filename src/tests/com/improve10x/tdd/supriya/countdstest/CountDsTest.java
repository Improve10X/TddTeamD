package com.improve10x.tdd.supriya.countdstest;

import com.improve10x.tdd.supriya.countds.CountDs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountDsTest {
    @Test
    public void  givenTheRodentHibernatedInTheirDen(){
        CountDs countDs = new CountDs();
        int ds = countDs.countDs("The rodents hibernated in their den");
        Assertions.assertEquals(3, ds);
    }

    @Test
    public void  givenDebrisWasScatteredAllOverTheYard(){
        CountDs countDs = new CountDs();
        int ds = countDs.countDs("Debris was scattered all over the yard");
        Assertions.assertEquals(3, ds);
    }

    @Test
    public void  givenMyFriendDylanGotDistractedInSchool(){
        CountDs countDs = new CountDs();
        int ds = countDs.countDs("My friend Dylan got distracted in school");
        Assertions.assertEquals(4, ds);
    }
}
